package com.ges.interco.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.ges.interco.entities.User;

public interface UsersRepository extends JpaRepository<User, Long> {
	
	public Optional<User> findByuserName(String username);

}
