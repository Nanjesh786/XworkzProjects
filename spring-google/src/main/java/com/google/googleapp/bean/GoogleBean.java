package com.google.googleapp.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class GoogleBean implements Serializable {

	 private int noOfEmployees;
	 private String ceoName;
	 private String headquaters;
	 private ServerBean server;
	
	 @Autowired
	 public GoogleBean(@Value("78987") int noOfEmployees,@Value("Sundar pichai") String ceoName,@Value("USA") String headquaters, ServerBean server) {
		super();
		this.noOfEmployees = noOfEmployees;
		this.ceoName = ceoName;
		this.headquaters = headquaters;
		this.server = server;
	}


	public int getNoOfEmployees() {
		return noOfEmployees;
	}


	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}


	public String getCeoName() {
		return ceoName;
	}


	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}


	public String getHeadquaters() {
		return headquaters;
	}


	public void setHeadquaters(String headquaters) {
		this.headquaters = headquaters;
	}


	public ServerBean getServer() {
		return server;
	}


	public void setServer(ServerBean server) {
		this.server = server;
	}


	@Override
	public String toString() {
		return "GoogleBean [noOfEmployees=" + noOfEmployees + ", ceoName=" + ceoName + ", headquaters=" + headquaters
				+ ", server=" + server + "]";
	}


	 
	 
}
