package com.example.Inventario.Repository;

import com.example.Inventario.Entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepository extends JpaRepository<Inventory, Integer> {
}
