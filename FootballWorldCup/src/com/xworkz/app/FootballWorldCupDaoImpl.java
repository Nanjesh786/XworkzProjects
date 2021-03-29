package com.xworkz.app;

import java.util.Iterator;
import java.util.LinkedList;

public class FootballWorldCupDaoImpl implements FootballWorldCupDao{

	
	LinkedList list=new LinkedList();
	

	@Override
	public void addDetails(FootballWorldCupDto dto) {
		list.push(dto);
		System.out.println("Element pushed Successfully");
		
	}

	@Override
	public void removeDetails() {
	 list.pop();
		
         System.out.println("Element poped Successfully and size of the Linkedlist is"+" "+list.size());
	}


	@Override
	public void displayInfo() {
		Iterator iterator=list.iterator();
		
		while(iterator.hasNext()) {
			FootballWorldCupDto dto=(FootballWorldCupDto)iterator.next();
			System.out.println("**********************************");
			System.out.println("Welcome to WorldCup");
			System.out.println("The Host Country is:"+" "+dto.getHost());
			System.out.println("The year is:"+" "+dto.getYear());
			System.out.println("The Champions are"+" "+dto.getChampions());
			System.out.println("The RunnerUps are"+" "+dto.getRunnerups());
			System.out.println("**********************************");
			
			
		}
	}
	
	
	
}
