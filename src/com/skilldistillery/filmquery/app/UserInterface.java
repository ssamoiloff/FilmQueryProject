package com.skilldistillery.filmquery.app;

import java.util.Scanner;

public class UserInterface {
	public Scanner kb = new Scanner(System.in);
	
	public UserInterface() {
		printBanner();
		printMenu();
	}
	
	public void printBanner() {
		System.out.println("+--------------------+");
		System.out.println("|  BLOCKBUSTER  APP  |");
		System.out.println("+--------------------+");
		System.out.println();
	}
	
	public void printMenu() {
		System.out.println("Please make a selection from the menu:\n");
		System.out.println("1. Look up film by ID");
		System.out.println("2. Look up film by keyword");
		System.out.println("3. Exit");
		System.out.print("> ");
	}
	
	public void userInput() {
		int menuChoice = kb.nextInt();
		
		switch(menuChoice) {
		case 1:
			
			break;
		case 2:
			break;
		case 3:
			break;
		}
	}
}
