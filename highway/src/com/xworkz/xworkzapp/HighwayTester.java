package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.HighwayDTO;

public class HighwayTester {

	public static void main(String[] args) {
		
		
    HighwayDTO dto=new HighwayDTO();
    dto.setHighwayName("NH4");
    dto.setHighwayDistance("99km");
	dto.setHighwayTolls(7);
	System.out.println(dto.getHighwayName() +" length is "+ dto.getHighwayDistance() +" and consists of "+  dto.getHighwayTolls() +" Tolls");
	
	HighwayDTO dto1=new HighwayDTO();
    dto1.setHighwayName("NH7");
    dto1.setHighwayDistance("87km");
	dto1.setHighwayTolls(6);
	System.out.println(dto1.getHighwayName() +" length is "+ dto1.getHighwayDistance() +" and consists of "+  dto1.getHighwayTolls() +" Tolls");
	
	
	}	
}
