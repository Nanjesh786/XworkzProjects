package com.xworkz.dto.dao;

import com.xworkz.dto.Hospitaldto;

public class HospitalDaoImplies implements HospitalDao{
	
	Hospitaldto hosDetails[]=new Hospitaldto[5];
	int index=0;
	
	@Override
	public void addDetails(Hospitaldto dto) {

		hosDetails[index]=dto;
		System.out.println("Details added");
		index++;
		}

	@Override
	public void displayAll() {
      for (int i = 0; i <index; i++) {
    	  
    	  System.out.println("Hospital licenseNO" +" "+hosDetails[i].getLicenseNo());
    	  System.out.println("Hospital name" +" "+hosDetails[i].getName());
    	  System.out.println("Hospital location" +" "+hosDetails[i].getLoc());
    	  System.out.println("Hospital founder"+" "+hosDetails[i].getFounder());
    	  System.out.println("Hospital speciality" +" "+hosDetails[i].getSpeciality());
    	  System.out.println("Hospital phoneNO" +" "+hosDetails[i].getPhoneNo());
    	  
	}
		
	}

	@Override
	public void updateDetails(String licenseNo, String phoneNo,String name) {
        System.out.println("Inside Updated Details using PhoneNo and licenseNo"); 
		for (int i = 0; i <index; i++) {
        	  if(hosDetails[i].getLicenseNo()==licenseNo&&hosDetails[i].getPhoneNo()==phoneNo)
        	  {
        		  hosDetails[i].setName(name);
        	  }
		}		
	}

	@Override
	public void displayAll(String licenseNo, String PhoneNo) {
		System.out.println("Inside Display using licenseNo and PhoneNo");
			for (int i = 0; i < index; i++) {
				if(hosDetails[i].getLicenseNo()==licenseNo&&hosDetails[i].getPhoneNo()==PhoneNo)
				{
				 System.out.println("Hospital licenseNO" +" "+hosDetails[i].getLicenseNo());
		    	  System.out.println("Hospital name" +" "+hosDetails[i].getName());
		    	  System.out.println("Hospital location" +" "+hosDetails[i].getLoc());
		    	  System.out.println("Hospital founder"+" "+hosDetails[i].getFounder());
		    	  System.out.println("Hospital speciality" +" "+hosDetails[i].getSpeciality());
		    	  System.out.println("Hospital phoneNO" +" "+hosDetails[i].getPhoneNo());
		    	 	
			}else {
				System.out.println("Invaid input");
			}
				
			}
			
		}

	@Override
	public void delete(String name) {
           for (int i = 0; i < index; i++) {
        	   if(hosDetails[i].getName()==name)
        	   {
        		   hosDetails[i]=null;
        		   System.out.println("array Empty");
        	   }else {
        		   System.out.println("enter valid name");
        	   }
			
		}		
	}
		
	}
	
	


