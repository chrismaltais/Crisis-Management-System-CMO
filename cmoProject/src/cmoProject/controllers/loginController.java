package cmoProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cmoProject.dao.loginDAO;

@Controller
public class loginController {
	loginDAO logindao;

	@RequestMapping(value = "/")
	public String loginPage() {
		return "login";
	}

	@PostMapping(value = "/authenticator")
	public String authenticator(@RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password, @RequestParam(name = "domain") String domain) {

		if (logindao.authenticate(username, password, domain))
			return "maps";
		else
			return "login";

	}
}
