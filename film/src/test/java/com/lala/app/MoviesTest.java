package com.lala.app;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class MoviesTest {
    @Test
    public void createTest() {
        Movies movie = new Movies();
        assertNotNull(movie);
    }
}