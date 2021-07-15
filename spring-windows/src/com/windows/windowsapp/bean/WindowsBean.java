package com.windows.windowsapp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WindowsBean {
   
@Value("677")	private int windowsId;
@Value("6/7/2008")	private String windowsReleaseDate;
@Value("6676")	private int cost;
@Autowired	private VersionBean version;
	
	public WindowsBean()
	{
		System.out.println("windowsbean created");
	}

	public int getWindowsId() {
		return windowsId;
	}

	public void setWindowsId(int windowsId) {
		this.windowsId = windowsId;
	}

	public String getWindowsReleaseDate() {
		return windowsReleaseDate;
	}

	public void setWindowsReleaseDate(String windowsReleaseDate) {
		this.windowsReleaseDate = windowsReleaseDate;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public VersionBean getVersion() {
		return version;
	}

	public void setVersion(VersionBean version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "WindowsBean [windowsId=" + windowsId + ", windowsReleaseDate=" + windowsReleaseDate + ", cost=" + cost
				+ "]";
	}
	
	
}
