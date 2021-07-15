package com.tv.tvapp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TvBean {

	@Value("678")
	private int tvId;
	@Value("LG")
	private String tvName;
	@Value("56inches")
	private String sizeInInches;
	@Value("789898")
	private int price;
	@Autowired
	private RemoteBean remote;
	
	public TvBean()
	{
		System.out.println("TvBean created");
	}
	public TvBean(int tvId, String tvName, String sizeInInches, int price, RemoteBean remote) {
		super();
		this.tvId = tvId;
		this.tvName = tvName;
		this.sizeInInches = sizeInInches;
		this.price = price;
		this.remote = remote;
	}

	public int getTvId() {
		return tvId;
	}

	public void setTvId(int tvId) {
		this.tvId = tvId;
	}

	public String getTvName() {
		return tvName;
	}

	public void setTvName(String tvName) {
		this.tvName = tvName;
	}

	public String getSizeInInches() {
		return sizeInInches;
	}

	public void setSizeInInches(String sizeInInches) {
		this.sizeInInches = sizeInInches;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public RemoteBean getRemote() {
		return remote;
	}

	public void setRemote(RemoteBean remote) {
		this.remote = remote;
	}

	@Override
	public String toString() {
		return "TvBean [tvId=" + tvId + ", tvName=" + tvName + ", sizeInInches=" + sizeInInches + ", price=" + price
				+ "]";
	}
	
}
