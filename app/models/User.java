package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;

// TODO: Auto-generated Javadoc
/**
 * The Class User.
 */
@Entity
@Table(name = "users")
public class User extends Model {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1516305727733517047L;

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
	
	/** The delete_flag. */
	@Column(name = "delete_flag")
	public boolean deleteFlag;

	/** The first name. */
	@Column(name = "firstname")
	public String firstName;
	
	/** The last name. */
	@Column(name = "lastname")
	public String lastName;

	/** The email. */
	@Column(name = "email")
	public String email;
	
	/** The password. */
	@Column(name = "password")
	public String password;

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
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

