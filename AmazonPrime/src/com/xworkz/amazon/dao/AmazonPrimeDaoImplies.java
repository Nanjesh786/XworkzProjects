package com.xworkz.amazon.dao;

import com.xworkz.amazon.dto.AmazonPrimeDto;

public class AmazonPrimeDaoImplies implements AmazonPrimeDao{

	AmazonPrimeDto prime[]=new AmazonPrimeDto[5];
	   int index=0;
	   String[] moviesubscribers= {"Ravi","Vishnu","Vijay","Krishna","Ashoka"};
	
	
	@Override
	public void signin(String userName, String pwd) {
     if(userName.equals(AmazonPrimeDao.userName)&& pwd.equals(AmazonPrimeDao.pwd))
     {
    	 System.out.println("Welcome to Amazon prime video");
    	 AmazonPrimeDao.super.displayDate();
    	 AmazonPrimeDao.displayAll();
     }
     else {
    	 System.out.println("Invalid credentials");
     }
	}

	@Override
	public void addmovie(AmazonPrimeDto dto) {
        prime[index]=dto;
        
        System.out.println("Movie added Successfully");
        
        index++;
	}

	@Override
	public void viewSubscribers() {
		for (int i = 0; i < moviesubscribers.length; i++) {
			
		
          System.out.println("The Subscribers are:" +moviesubscribers[i]);     		
	}

	}

	@Override
	public void displayMovieDetails() {
	
		 for (int i = 0; i < index; i++) {
	        	
	        	System.out.println("The Movie Name is:"+" "+prime[i].getMovieName());
	        	System.out.println("The Hero Name is:"+" "+prime[i].getHero());
	        	System.out.println("The Language is:"+" "+prime[i].getLanguage());
	        	System.out.println("The No OF SubScribers are:"+" "+prime[i].getNoOfSubscribers());
	        	System.out.println("The Release date is:"+" "+prime[i].getReleaseDate());
	        }
		
		
	}
	
	
}
