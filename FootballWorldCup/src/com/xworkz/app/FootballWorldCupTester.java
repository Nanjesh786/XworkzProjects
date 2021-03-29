package com.xworkz.app;

import java.util.LinkedList;

public class FootballWorldCupTester {
	
	
	public static void main(String[] args) {
		FootballWorldCupDto dto=new FootballWorldCupDto("South Africa",2010,"SPAIN","NETHERLANDS");
		FootballWorldCupDto dto1=new FootballWorldCupDto("Brazil",2014,"GERMANY","ARGENTINA");
		FootballWorldCupDto dto2=new FootballWorldCupDto("Russia",2018,"FRANCE","CROATIA");
		FootballWorldCupDao key=new FootballWorldCupDaoImpl(); 
	     key.addDetails(dto);
	     key.addDetails(dto1);
	     key.addDetails(dto2);
	     key.removeDetails();
	     key.displayInfo();
	     
}
}
