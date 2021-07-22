package com.soap.soapapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Soap")
public class SoapDTO implements Serializable{
	
	@Id
@Column(name="ID")
	private int soapId;
	@Column(name="SoapName")
	private String soapName;
	@Column(name="colour")
	private String soapColour;
	@Column(name="price")
	private int price;
	
	public SoapDTO()
	{
		System.out.println(this.getClass().getSimpleName() +" created");
	}

	public SoapDTO(int soapId, String soapName, String soapColour, int price) {
		super();
		this.soapId = soapId;
		this.soapName = soapName;
		this.soapColour = soapColour;
		this.price = price;
	}

	public int getSoapId() {
		return soapId;
	}

	public void setSoapId(int soapId) {
		this.soapId = soapId;
	}

	public String getSoapName() {
		return soapName;
	}

	public void setSoapName(String soapName) {
		this.soapName = soapName;
	}

	public String getSoapColour() {
		return soapColour;
	}

	public void setSoapColour(String soapColour) {
		this.soapColour = soapColour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SoapDTO [soapId=" + soapId + ", soapName=" + soapName + ", soapColour=" + soapColour + ", price="
				+ price + "]";
	}
	
	

}
