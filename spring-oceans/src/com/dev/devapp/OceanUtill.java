package com.dev.devapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dev.devapp.bean.OceanBean;

public class OceanUtill {

	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("context.xml");
		
	OceanBean bean=	applicationContext.getBean(OceanBean.class);
		System.out.println(bean);
		
	}
}
