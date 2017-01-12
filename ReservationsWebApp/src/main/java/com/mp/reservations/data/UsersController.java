package com.mp.reservations.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UsersController {
	
	private IUsersRepository usersRepository;
	
	@Autowired
	public UsersController(IUsersRepository usersRepository){
		this.usersRepository = usersRepository;
	}

}
