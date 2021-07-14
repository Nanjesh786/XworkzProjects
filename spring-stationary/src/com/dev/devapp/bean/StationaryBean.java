package com.dev.devapp.bean;

import java.io.Serializable;

public class StationaryBean implements Serializable {
	
	
	private int stationaryID;
	private String stationaryName;
	private String stationaryAddress;
	private String stationaryOwnerName;
	
	public StationaryBean() {
		
		System.out.println(this.getClass().getSimpleName() +"created");
	}
	public void provideItems()
	{
		System.out.println("Items delivered");
	}
	public StationaryBean(int stationaryID, String stationaryName, String stationaryAddress,
			String stationaryOwnerName) {
		this.stationaryID = stationaryID;
		this.stationaryName = stationaryName;
		this.stationaryAddress = stationaryAddress;
		this.stationaryOwnerName = stationaryOwnerName;
	}
	public int getStationaryID() {
		return stationaryID;
	}
	public void setStationaryID(int stationaryID) {
		this.stationaryID = stationaryID;
	}
	public String getStationaryName() {
		return stationaryName;
	}
	public void setStationaryName(String stationaryName) {
		this.stationaryName = stationaryName;
	}
	public String getStationaryAddress() {
		return stationaryAddress;
	}
	public void setStationaryAddress(String stationaryAddress) {
		this.stationaryAddress = stationaryAddress;
	}
	public String getStationaryOwnerName() {
		return stationaryOwnerName;
	}
	public void setStationaryOwnerName(String stationaryOwnerName) {
		this.stationaryOwnerName = stationaryOwnerName;
	}
	@Override
	public String toString() {
		return "StationaryBean [stationaryID=" + stationaryID + ", stationaryName=" + stationaryName
				+ ", stationaryAddress=" + stationaryAddress + ", stationaryOwnerName=" + stationaryOwnerName + "]";
	}

}
