package com.book.bookapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookUtill {

	
	 public static void main(String[] args) {
		
		 ApplicationContext applicationContext =new ClassPathXmlApplicationContext("context.xml");
		 
BookBean bean	=	 applicationContext.getBean(BookBean.class);
	 System.out.println(bean);
	 
	 }
}
