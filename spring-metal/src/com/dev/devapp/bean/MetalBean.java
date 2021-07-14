package com.dev.devapp.bean;

import java.io.Serializable;

public class MetalBean implements Serializable{

	private String metalId;
	private String metalName;
	private String metalWeight;
	private String metalCost;

	
	public MetalBean(String metalId, String metalName, String metalWeight, String metalCost) {
		super();
		this.metalId = metalId;
		this.metalName = metalName;
		this.metalWeight = metalWeight;
		this.metalCost = metalCost;
	}


	public String getMetalId() {
		return metalId;
	}


	public void setMetalId(String metalId) {
		this.metalId = metalId;
	}


	public String getMetalName() {
		return metalName;
	}


	public void setMetalName(String metalName) {
		this.metalName = metalName;
	}


	public String getMetalWeight() {
		return metalWeight;
	}


	public void setMetalWeight(String metalWeight) {
		this.metalWeight = metalWeight;
	}


	public String getMetalCost() {
		return metalCost;
	}


	public void setMetalCost(String metalCost) {
		this.metalCost = metalCost;
	}


	@Override
	public String toString() {
		return "MetalBean [metalId=" + metalId + ", metalName=" + metalName + ", metalWeight=" + metalWeight
				+ ", metalCost=" + metalCost + "]";
	}
	
	
	
	
}
