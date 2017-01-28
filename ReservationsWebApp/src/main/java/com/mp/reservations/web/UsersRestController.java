package com.mp.reservations.web;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mp.reservations.data.User;
import com.mp.reservations.interfaces.IUsersRepository;

@RestController
@RequestMapping(value = { "/rest" })
public class UsersRestController {
	private static final Logger LOGGER = Logger.getLogger(UsersRestController.class);

	private final IUsersRepository usersRepository;

	public UsersRestController(IUsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}

	@RequestMapping(method = RequestMethod.GET, value = { "/users" }, produces = "application/json")
	public List<User> getUsers() {
		return usersRepository.findUsers();
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public User getUserDetails(@PathVariable Long id) {
		return usersRepository.findUser(id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/user/{id}")
	public void removeUser(@PathVariable Long id) {
		usersRepository.removeUser(id);
		LOGGER.info("User with id = " + String.valueOf(id) + " has been removed.");
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/user")
	public void createUser(User user){
		//TODO Implement
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/user/{id}")
	public void updateUser(User user){
		//
	}

}
