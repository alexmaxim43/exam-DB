package com.example.examdb.Repository;

import com.example.examdb.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    public Client findClientByName(String name);
}
