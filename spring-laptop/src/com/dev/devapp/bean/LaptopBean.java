package com.dev.devapp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LaptopBean {

@Value("677")	private int laptopId;
@Value("DELL")	private String laptopBrand;
@Value("Grey")	private String laptopColour;
@Autowired	private ProcessorBean processor;
	
	public LaptopBean()
	{
		System.out.println("laptopbean created");
	}
	public LaptopBean(int laptopId, String laptopBrand, String laptopColour, ProcessorBean processor) {
		super();
		this.laptopId = laptopId;
		this.laptopBrand = laptopBrand;
		this.laptopColour = laptopColour;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "LaptopBean [laptopId=" + laptopId + ", laptopBrand=" + laptopBrand + ", laptopColour=" + laptopColour
				+ ", processor=" + processor + "]";
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopBrand() {
		return laptopBrand;
	}

	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}

	public String getLaptopColour() {
		return laptopColour;
	}

	public void setLaptopColour(String laptopColour) {
		this.laptopColour = laptopColour;
	}

	public ProcessorBean getProcessor() {
		return processor;
	}

	public void setProcessor(ProcessorBean processor) {
		this.processor = processor;
	}
	
}
