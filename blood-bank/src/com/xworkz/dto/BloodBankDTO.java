package com.xworkz.dto;

import java.io.Serializable;

public class BloodBankDTO implements Serializable{

	
	private int bloodBankId;
	private String donorName;
	private int donorAge;
	private Long contactNo;
	private boolean isSmoker;
	private String bloodBankLoc;

	
	public int getBloodBankId() {
		return bloodBankId;
	}
	public void setBloodBankId(int bloodBankId) {
		this.bloodBankId = bloodBankId;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public int getDonorAge() {
		return donorAge;
	}
	public void setDonorAge(int donorAge) {
		this.donorAge = donorAge;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	public boolean isSmoker() {
		return isSmoker;
	}
	public void setSmoker(boolean isSmoker) {
		this.isSmoker = isSmoker;
	}
	public String getBloodBankLoc() {
		return bloodBankLoc;
	}
	public void setBloodBankLoc(String bloodBankLoc) {
		this.bloodBankLoc = bloodBankLoc;
	}
	@Override
	public String toString() {
		return "BloodBankDTO [bloodBankId=" + bloodBankId + ", donorName=" + donorName + ", donorAge=" + donorAge
				+ ", contactNo=" + contactNo + ", isSmoker=" + isSmoker + ", bloodBankLoc=" + bloodBankLoc + "]";
	}
	
	
}
