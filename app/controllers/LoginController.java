package controllers;

import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import service.LoginService;

public class LoginController extends Controller {
	
	public static Result login() {
		return ok(views.html.login.render(Form.form(User.class)));
	}

	public static Result authenticate() {
		Form<User> loginForm = Form.form(User.class).bindFromRequest();
		String email = loginForm.get().getEmail();
		String password = loginForm.get().getPassword();
		System.out.println("email1 "+email+"--"+"password1 "+password);
		User user = LoginService.authenticate(email, password);
		if (user == null) {
			flash("error", "Invalid credentials");
			return badRequest(views.html.login.render(Form.form(User.class)));
		}
		
		session().clear();
		session("userProfile", user.getId().toString());
		return redirect(routes.TicketController.dashboard(0));
		
	}
	
	public static Result logout() {
	    session().clear();
	    return redirect(routes.LoginController.login()
	    );
	}

}
