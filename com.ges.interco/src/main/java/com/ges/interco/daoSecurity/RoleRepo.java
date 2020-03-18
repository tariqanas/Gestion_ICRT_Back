package com.ges.interco.daoSecurity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ges.interco.entities.Role;

/**
 * Repository pour la gestion des roles.
 * @author Alpha
 *
 */
public interface RoleRepo extends JpaRepository<Role, Long> {

}
