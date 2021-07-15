package com.bank.bankapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.bankapp.bean.BankBean;
import com.bank.bankapp.bean.BranchBean;

public class BankUtill {

	
	
	 public static void main(String[] args) {
		
		  ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		  
		 BankBean bean= context.getBean(BankBean.class);
		  System.out.println(bean);
		  System.out.println(bean.getBranch().getBranchManager());
	}
}
