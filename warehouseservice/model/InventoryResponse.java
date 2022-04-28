package com.assignment.warehouseservice.model;

import org.springframework.stereotype.Component;

@Component
public class InventoryResponse {
	private Integer deliveryId;
	private String product;
	private String supplier;
	private Integer quantity;
	private String expectedDate;
	private String expectedWarehouse;
	// private String customError;
	private String deliverystatus;

	private String paymentstatus;

	public Integer getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(Integer deliveryId) {
		this.deliveryId = deliveryId;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getExpectedDate() {
		return expectedDate;
	}

	public void setExpectedDate(String expectedDate) {
		this.expectedDate = expectedDate;
	}

	public String getExpectedWarehouse() {
		return expectedWarehouse;
	}

	public void setExpectedWarehouse(String expectedWarehouse) {
		this.expectedWarehouse = expectedWarehouse;
	}

//	public String getCustomError() {
//		return customError;
//	}
//	public void setCustomError(String customError) {
//		this.customError = customError;
//	}
	public String getDeliverystatus() {
		return deliverystatus;
	}

	public void setDeliverystatus(String deliverystatus) {
		this.deliverystatus = deliverystatus;
	}

	public String getPaymentstatus() {
		return paymentstatus;
	}

	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}

	@Override
	public String toString() {
		return "InventoryResponse [deliveryId=" + deliveryId + ", product=" + product + ", supplier=" + supplier
				+ ", quantity=" + quantity + ", expectedDate=" + expectedDate + ", expectedWarehouse="
				+ expectedWarehouse + ", deliverystatus=" + deliverystatus + ", paymentstatus=" + paymentstatus + "]";
	}

}
