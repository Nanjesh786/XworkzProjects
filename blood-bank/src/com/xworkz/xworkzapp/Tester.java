package com.xworkz.xworkzapp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.xworkz.dto.BloodBankDTO;
import com.xworkz.service.BloodBankService;
import com.xworkz.service.BloodBankServiceImpl;

public class Tester {
	
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		BloodBankDTO dto=new BloodBankDTO();
		System.out.println("Enter Blood Bank ID");
		dto.setBloodBankId(sc.nextInt());
		System.out.println("Enter Donor Name");
		dto.setDonorName(sc.next());
		System.out.println("enter Donor age");
		dto.setDonorAge(sc.nextInt());
		System.out.println("enter Donor contact Number");
		dto.setContactNo(sc.nextLong());
    		System.out.println("Is Donor a Smoker");
		dto.setSmoker(sc.nextBoolean());
		System.out.println("Enter the Blood bank locatiom");
		dto.setBloodBankLoc(sc.next());
            
		BloodBankService ser=new BloodBankServiceImpl(); 
			
			try {
				ser.validateAndSave(dto);
			} catch (ClassNotFoundException |SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			try {
				ser.updateAgeByName(29, "vijay");
			} catch (ClassNotFoundException |SQLException e)
			{// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			try {
				ser.deleteByName("nanjesh");
			} catch (ClassNotFoundException |SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			         try {
						List<BloodBankDTO> list=ser.allDetails();
						list.forEach(e->System.out.println(e));
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			         
			         List<String> list=ser.allSmokers("avi");
			         list.forEach(e-> System.out.println(e));
			         
			         List<BloodBankDTO> loclist=ser.allLocation("mysore");
			         list.forEach(e->System.out.println(e));
			         
			         List<String> clist=ser.allContactNo();
			         clist.forEach(e->System.out.println(e));
	}	
		
	}
	
