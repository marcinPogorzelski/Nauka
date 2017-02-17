package com.mp.reservations.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	
	private final Long id;
	private final String name;
	private final String surname;
	
	public User(@JsonProperty("id")Long id, @JsonProperty("name")String name, @JsonProperty("surname")String surname){
		this.name = name;
		this.surname = surname;
		this.id = id;	
	}
/*	
	public User(@JsonProperty("name")String name, @JsonProperty("surname")String surname){
		this.name = name;
		this.surname = surname;
		this.id = null;	
	}*/
	
/*	public User(Long id, String name, String surname){
		this.name = name;
		this.surname = surname;
		this.id = id;
	}*/

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}
	
	
	
}
