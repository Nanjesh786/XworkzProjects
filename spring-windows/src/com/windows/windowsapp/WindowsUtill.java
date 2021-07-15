package com.windows.windowsapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.windows.windowsapp.bean.WindowsBean;

public class WindowsUtill {

	 public static void main(String[] args) {
		
		  ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		  WindowsBean bean= context.getBean(WindowsBean.class);
		  System.out.println(bean);
		  System.out.println(bean.getVersion().getCurrentVersion());
	}
}
