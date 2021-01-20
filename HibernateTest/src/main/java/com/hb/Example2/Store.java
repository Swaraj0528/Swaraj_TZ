package com.hb.Example2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Store {
	@Id
	private int itemId;
	private String itemName;
	private double price;

	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Store(int itemId, String itemName, double price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Store [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + "]";
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
