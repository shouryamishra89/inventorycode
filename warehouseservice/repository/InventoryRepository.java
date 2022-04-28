package com.assignment.warehouseservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.warehouseservice.model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

	List<Inventory> findBydeliverystatus(String data);

}
