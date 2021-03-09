package com.xworkz.xworkzapp.dto;

public class HighwayDTO {
	
 private String highwayName;
 private String highwayDistance;
 private int noOfTolls;
 
 public HighwayDTO()
 {
	 System.out.println("constructor");
 }
 
 public void setHighwayName(String name)
 {
	 highwayName=name;
	 
 }
	public String getHighwayName()
	{
		 return highwayName;
	}
	
	 public void setHighwayDistance(String length)
	 {
		 highwayDistance=length;
		 
	 }
		public String getHighwayDistance()
		{
			 return highwayDistance;
		}
		
		 public void setHighwayTolls(int tolls)
		 {
			 noOfTolls=tolls;
			 
		 }
			public int getHighwayTolls()
			{
				 return noOfTolls;
			}

}
