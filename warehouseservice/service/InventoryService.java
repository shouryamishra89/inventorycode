package com.assignment.warehouseservice.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.warehouseservice.config.WarehouseConstant;
import com.assignment.warehouseservice.model.Inventory;
import com.assignment.warehouseservice.model.InventoryResponse;
import com.assignment.warehouseservice.repository.InventoryRepository;

@Service
public class InventoryService {
	@Autowired
	private InventoryRepository inventoryRepository;
	@Autowired
	private WarehouseConstant constant;

	// private InventoryResponse response ;

	public Inventory addItems(Inventory inventory) {
		// TODO Auto-generated method stub

		return inventoryRepository.save(inventory);
	}

	public List<Inventory> addAllItems(List<Inventory> inventory) {
		// TODO Auto-generated method stub

		return inventoryRepository.saveAll(inventory);
	}

	public InventoryResponse validateItems(Inventory inventory) {
		// TODO Auto-generated method stub

		Optional<Inventory> result = inventoryRepository.findById(inventory.getDeliveryId());

		InventoryResponse inventoryResponse = new InventoryResponse();
		if (result.isPresent()) {
			Inventory response = result.get();
			if (response.getProduct().equals(inventory.getProduct())
					&& response.getQuantity().equals(inventory.getQuantity())
					&& response.getExpectedWarehouse().equals(inventory.getExpectedWarehouse())
					&& response.getSupplier().equals(inventory.getSupplier())

			) {

				inventory.setDeliverystatus(constant.DELIVERYSTATUS);

				inventory.setPaymentstatus(constant.PAYMENTSTATUS);

				System.out.println("Print Value::" + inventory.getDeliverystatus());
				inventoryRepository.save(inventory);
				System.out.println("After Value::" + inventory.getDeliverystatus() + "" + inventory.getPaymentstatus());
				inventoryResponse.setDeliverystatus(inventory.getDeliverystatus());
				inventoryResponse.setDeliveryId(inventory.getDeliveryId());
				inventoryResponse.setExpectedWarehouse(inventory.getExpectedWarehouse());
				inventoryResponse.setProduct(inventory.getProduct());
				inventoryResponse.setQuantity(inventory.getQuantity());
				inventoryResponse.setSupplier(inventory.getSupplier());
				inventoryResponse.setPaymentstatus(inventory.getPaymentstatus());
				inventoryResponse.setExpectedDate(inventory.getExpectedDate());
			} else {

				
				//inventory.setDeliverystatus("Not Received");
				inventory.setDeliverystatus(constant.STATUS);
				//inventoryResponse.setDeliverystatus(inventory.setDeliverystatus(constant.STATUS));
				inventory.setPaymentstatus(constant.NOPAYMENT);
				inventory.setPaymentstatus("Payement Not Proceed");
				inventoryRepository.save(inventory);
				inventoryResponse.setDeliveryId(inventory.getDeliveryId());
				inventoryResponse.setDeliverystatus(inventory.getDeliverystatus());
				inventoryResponse.setPaymentstatus(inventory.getPaymentstatus());
				System.out.println("Not Received Item");

			}

		}
		return inventoryResponse;
	}

	public List<Inventory> getDeliveryStatus(String data) {
		// TODO Auto-generated method stub
		List<Inventory> listInvert = inventoryRepository.findBydeliverystatus(data);
		Optional<List<Inventory>> result = Optional.ofNullable(listInvert);
		List<Inventory> sum = result.get();
		List<Inventory> finallist = sum.stream().filter(x -> x.getDeliverystatus().equals(data))
				.collect(Collectors.toList());

		return finallist;
	}

}
