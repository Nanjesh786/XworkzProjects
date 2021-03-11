package com.xworkz.amazon.dto;

public class AmazonPrimeDto {

	private String movieName;
	private String hero;
	private String language;
	private int noOfSubscribers;
	private String releaseDate;
	
	
	public AmazonPrimeDto(String movieName, String hero, String language, int noOfSubscribers, String releaseDate) {
		super();
		this.movieName = movieName;
		this.hero = hero;
		this.language = language;
		this.noOfSubscribers = noOfSubscribers;
		this.releaseDate = releaseDate;
	}


	public String getMovieName() {
		return movieName;
	}


	public String getHero() {
		return hero;
	}


	public String getLanguage() {
		return language;
	}


	public int getNoOfSubscribers() {
		return noOfSubscribers;
	}


	public String getReleaseDate() {
		return releaseDate;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public void setHero(String hero) {
		this.hero = hero;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public void setNoOfSubscribers(int noOfSubscribers) {
		this.noOfSubscribers = noOfSubscribers;
	}


	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
}
	
	
	
	