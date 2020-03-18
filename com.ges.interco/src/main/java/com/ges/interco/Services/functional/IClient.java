package com.ges.interco.Services.functional;

import com.ges.interco.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface to manage the Clients.
 * @author Alpha
 */

@Repository
public interface IClient extends JpaRepository<Client, Long> {
}
