package com.mp.reservations.data;

import java.util.List;

public interface IUsersRepository {
	
	List <User> findUsers(long max, int count);

}
