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
 * The Class Customer.
 */
@Entity
@Table(name = "customer")
public class Customer extends Model {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4709331329990203976L;
	
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

	/** The first name. */
	@Column(name = "firstname")
	public String firstName;
	
	/** The last name. */
	@Column(name = "lastname")
	public String lastName;
	
	/** The email. */
	@Column(name = "email")
	public String email;
	
	/** The phone. */
	@Column(name = "phone")
	public String phone;
	
	/** The address1. */
	@Column(name = "address1")
	public String address1;
	
	/** The address2. */
	@Column(name = "address2")
	public String address2;

	/** The city. */
	@Column(name = "city")
	public String city;
	
	/** The state. */
	@Column(name = "state")
	public String state;
	
	/** The zip. */
	@Column(name = "zip")
	public String zip;
	
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
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets the phone.
	 *
	 * @param phone the new phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Gets the address1.
	 *
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * Sets the address1.
	 *
	 * @param address1 the new address1
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * Gets the address2.
	 *
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * Sets the address2.
	 *
	 * @param address2 the new address2
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Gets the zip.
	 *
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * Sets the zip.
	 *
	 * @param zip the new zip
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	
}
