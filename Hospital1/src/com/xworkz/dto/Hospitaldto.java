package com.xworkz.dto;

public class Hospitaldto {
	
	private String licenseNo;
	private String name;
	private String loc;
	private String founder;
	private String speciality;
	private String phoneNo;
	
	public Hospitaldto(String licenseNo, String name, String loc, String founder, String speciality, String phoneNo) {
     
		System.out.println("Inside dto constructor");
       this.licenseNo = licenseNo;
		this.name = name;
		this.loc = loc;
		this.founder = founder;
		this.speciality = speciality;
		this.phoneNo = phoneNo;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public String getName() {
		return name;
	}

	public String getLoc() {
		return loc;
	}

	public String getFounder() {
		return founder;
	}

	public String getSpeciality() {
		return speciality;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
