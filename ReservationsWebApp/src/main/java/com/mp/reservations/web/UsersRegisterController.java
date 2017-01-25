package com.mp.reservations.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/register")
public class UsersRegisterController {

	@RequestMapping(method = RequestMethod.GET)
	public String registerUser() {
		return "registerForm";
	}

}
