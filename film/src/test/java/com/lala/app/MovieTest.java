package com.lala.app;

import org.junit.Test;
import static org.junit.Assert.*;
import com.lala.app.repository.MovieRepository;
import com.lala.app.repository.MovieRepositoryFactory;
import com.lala.app.domain.Movie;

import org.junit.Before;

public class MovieTest {
    
    MovieRepository movieRepository;

    @Before
    public void initRepository() {

        movieRepository = MovieRepositoryFactory.getInstance();
        Movie movie1 = new Movie();
        Movie movie2 = new Movie();
        

        movie1.setId(1);
        movie1.setTitle("Titanic");
        movie1.setYear(1997);
        movie1.setGenre("Katastroficzny");
        movie1.setDirector("James Cameron");

        movie2.setId(1);
        movie2.setTitle("Nietykalni");
        movie2.setYear(2011);
        movie2.setGenre("Dramat");
        movie2.setDirector("Olivier Nakache");

        movieRepository.add(movie1);
        movieRepository.add(movie2);
        
    }


    @Test
    public void getById() {
        int findId = 1;
        assertNotNull(movieRepository.getById(findId));
    }

    @Test
    public void getAll() {
        assertNotNull(movieRepository.getAll());
    }

    @Test
    public void addMovie() {
        Movie movie = new Movie();
        movie.setId(1);
        movie.setTitle("Titanic");
        movie.setYear(1997);
        movie.setGenre("Katastroficzny");
        movie.setDirector("James Cameron");
        movieRepository.add(movie);
        assertNotNull(movieRepository.getById(movie.getId()));

    }

     @Test
    public void updateMovie() {
        Movie movie = new Movie();
        movie.setId(1);
        movie.setTitle("Titanic");
        movie.setYear(1997);
        movie.setGenre("Katastroficzny");
        movie.setDirector("James Cameron");
        int updateId = 1;
        movieRepository.update(updateId, movie);
        assertEquals(movieRepository.getById(updateId).getTitle(), movie.getTitle());

        for (Movie movieFromList : movieRepository.getAll()) {
            if (movieFromList.getId() == updateId) {
                assertNotEquals(movieFromList.getTitle(), movie.getTitle());
            }
        }
    }

    @Test
    public void deleteMovie() {
        Movie movie = movieRepository.getById(1);
        movieRepository.delete(movie);
        if (movieRepository.getAll().size() > 0) {
            assertNotNull(movieRepository.getAll());
        } else {
            assertNull(movieRepository.getById(movie.getId()));
        }
    }
   

}
