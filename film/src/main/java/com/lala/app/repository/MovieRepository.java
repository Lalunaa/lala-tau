package com.lala.app;

import java.util.List;


public interface MovieRepository {


public void initDatabase();

public Movie getById(int id);

public List<Movie> getAll();

public void add(Movie movie);

public void delete(Movie movie);

public void update(int movieId, Movie movie);


}

