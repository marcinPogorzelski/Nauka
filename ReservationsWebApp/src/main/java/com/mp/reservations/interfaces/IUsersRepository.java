package com.mp.reservations.interfaces;

import java.util.List;

import com.mp.reservations.data.User;

public interface IUsersRepository {
	
	List <User> findUsers();
	List <User> findUsers(long max, int count);
	
	void addUser(User user);
	void updateUser(Long id, User user);
	void removeUser(Long id);

}
