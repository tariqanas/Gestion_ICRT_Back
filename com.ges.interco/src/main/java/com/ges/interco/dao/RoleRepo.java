package com.ges.interco.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ges.interco.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {

}
