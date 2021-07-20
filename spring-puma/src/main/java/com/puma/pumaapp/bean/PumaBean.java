package com.puma.pumaapp.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class PumaBean implements Serializable{
	
	private int storeId;
	private String storeName;
	private String storeLoc;
	private ShoeBean shoe;
	
	@Autowired
	public PumaBean(int storeId, String storeName, String storeLoc, ShoeBean shoe) {
		super();
		this.storeId = storeId;
		this.storeName = storeName;
		this.storeLoc = storeLoc;
		this.shoe = shoe;
	}

	public int getStoreId() {
		return storeId;
	}
@Value("567")
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	@Value("PumaIndia")
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreLoc() {
		return storeLoc;
	}
	@Value("Bengaluru")
	public void setStoreLoc(String storeLoc) {
		this.storeLoc = storeLoc;
	}
	public ShoeBean getShoe() {
		return shoe;
	}
	public void setShoe(ShoeBean shoe) {
		this.shoe = shoe;
	}

	@Override
	public String toString() {
		return "PumaBean [storeId=" + storeId + ", storeName=" + storeName + ", storeLoc=" + storeLoc + "]";
	}
	

	
}
