package com.dev.devapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dev.devapp.bean.LaptopBean;

public class LaptopUtill {

	 public static void main(String[] args) {
		 
		 ApplicationContext applicationContext =new ClassPathXmlApplicationContext("context.xml");
		 LaptopBean bean= applicationContext.getBean(LaptopBean.class);
		 System.out.println(bean);
		 System.out.println(bean.getProcessor().getProcessorName());
	}
}
