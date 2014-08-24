package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import play.db.ebean.Model;

/**
 * The Class Ticket.
 */
@Entity
@Table(name = "ticket")
public class Ticket extends Model {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4631409202351129030L;

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

	/** The title. */
	@Column(name = "title")
	public String title;

	/** The customer. */
	@ManyToOne
	@JoinColumn(name = "reported_by_id")
	public Customer reportedBy;

	/** The assigned to. */
	@ManyToOne
	@JoinColumn(name = "assigned_to_id")
	public User assignedTo;

	/** The status. */
	@Column(name = "status")
	public String status;

	/** The comments. */
	@OneToMany(mappedBy = "ticket", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	public List<Comment> comments = new ArrayList<Comment>();


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
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the reported by.
	 *
	 * @return the reported by
	 */
	public Customer getReportedBy() {
		return reportedBy;
	}

	/**
	 * Sets the reported by.
	 *
	 * @param reportedBy the new reported by
	 */
	public void setReportedBy(Customer reportedBy) {
		this.reportedBy = reportedBy;
	}

	/**
	 * Gets the assigned to.
	 *
	 * @return the assigned to
	 */
	public User getAssignedTo() {
		return assignedTo;
	}

	/**
	 * Sets the assigned to.
	 *
	 * @param assignedTo the new assigned to
	 */
	public void setAssignedTo(User assignedTo) {
		this.assignedTo = assignedTo;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Gets the comments.
	 *
	 * @return the comments
	 */
	public List<Comment> getComments() {
		return comments;
	}

	/**
	 * Sets the comments.
	 *
	 * @param comments the new comments
	 */
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}


}
