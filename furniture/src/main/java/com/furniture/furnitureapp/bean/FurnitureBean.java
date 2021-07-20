package com.furniture.furnitureapp.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FurnitureBean {
	
	private int furnID;
	private String furnName;
	private int price;
	

	public FurnitureBean(@Value("678") int furnID, @Value("Sofa")String furnName,@Value("67800") int price) {
		this.furnID = furnID;
		this.furnName = furnName;
		this.price = price;
	}

	public int getFurnID() {
		return furnID;
	}
	public void setFurnID(int furnID) {
		this.furnID = furnID;
	}
	public String getFurnName() {
		return furnName;
	}
	public void setFurnName(String furnName) {
		this.furnName = furnName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FurnitureBean [furnID=" + furnID + ", furnName=" + furnName + ", price=" + price + "]";
	}
	
	

}
