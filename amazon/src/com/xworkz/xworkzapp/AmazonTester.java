package com.xworkz.xworkzapp;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.xworkz.dto.AmazonDTO;
import com.xworkz.service.AmazonService;
import com.xworkz.service.AmazonServiceImpl;

public class AmazonTester {

	
	public static void main(String[] args) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		AmazonDTO dto=new AmazonDTO();
		System.out.println("Enter the id");
		dto.setId(sc.nextInt());
		System.out.println("Enter the name");
		dto.setName(sc.next());
		System.out.println("Enter the location");
		dto.setLoctaion(sc.next());
		System.out.println("enter contact no");
		dto.setContactNo(sc.nextLong());
		System.out.println("Enter payment mode");
		dto.setPaymentMode(sc.next());
		
		AmazonService ser=new AmazonServiceImpl();
		
		try {
			ser.validateAndSaveDetails(dto);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//	List<AmazonDTO> alllist=ser.getAllDetails();
//		alllist.forEach(e-> System.out.println(e));
		
//		ser.updateNamewithId("Kishan",123);
		
//		ser.deleteById(8787);
		
        List<String> name=ser.getAllNames();
        name.forEach(e->System.out.println(e));
        
        List<Integer> id=ser.getAllIdByNames("kiran");
        id.forEach(e->System.out.println(e));
		
	}
	
	
}
