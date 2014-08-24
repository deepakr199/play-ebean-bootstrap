package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import play.db.ebean.Model;

/**
 * The Class Comment.
 */
@Entity
@Table(name = "comment")
public class Comment extends Model {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5976852258704417352L;
	
	/** The id. */
	@Id
	@GeneratedValue
	@Column(name = "id")
	public Long id;

	/** The created date. */
	@Column(name = "create_dt_tm", insertable = true, updatable = false)
	public Date createdDate;

	/** The updated date. */
	@Column(name = "update_dt_tm", insertable = false, updatable = true)
	public Date updatedDate;
	
	/** The created User. */
	@ManyToOne
    @JoinColumn(name = "create_user_id", insertable = true, updatable = false)
	public User createdUser;

	/** The updated User. */
	@ManyToOne
    @JoinColumn(name = "update_user_id", insertable = false, updatable = true)
	public User updatedUser;
	
	/** The delete_flag. */
	@Column(name = "delete_flag")
	public boolean deleteFlag;

	/** The comment. */
	@Column(name = "comment")
	public String comment;
	
	/** The customer. */
	@ManyToOne
    @JoinColumn(name = "ticket_id")
	public Ticket ticket;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the created date.
	 *
	 * @return the created date
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * Sets the created date.
	 *
	 * @param createdDate the new created date
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Gets the updated date.
	 *
	 * @return the updated date
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * Sets the updated date.
	 *
	 * @param updatedDate the new updated date
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	/**
	 * Gets the created user.
	 *
	 * @return the created user
	 */
	public User getCreatedUser() {
		return createdUser;
	}

	/**
	 * Sets the created user.
	 *
	 * @param createdUser the new created user
	 */
	public void setCreatedUser(User createdUser) {
		this.createdUser = createdUser;
	}

	/**
	 * Gets the updated user.
	 *
	 * @return the updated user
	 */
	public User getUpdatedUser() {
		return updatedUser;
	}

	/**
	 * Sets the updated user.
	 *
	 * @param updatedUser the new updated user
	 */
	public void setUpdatedUser(User updatedUser) {
		this.updatedUser = updatedUser;
	}

	/**
	 * Checks if is delete flag.
	 *
	 * @return true, if is delete flag
	 */
	public boolean isDeleteFlag() {
		return deleteFlag;
	}

	/**
	 * Sets the delete flag.
	 *
	 * @param deleteFlag the new delete flag
	 */
	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	/**
	 * Gets the comment.
	 *
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * Sets the comment.
	 *
	 * @param comment the new comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * Gets the ticket.
	 *
	 * @return the ticket
	 */
	public Ticket getTicket() {
		return ticket;
	}

	/**
	 * Sets the ticket.
	 *
	 * @param ticket the new ticket
	 */
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

}
