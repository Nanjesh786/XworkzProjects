package com.dev.devapp.bean;

import java.io.Serializable;

public class PaintBean implements Serializable{

	private int paintId;
	private String paintCompany;
	private String paintColour;
	private int paintCost;

	public int getPaintId() {
		return paintId;
	}
	public void setPaintId(int paintId) {
		this.paintId = paintId;
	}
	public String getPaintCompany() {
		return paintCompany;
	}
	public void setPaintCompany(String paintCompany) {
		this.paintCompany = paintCompany;
	}
	public String getPaintColour() {
		return paintColour;
	}
	public void setPaintColour(String paintColour) {
		this.paintColour = paintColour;
	}
	public int getPaintCost() {
		return paintCost;
	}
	public void setPaintCost(int paintCost) {
		this.paintCost = paintCost;
	}
	@Override
	public String toString() {
		return "PaintBean [paintId=" + paintId + ", paintCompany=" + paintCompany + ", paintColour=" + paintColour
				+ ", paintCost=" + paintCost + "]";
	}
	
	
}
