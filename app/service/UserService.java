package service;

import java.util.List;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlRow;

/**
 * The Class UserService.
 */
public class UserService {
	
	/**
	 * Gets the customers.
	 *
	 * @param searchText the search text
	 * @return the customers
	 */
	public static List<SqlRow> getCustomers(String searchText) {
		List<SqlRow> rows = Ebean.createSqlQuery("SELECT TOP 10 id id, email value, concat(email, ' (', firstName,' ',lastName,')') label, firstName, lastName, phone, address1, address2, city, state, zip FROM customer WHERE email like '%"+searchText+"%'")
	             .findList();
		return rows;
		}

	/**
	 * Gets the users.
	 *
	 * @param searchText the search text
	 * @return the users
	 */
	public static List<SqlRow> getUsers(String searchText) {
		List<SqlRow> rows = Ebean.createSqlQuery("SELECT TOP 10 id id, email value, concat(email, ' (', firstName,' ',lastName,')') label FROM users WHERE email like '%"+searchText+"%'")
	             .findList();
		return rows;
		}

}
