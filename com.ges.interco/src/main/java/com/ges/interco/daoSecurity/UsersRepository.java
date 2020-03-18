package com.ges.interco.daoSecurity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ges.interco.entities.User;

/**
 * Repository pour la gestion des utilisateurs.
 * @author Alpha
 *
 */
public interface UsersRepository extends JpaRepository<User, Long> {
	
	public Optional<User> findByuserName(String username);

}
