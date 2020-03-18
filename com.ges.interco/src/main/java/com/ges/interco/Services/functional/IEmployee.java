package com.ges.interco.Services.functional;

import com.ges.interco.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Interface to manage the Employees
 * @author Alpha
 */

@Repository
public interface IEmployee extends JpaRepository<Employee, Long> {
}
