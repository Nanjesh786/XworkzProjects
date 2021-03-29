package com.xworkz.app;

public class FootballWorldCupDto {
	
	private String host;
	private int year;
	private String champions;
	private String runnerups;
	
	
	public FootballWorldCupDto(String host, int year, String champions, String runnerups) {
		super();
		this.host = host;
		this.year = year;
		this.champions = champions;
		this.runnerups = runnerups;
	}


	public String getHost() {
		return host;
	}


	public int getYear() {
		return year;
	}


	public String getChampions() {
		return champions;
	}


	public String getRunnerups() {
		return runnerups;
	}


	public void setHost(String host) {
		this.host = host;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public void setChampions(String champions) {
		this.champions = champions;
	}


	public void setRunnerups(String runnerups) {
		this.runnerups = runnerups;
	}
	
	

}
