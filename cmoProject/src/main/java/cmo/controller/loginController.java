package cmo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cmo.login.loginDAO;

@Controller
public class loginController {
	@Autowired
	loginDAO logindao;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "pages/login";
	}

	@PostMapping(value = "/authenticator")
	public String authenticator(@RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password, @RequestParam(name = "domain") String domain) {

		if (logindao.authenticate(username, password, domain))
			return "redirect:/maps";
		else
			return "redirect:/";

	}
}
