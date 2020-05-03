package com.skilldistillery.filmquery.app;

import java.sql.SQLException;
import java.util.Scanner;

import com.skilldistillery.filmquery.database.DatabaseAccessor;
import com.skilldistillery.filmquery.database.DatabaseAccessorObject;
import com.skilldistillery.filmquery.entities.Film;

public class FilmQueryApp {
	DatabaseAccessor db = new DatabaseAccessorObject();
	static Scanner input = new Scanner(System.in);
	UserInterface ui;

	public static void main(String[] args) {
		FilmQueryApp app = new FilmQueryApp();
		app.launch();
		input.close();
	}

	private void launch() {
		ui = new UserInterface();
		menuLogic();

	}
	
	public void menuLogic() {
		int option = 0;
		do {
			ui.printMenu();
			option = input.nextInt();
			switch(option) {
			case 1:
				option1();
				break;
			case 2:
				option2();
				break;
			case 3:
				System.out.println("\t\tGoodbye!");
				break;
			default:
				System.out.println("\nPlease enter a valid menu option!\n");
			}
		} while(option != 3);
	}
	
	public void option1() {
		Film film = null;
		System.out.print("\nEnter film ID: ");
		try {
			film = db.findFilmById(FilmQueryApp.input.nextInt());
			if (film == null) {
				System.out.println("Film not found!");
			} else {
				System.out.println();
				ui.printFilmInfo(film);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void option2() {
		
	}
}
