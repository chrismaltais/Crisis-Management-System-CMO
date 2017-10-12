package cmoProject.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class analystController {
	
	// login session
	private boolean login=false;

	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}

}
