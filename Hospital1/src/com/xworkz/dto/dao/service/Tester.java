package com.xworkz.dto.dao.service;

import com.xworkz.dto.Hospitaldto;

public class Tester {
	
	public static void main(String[] args) {
		
		Hospitaldto dto=new Hospitaldto("LICNO001","BgsHospital","vijaynagar","Vishnu","Multispecility","9876533289");
		Hospitaldto dto1=new Hospitaldto("LICNO002","SugunaHospital","Rajajinagar","Vijay","Cardiospecility","8754378765");
		Hospitaldto dto2=new Hospitaldto("LICNO003","MviHospital","Jayanagar","Krishna","Neurospecility","9876533898");
		Hospitaldto dto3=new Hospitaldto("LICNO004","ManipalHospital","Shubashnagar","Arjun","Kidneyspecility","8776533298");
		Hospitaldto dto4=new Hospitaldto("LICNO005","ApolloHospital","Banashankari","Gopal","Multispecility","7576533289");
		
		HospitalService ser=new HospitalServiceImplies();
		ser.validateLicenseNo(dto);
		ser.validateLicenseNo(dto1);
		ser.validateLicenseNo(dto2);
		ser.validateLicenseNo(dto3);
		ser.validateLicenseNo(dto4);
		ser.validDisplay();
		//ser.validUpdate("LICNO001","9876533289","VikramHospital");
		//ser.validDisplay();

		ser.validDisplayAll("LICNO001","9876533289");
		//ser.validDelete("Bbhdafadhfh");
		
	}

}
