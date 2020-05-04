package com.skilldistillery.filmquery.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.skilldistillery.filmquery.database.DatabaseAccessor;
import com.skilldistillery.filmquery.database.DatabaseAccessorObject;
import com.skilldistillery.filmquery.entities.Film;

public class FilmQueryApp {
	public static Scanner input = new Scanner(System.in);
	DatabaseAccessor db = new DatabaseAccessorObject();
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
			while (!input.hasNextInt()) {
				System.out.println("\nPlease enter a valid menu option!\n");
				ui.printMenu();
				input.nextLine();
			}
			option = input.nextInt();
			switch (option) {
			case 1:
				option1();
				break;
			case 2:
				option2();
				break;
			case 3:
				System.out.println("\n\t\tGoodbye!");
				break;
			default:
				System.out.println("\nPlease enter a valid menu option!\n");
			}
		} while (option != 3);
	}

	public void option1() {
		Film film = null;
		System.out.print("\nEnter film ID: ");
		while (!input.hasNextInt()) {
			System.out.print("\nPlease enter a valid integer ID: ");
			input.nextLine();
		}
		int id = input.nextInt();
		try {
			film = db.findFilmById(id);
			if (film == null) {
				System.out.println("\nFilm not found!\n");
			} else {
				System.out.println();
				ui.printFilmInfo(film);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void option2() {
		input.nextLine();
		List<Film> results = new ArrayList<>();
		String key = "";
		System.out.print("\nEnter film keyword: ");
		key = input.nextLine();
		try {
			results = db.findFilmByKeyword(key);
			if (results.isEmpty()) {
				System.out.println("\nFilm not found!\n");
			} else {
				System.out.println();
				ui.printFilmResults(results);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
