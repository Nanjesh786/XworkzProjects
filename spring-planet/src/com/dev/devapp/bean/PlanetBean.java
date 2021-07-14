package com.dev.devapp.bean;

import java.io.Serializable;

public class PlanetBean implements Serializable {

	private int planetId;
	private String planetName;
	private int revolutionSpeed;
	private boolean waterAvailable;
	
	public PlanetBean()
	{
		System.out.println(this.getClass().getSimpleName() +"created");
	}

	public int getPlanetId() {
		return planetId;
	}

	public void setPlanetId(int planetId) {
		this.planetId = planetId;
	}

	public String getPlanetName() {
		return planetName;
	}

	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}

	public int getRevolutionSpeed() {
		return revolutionSpeed;
	}

	public void setRevolutionSpeed(int revolutionSpeed) {
		this.revolutionSpeed = revolutionSpeed;
	}

	public boolean isWaterAvailable() {
		return waterAvailable;
	}

	public void setWaterAvailable(boolean waterAvailable) {
		this.waterAvailable = waterAvailable;
	}

	@Override
	public String toString() {
		return "PlanetBean [planetId=" + planetId + ", planetName=" + planetName + ", revolutionSpeed="
				+ revolutionSpeed + ", waterAvailable=" + waterAvailable + "]";
	}
	
	
}
