package com.windows.windowsapp.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VersionBean {

@Value("567")	private int versionId;
@Value("win10")	private String currentVersion;
@Value("6/7/2008")	private String releseDate;
	
	public VersionBean()
	{
		System.out.println("versionbean created");
	}

	public int getVersionId() {
		return versionId;
	}

	public void setVersionId(int versionId) {
		this.versionId = versionId;
	}

	public String getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
	}

	public String getReleseDate() {
		return releseDate;
	}

	public void setReleseDate(String releseDate) {
		this.releseDate = releseDate;
	}
	
	
}
