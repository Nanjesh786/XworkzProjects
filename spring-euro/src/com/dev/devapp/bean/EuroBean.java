package com.dev.devapp.bean;

import java.io.Serializable;

public class EuroBean implements Serializable {

	private String hostCountry;
	private int year;
	private String defendingChampions;
	private String winner;

	public EuroBean()
{
	System.out.println(this.getClass().getSimpleName() +"created");
}
	public EuroBean(String hostCountry, int year, String defendingChampions, String winner) {
		this.hostCountry = hostCountry;
		this.year = year;
		this.defendingChampions = defendingChampions;
		this.winner = winner;
	}

	public String getHostCountry() {
		return hostCountry;
	}

	public void setHostCountry(String hostCountry) {
		this.hostCountry = hostCountry;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDefendingChampions() {
		return defendingChampions;
	}

	public void setDefendingChampions(String defendingChampions) {
		this.defendingChampions = defendingChampions;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	@Override
	public String toString() {
		return "EuroBean [hostCountry=" + hostCountry + ", year=" + year + ", defendingChampions=" + defendingChampions
				+ ", winner=" + winner + "]";
	}
	
	
	
	
}
