package controllers;

import java.util.List;

import models.Ticket;
import models.User;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import service.TicketService;
import service.UserService;
import views.html.index;

import com.avaje.ebean.Page;

/**
 * The Class TicketController.
 */
@Security.Authenticated(Secured.class)
public class TicketController extends Controller {

	/**
	 * Index.
	 *
	 * @return the result
	 */
	public static Result index() {
		return ok(index.render("Your new application is ready."));
	}

	/**
	 * Dashboard.
	 *
	 * @param page the page
	 * @return the result
	 */
	public static Result dashboard(Integer page) {

		Page<Ticket> tickets = TicketService.findAllTicket(page);
		return ok(views.html.dashboard.render(tickets));
	}

	/**
	 * Ticket form.
	 *
	 * @return the result
	 */
	public static Result ticketForm() {
		return ok(views.html.add.render(Form.form(Ticket.class)));
	}

	/**
	 * Adds the ticket.
	 *
	 * @return the result
	 */
	public static Result addTicket() {
		Form<Ticket> ticket = Form.form(Ticket.class).bindFromRequest();
		System.out.println(ticket);
		User createdUser = new User();
		createdUser.setId(new Long(1));
		ticket.get().setCreatedUser(createdUser);
		TicketService.save(ticket.get());
		
		return TODO;
	}

	/**
	 * Details.
	 *
	 * @param id the id
	 * @return the result
	 */
	public static Result viewTicket(Long id) {
		Ticket ticket = TicketService.getTicket(id);
		System.out.println("ticket size "+ticket.getComments().size());
		Form<Ticket> ticketForm = Form.form(Ticket.class).fill(ticket);
		return ok(views.html.edit.render(ticketForm));
	}

	/**
	 * Delete.
	 *
	 * @param id the id
	 * @return the result
	 */
	public static Result updateTicket() {
		// Form<Product> filledForm = productForm.fill(product);
		return TODO;
	}

	public static Result autocomplete(String searchText, String lookupType) {
		
		List list= null;
		if (lookupType.equals("CUSTOMER")) {
			list = UserService.getCustomers(searchText);
		} else if (lookupType.equals("USER")) {
			list = UserService.getUsers(searchText);
		}
		
		return ok(Json.toJson(list));
	}
}
