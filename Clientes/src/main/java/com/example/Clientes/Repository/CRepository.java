package com.example.Clientes.Repository;

import com.example.Clientes.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

//JPA
public interface CRepository  extends JpaRepository<Client,Integer> {
}
