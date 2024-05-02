package com.company.project.model.repository;

import com.company.project.model.Client;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findByUsername(String username);

    List<Client> findAll();

    void deleteById(Long id);

    ScopedValue<Object> findById(Long id);

    Client save(Client client);
}
