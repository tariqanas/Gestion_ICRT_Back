package com.ges.interco.Services.functional;

import com.ges.interco.entities.Domaine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Interface to Manage the employees working domains.
 * @Author Alpha.
 */

@Repository
public interface IDomaine extends JpaRepository<Domaine, Long> {
}
