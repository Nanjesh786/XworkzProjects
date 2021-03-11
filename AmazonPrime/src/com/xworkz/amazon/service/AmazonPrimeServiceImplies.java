package com.xworkz.amazon.service;

import com.xworkz.amazon.dao.AmazonPrimeDao;
import com.xworkz.amazon.dao.AmazonPrimeDaoImplies;
import com.xworkz.amazon.dto.AmazonPrimeDto;

public class AmazonPrimeServiceImplies implements AmazonPrimeService{
	
	private AmazonPrimeDao daoimp=new AmazonPrimeDaoImplies();
	

	@Override
	public void validsignin(String userName, String pwd) {
		
		if(userName!=null&&userName.contains("@")&&userName.contains("com")&&pwd.length()>6)
				{
			daoimp.signin(userName, pwd);
			
				}
		else {
			System.out.println("Invalid details");
		}
	}

	@Override
	public void addmovie(AmazonPrimeDto dto) {
             if(dto!=null) {
            	 daoimp.addmovie(dto);
             }
             else {
            	 System.out.println("empty array");
             }
	}

	@Override
	public void viewSubscribers() {
         daoimp.viewSubscribers();	
	}

	@Override
	public void displayMovieDetails() {
         if(daoimp.userName!=null) {
        	 daoimp.displayMovieDetails();
         }
	}

}
