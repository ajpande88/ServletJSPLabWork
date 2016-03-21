package com.message;

import java.util.Date;

public class Data {
	private String Name;
	private Date Date;
	private String Description;
	private int Quantity;
	private int Price;

	public Data(String Name, Date Date, String Description, int Quantity, int Price) {
		this.Name = Name;
		this.Date = Date;
		this.Description = Description;
		this.Quantity = Quantity;
		this.Price = Price;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

}
