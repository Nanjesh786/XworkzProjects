package com.soap.soapapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soap.soapapp.dto.SoapDTO;
import com.soap.soapapp.service.Service;

public class SoapTester {
	
	
	public static void main(String[] args) {
		
		
		 ApplicationContext context =new ClassPathXmlApplicationContext("resources/context.xml");
		          SoapDTO dto=new SoapDTO();
		          dto.setSoapId(12);
		          dto.setSoapName("LUX");
		          dto.setSoapColour("pink");
		          dto.setPrice(45);
		      Service service=    context.getBean(Service.class);
		          service.validateAndCreateDTO(dto);
		          System.out.println("dto added successfully");
		          
		          
		 
	}

}
