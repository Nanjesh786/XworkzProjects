package com.furniture.furnitureapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.furniture.furnitureapp.bean.FurnitureBean;

public class FurnitureTester {

	
	public static void main(String[] args) {
		
		
		ApplicationContext context =new ClassPathXmlApplicationContext("context.xml");
		      FurnitureBean bean=    context.getBean(FurnitureBean.class);
		System.out.println(bean);
	}
}
