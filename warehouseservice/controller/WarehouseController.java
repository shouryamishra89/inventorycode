package com.assignment.warehouseservice.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.warehouseservice.model.Inventory;
import com.assignment.warehouseservice.model.InventoryResponse;
import com.assignment.warehouseservice.service.InventoryService;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {
	@Autowired
	private InventoryService inventoryService;

	@PostMapping("/addInventory")
	public Inventory addInventory(@RequestBody Inventory inventory) {

		return inventoryService.addItems(inventory);
	}

	@PostMapping("/addAllItem")
	public List<Inventory> addAllItem(@RequestBody List<Inventory> inventory) {

		return inventoryService.addAllItems(inventory);
	}

	@PostMapping("/validateItem")
	public InventoryResponse validateDelivery(@Valid @RequestBody Inventory inventory) {

		return inventoryService.validateItems(inventory);
	}

	@GetMapping("/list/{value}")
	public List<Inventory> getlistDeliveryStatus(@Valid @PathVariable String value) {

		return inventoryService.getDeliveryStatus(value);
	}

}
