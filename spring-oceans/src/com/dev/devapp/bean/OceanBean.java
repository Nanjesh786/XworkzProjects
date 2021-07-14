package com.dev.devapp.bean;

import java.io.Serializable;

public class OceanBean implements Serializable{

	private String oceanName;
	private String ocenaLoc;
	private String oceanSize;
	
	public OceanBean(String oceanName, String ocenaLoc, String oceanSize) {
		super();
		this.oceanName = oceanName;
		this.ocenaLoc = ocenaLoc;
		this.oceanSize = oceanSize;
	}

	public String getOceanName() {
		return oceanName;
	}

	public void setOceanName(String oceanName) {
		this.oceanName = oceanName;
	}

	public String getOcenaLoc() {
		return ocenaLoc;
	}

	public void setOcenaLoc(String ocenaLoc) {
		this.ocenaLoc = ocenaLoc;
	}

	public String getOceanSize() {
		return oceanSize;
	}

	public void setOceanSize(String oceanSize) {
		this.oceanSize = oceanSize;
	}

	@Override
	public String toString() {
		return "OceanBean [oceanName=" + oceanName + ", ocenaLoc=" + ocenaLoc + ", oceanSize=" + oceanSize + "]";
	}

	
	
}
