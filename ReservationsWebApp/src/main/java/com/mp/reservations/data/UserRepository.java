package com.mp.reservations.data;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mp.reservations.interfaces.IUsersRepository;

@Repository
public class UserRepository implements IUsersRepository {

	@Override
	public List<User> findUsers(long max, int count) {
		// TODO Auto-generated method stub
		return null;
	}

}
