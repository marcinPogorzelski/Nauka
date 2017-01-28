package com.mp.reservations.web;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mp.reservations.data.User;
import com.mp.reservations.interfaces.IUsersRepository;

@RestController
@RequestMapping(value = { "/rest" })
public class UsersRestController {

	private final IUsersRepository usersRepository;

	public UsersRestController(IUsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}

	@RequestMapping(method = RequestMethod.GET, value = { "/users" }, produces = "application/json")
	public List<User> getUsers() {
		return usersRepository.findUsers();
	}

	@RequestMapping(value = "/getUserDetails/{id}")
	public User getUserDetails(@PathVariable Long id) {
		return usersRepository.findUser(id);
	}

}
