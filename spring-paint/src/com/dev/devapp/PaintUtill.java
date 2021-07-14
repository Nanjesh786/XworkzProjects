package com.dev.devapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dev.devapp.bean.PaintBean;

public class PaintUtill {

	
	public static void main(String[] args) {
		
		
		    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		    
	PaintBean bean=	     applicationContext.getBean(PaintBean.class);
		    
	System.out.println(bean);
		
	}
	
}
