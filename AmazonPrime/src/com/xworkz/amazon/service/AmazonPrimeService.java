package com.xworkz.amazon.service;

import com.xworkz.amazon.dto.AmazonPrimeDto;

public interface AmazonPrimeService {
	
	
	 public void validsignin(String userName,String pwd);
	    public void addmovie(AmazonPrimeDto dto);
	    public void viewSubscribers();
	    public void displayMovieDetails();
	    
	    
	 
}
