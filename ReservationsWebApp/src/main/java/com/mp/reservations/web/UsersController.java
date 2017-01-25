package com.mp.reservations.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mp.reservations.data.User;
import com.mp.reservations.interfaces.IUsersRepository;

@Controller
@RequestMapping("/users")
public class UsersController {

	private IUsersRepository usersRepository;

	@Autowired
	public UsersController(IUsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<User> users() {
		return usersRepository.findUsers();
	}
}
