package com.xworkz.dto.dao;

import com.xworkz.dto.Hospitaldto;

public interface HospitalDao {

	public void addDetails(Hospitaldto dto);
	public void displayAll();
	public void updateDetails(String licenseNo,String phoneNo,String name);
    public void displayAll(String licenseNo,String PhoneNo);
    public void delete(String name);
}
