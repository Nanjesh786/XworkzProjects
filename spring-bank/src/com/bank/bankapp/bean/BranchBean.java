package com.bank.bankapp.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class BranchBean {

	
@Value("45")	
private int branchId;
@Value("near palace")	
private String branchAddress;
@Value("YESYES")	
private String branchManager;
	
	public BranchBean()
	{
		System.out.println("branchbean created");
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public String getBranchManager() {
		return branchManager;
	}

	public void setBranchManager(String branchManager) {
		this.branchManager = branchManager;
	}
	
	
}
