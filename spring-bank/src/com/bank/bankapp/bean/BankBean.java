package com.bank.bankapp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BankBean {
	
	@Value("788")	
	private int bankId;
	@Value("YES BANK")
	private String bankName;
	@Value("MYSORE")	
	private String bankCity;
	@Autowired
	private BranchBean branch;

	public BankBean()
	{
		System.out.println("bankbean created");
	}
	
	public BankBean(int bankId, String bankName, String bankCity, BranchBean branch) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.bankCity = bankCity;
		this.branch = branch;
	}


	public int getBankId() {
		return bankId;
	}


	public void setBankId(int bankId) {
		this.bankId = bankId;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getBankCity() {
		return bankCity;
	}


	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}


	public BranchBean getBranch() {
		return branch;
	}


	public void setBranch(BranchBean branch) {
		this.branch = branch;
	}


	@Override
	public String toString() {
		return "BankBean [bankId=" + bankId + ", bankName=" + bankName + ", bankCity=" + bankCity + "]";
	}
	
	

}
