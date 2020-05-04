package com.skilldistillery.filmquery.app;

import java.util.List;
import java.util.Scanner;
import com.skilldistillery.filmquery.entities.Actor;
import com.skilldistillery.filmquery.entities.Film;

public class UserInterface {
	public Scanner kb = new Scanner(System.in);
	
	public UserInterface() {
		printBanner();
	}
	
	public void printBanner() {
		System.out.println("+--------------------+");
		System.out.println("|  BLOCKBUSTER  APP  |");
		System.out.println("+--------------------+");
		System.out.println();
	}
	
	public void printMenu() {
		System.out.println("Please make a selection from the Menu:");
		System.out.println("1. Look up film by ID");
		System.out.println("2. Look up film by keyword");
		System.out.println("3. Exit");
		System.out.print("> ");
	}
	
	public void printSubMenu() {
		System.out.println();
		System.out.println("  1) View all details");
		System.out.println("  2) Return to Menu");
		System.out.print("  >");
	}
	
	public void printFilmInfo(Film film) {
		StringBuilder sb = new StringBuilder();
		sb.append("Title:\t\t" + film.getTitle() + "\n");
		sb.append("Year:\t\t" + film.getReleaseYear() + "\n");
		sb.append("Rating:\t\t" + film.getRating() + "\n");
		sb.append("Language:\t" + film.getLanguage() + "\n");
		sb.append("Description:\t" + film.getDescription() + "\n");
		System.out.println(sb);
		System.out.println(printFilmCast(film.getActors()));
	}
	
	public void printFilmInfoFull(Film film) {
		StringBuilder sb = new StringBuilder("Film ID:\t"+film.getId()+"\n");
		sb.append("Title:\t\t" + film.getTitle() + "\n");
		sb.append("Year:\t\t" + film.getReleaseYear() + "\n");
		sb.append("Rating:\t\t" + film.getRating() + "\n");
		sb.append("Language ID:\t" + film.getLanguageId() + "\n");
		sb.append("Language:\t" + film.getLanguage() + "\n");
		sb.append("Length:\t\t" + film.getLength() + "\n");
		sb.append("Rental Dur:\t" + film.getRentalDuration() + "\n");
		sb.append("Rental Rate\t" + film.getRentalRate() + "\n");
		sb.append("Rep Cost:\t" + film.getReplacementCost() + "\n");
		sb.append("Description:\t" + film.getDescription() + "\n");
		sb.append("Special Feat:\t" + film.getSpecialFeatures() + "\n");
		System.out.println(sb);
		System.out.println(printFilmCast(film.getActors()));
	}
	
	public void printFilmResults(List<Film> results) {
		for (Film film : results) {
			System.out.println("Film ID:\t" + film.getId());
			printFilmInfo(film);
		}
		System.out.println("---Total Results---");
		System.out.println("     "+results.size()+" Films\n");
	}
	
	public StringBuilder printFilmCast(List<Actor> cast) {
		StringBuilder sb = new StringBuilder("\t\t=====CAST=====\n");
		for (Actor actor : cast) {
			sb.append("\t\t"+actor.getFirstName()+" "+actor.getLastName()+"\n");
		}
		return sb;
	}
}
