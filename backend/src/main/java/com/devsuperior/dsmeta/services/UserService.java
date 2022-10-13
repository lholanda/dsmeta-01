package com.devsuperior.dsmeta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.dto.UserDTO;
import com.devsuperior.dsmeta.entities.User;
import com.devsuperior.dsmeta.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	/*
	public UserDTO findById(Long id) {
		User entity = repository.findById(id).get();
		UserDTO dto = new UserDTO(entity);
		System.out.println(dto.toString());
		return dto;
	}
	*/
	
}
