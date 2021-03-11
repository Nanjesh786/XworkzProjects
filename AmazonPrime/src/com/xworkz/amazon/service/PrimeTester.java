package com.xworkz.amazon.service;

import com.xworkz.amazon.dao.AmazonPrimeDao;
import com.xworkz.amazon.dao.AmazonPrimeDaoImplies;
import com.xworkz.amazon.dto.AmazonPrimeDto;

public class PrimeTester {
	
	public static void main(String[] args) {
		
		AmazonPrimeDto dto=new AmazonPrimeDto("KGF2","YASH","KANNADA",9866976,"23/7/2021");
		AmazonPrimeDto dto1=new AmazonPrimeDto("A","UPENDRA","KANNADA",8766976,"08/5/2000");
		AmazonPrimeDto dto2=new AmazonPrimeDto("BELL BOTTOM","RISHAB SHEETY","KANNADA",7656976,"13/9/2027");
		AmazonPrimeDto dto3=new AmazonPrimeDto("SUPER","UPENDRA","KANNADA",7786876,"18/9/2011");
		AmazonPrimeDto dto4=new AmazonPrimeDto("NAGARAHAVVU","VISHNUVARDHAN","KANNADA",986687976,"7/7/1972");
		AmazonPrimeService key=new AmazonPrimeServiceImplies();
		key.validsignin("amazon@prime.com","amazonprime");
		key.addmovie(dto);
		key.addmovie(dto1);
		key.addmovie(dto2);
		key.addmovie(dto3);
		key.addmovie(dto4);
		key.displayMovieDetails();
		key.viewSubscribers();
	}

}
