package com.xworkz.amazon.dao;

import java.sql.Date;

import com.xworkz.amazon.dto.AmazonPrimeDto;

public interface AmazonPrimeDao {

	static final String userName="amazon@prime.com";
	static final String pwd="amazonprime";
	
    public void signin(String userName,String pwd);
    public void addmovie(AmazonPrimeDto dto);
    public void viewSubscribers();
    public void displayMovieDetails();
    
    
    default void displayDate() {
    	System.out.println("Date and Time of login" +" "+new java.util.Date());
    	 
    }
    
    public  static void displayAll()
    {
    	System.out.println("programming java interface");
    	
    }
}
