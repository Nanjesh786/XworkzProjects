package com.dev.devapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dev.devapp.bean.StationaryBean;

public class StationaryUtill {

	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("context.xml");
		StationaryBean bean=applicationContext.getBean(StationaryBean.class);
		System.out.println(bean);
		bean.provideItems();
	}
}
