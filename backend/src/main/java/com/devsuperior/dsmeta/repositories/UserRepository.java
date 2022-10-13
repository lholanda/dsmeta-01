package com.devsuperior.dsmeta.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsmeta.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
