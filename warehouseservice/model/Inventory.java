package com.assignment.warehouseservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
//@NoArgsConstructor

@Entity
public class Inventory {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull(message = "The deliveryId is required.")
	private Integer deliveryId;
    @NotNull(message = "The product name is required.")
    private String product;
    @NotNull(message = "The supplier name is required.")
	private String supplier;
    @NotNull(message = "The quantity name is required.")
	private Integer quantity;
    private String expectedDate;
    @NotNull(message = "The expectedWarehouse name is required.")
	private String expectedWarehouse;
	private String deliverystatus;
	
	private String paymentstatus;
	public Inventory() {
		
	}
	
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
		return "Inventory [deliveryId=" + deliveryId + ", product=" + product + ", supplier=" + supplier + ", quantity="
				+ quantity + ", expectedDate=" + expectedDate + ", expectedWarehouse=" + expectedWarehouse
				+ ", deliverystatus=" + deliverystatus + ", paymentstatus=" + paymentstatus + "]";
	}
	
	
	
}
