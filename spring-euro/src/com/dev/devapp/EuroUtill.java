package com.dev.devapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dev.devapp.bean.EuroBean;

public class EuroUtill {
public static void main(String[] args) {
ApplicationContext applicationContext=new ClassPathXmlApplicationContext("context.xml");
     EuroBean bean=  applicationContext.getBean(EuroBean.class);
     System.out.println(bean);
}  
}
