package com.skilldistillery.filmquery.database;

import java.util.List;
import com.skilldistillery.filmquery.entities.Actor;
import com.skilldistillery.filmquery.entities.Film;

public interface DatabaseAccessor {
	public Film findFilmById(int filmId);
	public Actor findActorById(int actorId);
	public List<Film> findFilmByKeyword(String keyword);
	public List<Actor> findActorsByFilmId(int filmId);
	public List<Film> findFilmsByActorId(int actorId);
}
