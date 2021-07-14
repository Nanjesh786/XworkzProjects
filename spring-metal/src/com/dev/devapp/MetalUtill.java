package com.dev.devapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dev.devapp.bean.MetalBean;

public class MetalUtill {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("context.xml");
		
MetalBean bean=		  applicationContext.getBean(MetalBean.class);
		  
		System.out.println(bean);
	}
}
