package com.skilldistillery.filmquery.app;

public class UserInterface {
	
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
	}
}
