package com.google.googleapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.googleapp.bean.GoogleBean;

public class GoogleUtil {
	
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("context.xml");
		GoogleBean bean=  context.getBean(GoogleBean.class);
		System.out.println(bean);
		System.out.println(bean.getServer().getServerId());
		
		
	}

}
