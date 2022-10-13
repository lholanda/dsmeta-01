package com.devsuperior.dsmeta.dto;

import java.util.UUID;

import com.devsuperior.dsmeta.entities.User;

public class UserDTO {
	
	private UUID id;
	private String name;
	
	public UserDTO() {	
	}

	public UserDTO(UUID id, String name, String senha) {
		this.id = id;
		this.name = name;
	}
	
	public UserDTO(User user) {
		id = user.getId();
		name = user.getUsername();
	}

	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + "]";
	}

}
