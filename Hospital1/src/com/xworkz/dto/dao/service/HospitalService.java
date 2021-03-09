package com.xworkz.dto.dao.service;

import com.xworkz.dto.Hospitaldto;

public interface HospitalService {
	
	
	public boolean validateLicenseNo(Hospitaldto dto);
	public void validDisplay();
	public void validUpdate(String licenseNo,String PhoneNo,String name);
	public void validDisplayAll(String licenseNo,String PhoneNo);
	public void validDelete(String name);

}
