package com.xworkz.xworkzapp.game;

import java.util.Scanner;

public class Game {

	static Scanner scanner=new Scanner(System.in);	
	
	public static void main(String[] args) 
	{
	Game play= new Game();
	char c=' ';
	do {
		play.run();
	 System.out.println("enter y to continue or n to exit");
     c = scanner.next().charAt(0);
	}while(c=='y');
	
		
		
	}
	void run()
	{
		System.out.println("enter a number");
		int n= scanner.nextInt();
		int i=1;
		do {
			System.out.println("Welcome");
			i++;
		}while(i<=n);
		}
	}
	
	

