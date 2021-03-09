package com.xworkz.dto.dao.service;

import com.xworkz.dto.Hospitaldto;
import com.xworkz.dto.dao.HospitalDao;
import com.xworkz.dto.dao.HospitalDaoImplies;

public class HospitalServiceImplies implements HospitalService {
	
	
	private HospitalDao obj=new HospitalDaoImplies();

	@Override
	public boolean validateLicenseNo(Hospitaldto dto) {
		
		boolean isvalid=true;
		if(dto.getLicenseNo()==null||dto.getLicenseNo().length()!=8)
		{
			System.out.println("invalid licenseNo");
			isvalid=false;
			return isvalid;
		}
        if(dto.getName()==null||dto.getName().length()<6) {

			System.out.println("invalid name");
			isvalid=false;
			return isvalid;
        }
		if(dto.getLoc()==null||dto.getLoc().length()<5)
		{
			System.out.println("invalid location");
			isvalid=false;
			return isvalid;
			}
		if(dto.getFounder()==null||dto.getFounder().length()<4)
		{
			System.out.println("invalid name");
		isvalid=false;
		return isvalid;
	}
    if(dto.getSpeciality()==null||dto.getSpeciality().length()<6)
    {
    	System.out.println("invalid name");
		isvalid=false;
		return isvalid;
    }
    if(dto.getPhoneNo()==null||dto.getPhoneNo().length()!=10)
    {
    	System.out.println("invalid name");
		isvalid=false;
		return isvalid;
    }
    if(isvalid) {
    	obj.addDetails(dto);
    }
    return isvalid;
}

	@Override
	public void validDisplay() {
          obj.displayAll();		
	}

	@Override
	public void validUpdate(String licenseNo, String PhoneNo,String name) {
         if(licenseNo==licenseNo&&PhoneNo==PhoneNo)
         {
        	 obj.updateDetails(licenseNo, PhoneNo,name);
         }
         else {
        	 System.out.println("Bad input");
         }
	}

	@Override
	public void validDisplayAll(String licenseNo, String PhoneNo) {
           if(licenseNo==licenseNo&&PhoneNo==PhoneNo)
           {
        	   obj.displayAll(licenseNo, PhoneNo);
           }
        
	}

	@Override
	public void validDelete(String name) {
		
	         obj.delete(name);
		
	}
}