package org.example.Repositories;

import org.example.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository<clients> extends JpaRepository<Client, String> {

}
