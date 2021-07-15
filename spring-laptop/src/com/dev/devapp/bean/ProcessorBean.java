package com.dev.devapp.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProcessorBean {

@Value("787")	private int processorId;
@Value("Intel i7")	private String processorName;
@Value("3")	private int processorSpeed;
@Value("787878")	private int processorPrice;
	
	public ProcessorBean()
	{
	       System.out.println("processorBean created");
	}
	public ProcessorBean(int processorId, String processorName, int processorSpeed, int processorPrice) {
		super();
		this.processorId = processorId;
		this.processorName = processorName;
		this.processorSpeed = processorSpeed;
		this.processorPrice = processorPrice;
	}

	@Override
	public String toString() {
		return "ProcessorBean [processorId=" + processorId + ", processorName=" + processorName + ", processorSpeed="
				+ processorSpeed + ", processorPrice=" + processorPrice + "]";
	}

	public int getProcessorId() {
		return processorId;
	}

	public void setProcessorId(int processorId) {
		this.processorId = processorId;
	}

	public String getProcessorName() {
		return processorName;
	}

	public void setProcessorName(String processorName) {
		this.processorName = processorName;
	}

	public int getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	public int getProcessorPrice() {
		return processorPrice;
	}

	public void setProcessorPrice(int processorPrice) {
		this.processorPrice = processorPrice;
	}
	
}
