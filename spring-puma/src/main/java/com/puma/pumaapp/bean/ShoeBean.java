package com.puma.pumaapp.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class ShoeBean implements Serializable {
	
	
	private int shoeId;
	private String shoeName;
	private int sizeInInches;
	private int price;

	public ShoeBean(int shoeId, String shoeName, int sizeInInches, int price) {
		super();
		this.shoeId = shoeId;
		this.shoeName = shoeName;
		this.sizeInInches = sizeInInches;
		this.price = price;
	}

	public int getShoeId() {
		return shoeId;
	}
	@Value("23")
	public void setShoeId(int shoeId) {
		this.shoeId = shoeId;
	}

	public String getShoeName() {
		return shoeName;
	}
	@Value("One8")
	public void setShoeName(String shoeName) {
		this.shoeName = shoeName;
	}

	public int getSizeInInches() {
		return sizeInInches;
	}
	@Value("8")
	public void setSizeInInches(int sizeInInches) {
		this.sizeInInches = sizeInInches;
	}

	public int getPrice() {
		return price;
	}
	@Value("6700")
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ShoeBean [shoeId=" + shoeId + ", shoeName=" + shoeName + ", sizeInInches=" + sizeInInches + ", price="
				+ price + "]";
	}
	
	
	

}
