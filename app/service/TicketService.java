package service;

import java.util.Date;

import models.Ticket;
import play.db.ebean.Transactional;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;

/**
 * The Class TicketService.
 */
public class TicketService {
	
	/**
	 * Find all ticket.
	 *
	 * @param page the page
	 * @return the page
	 */
	public static Page<Ticket> findAllTicket(Integer page) {
		return Ebean.find(Ticket.class).fetch("assignedTo", "firstName").fetch("createdUser", "firstName").fetch("reportedBy", "firstName").orderBy("id asc").findPagingList(10).getPage(page);
		}

	/**
	 * Save.
	 *
	 * @param ticket the ticket
	 */
	@Transactional
	public static void save(Ticket ticket) {
		// If ticket is not assigned, then set status to NEW
		if (ticket.getAssignedTo().getId() == null) {
			ticket.setAssignedTo(ticket.getCreatedUser());
			ticket.setStatus("NEW");
		} else {
			ticket.setStatus("OPEN");
		}
		
		// Saving Customer details
		if (ticket.getReportedBy().getId() == null) {
			ticket.getReportedBy().setCreatedUser(ticket.getCreatedUser());
			ticket.getReportedBy().setCreatedDate(new Date());
			Ebean.save(ticket.getReportedBy());
		}
		
		ticket.setCreatedDate(new Date());
		ticket.getComments().get(0).setCreatedDate(new Date());
		ticket.getComments().get(0).setCreatedUser(ticket.getCreatedUser());
		Ebean.save(ticket);
		
	}

	/**
	 * Gets the ticket.
	 *
	 * @param id the id
	 * @return the ticket
	 */
	public static Ticket getTicket(Long id) {
		
		return Ebean.find(Ticket.class, id);
	}

}
