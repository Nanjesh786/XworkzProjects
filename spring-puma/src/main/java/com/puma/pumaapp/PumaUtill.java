package com.puma.pumaapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.puma.pumaapp.bean.PumaBean;

public class PumaUtill {

	
	public static void main(String[] args) {
		
		 ApplicationContext  context=new ClassPathXmlApplicationContext("context.xml");
		PumaBean bean= context.getBean(PumaBean.class);
		System.out.println(bean);
		
	}
}
