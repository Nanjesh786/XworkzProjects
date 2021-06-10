package com.xworkz.dto;

public class AmazonDTO {
	
	private int id;
	private String name;
	private String loctaion;
	private Long contactNo;
	private String paymentMode;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoctaion() {
		return loctaion;
	}
	public void setLoctaion(String loctaion) {
		this.loctaion = loctaion;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	@Override
	public String toString() {
		return "AmazonDTO [id=" + id + ", name=" + name + ", loctaion=" + loctaion + ", contactNo=" + contactNo
				+ ", paymentMode=" + paymentMode + "]";
	}

	

}
