package com.ragna.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public ModelAndView loginView() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from Sergio.java **********</div><br><br>";
		return new ModelAndView("login", "message", message);
	}

}
