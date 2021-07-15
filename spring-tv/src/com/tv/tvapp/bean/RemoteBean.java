package com.tv.tvapp.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RemoteBean {

	@Value("7687")
	private int remoteId;
	@Value("Black")
	private String colour;
	@Value("5m")
	private String range;
	
	public RemoteBean(int remoteId, String colour, String range) {
		super();
		this.remoteId = remoteId;
		this.colour = colour;
		this.range = range;
	}
	public RemoteBean()
	{
		System.out.println("remotebean created");
	}
	public int getRemoteId() {
		return remoteId;
	}
	public void setRemoteId(int remoteId) {
		this.remoteId = remoteId;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	@Override
	public String toString() {
		return "RemoteBean [remoteId=" + remoteId + ", colour=" + colour + ", range=" + range + "]";
	}
	
	
}
