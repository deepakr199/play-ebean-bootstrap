package service;

import com.avaje.ebean.Ebean;

import models.User;

/**
 * The Class LoginService.
 */
public class LoginService {
	
	/**
	 * Authenticate.
	 *
	 * @param email the email
	 * @param password the password
	 * @return the user
	 */
	public static User authenticate(String email, String password){
		User user = Ebean.find(User.class).where().eq("email", email).eq("password", password).findUnique();
		return user;
		
	}

}
