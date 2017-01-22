package com.mp.reservations.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mp.reservations.data.User;
import com.mp.reservations.interfaces.IUsersRepository;

@RestController
@RequestMapping(value={"/rest"})
public class UsersRestController {
	
	private final IUsersRepository usersRepository;
	
	public UsersRestController(IUsersRepository usersRepository){
		this.usersRepository = usersRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET, value={"/users"}, produces="application/json")
	public List<User> getUsers(){
		//TODO Implementacja metody pobieraj¹æa listê wyników z bazy danych
		return usersRepository.findUsers();
		/*List<User> users = new ArrayList<>();
		users.add(new User("Tomasz", "Kowalski"));
		return users;*/
	}

}
