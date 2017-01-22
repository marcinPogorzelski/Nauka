package com.mp.reservations.data;

public class User {
	
	private final Long id;
	private final String name;
	private final String surname;
	
	
	public User(Long id, String name, String surname){
		this.name = name;
		this.surname = surname;
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}
	
}
