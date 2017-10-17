package cmo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class generalController {

	// login session
	protected boolean login = false;

	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}
}
