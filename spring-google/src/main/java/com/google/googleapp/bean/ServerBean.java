package com.google.googleapp.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class ServerBean {
	
	private int serverId;
	private String serverName;
	private String serverLoc;
	
	public ServerBean(@Value("765")int serverId,@Value("Ghost") String serverName,@Value("Mumbai") String serverLoc) {
		super();
		this.serverId = serverId;
		this.serverName = serverName;
		this.serverLoc = serverLoc;
	}

	public int getServerId() {
		return serverId;
	}

	public void setServerId(int serverId) {
		this.serverId = serverId;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getServerLoc() {
		return serverLoc;
	}

	public void setServerLoc(String serverLoc) {
		this.serverLoc = serverLoc;
	}

	@Override
	public String toString() {
		return "ServerBean [serverId=" + serverId + ", serverName=" + serverName + ", serverLoc=" + serverLoc + "]";
	}
	
	

}
