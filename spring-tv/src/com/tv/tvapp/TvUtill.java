package com.tv.tvapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tv.tvapp.bean.RemoteBean;
import com.tv.tvapp.bean.TvBean;

public class TvUtill {

	
	public static void main(String[] args) {
		
		 ApplicationContext applicationContext= new ClassPathXmlApplicationContext("context.xml");
		 
		TvBean bean= applicationContext.getBean(TvBean.class);
		 System.out.println(bean);
		System.out.println(bean.getRemote().getRange());
		 
	}
}
