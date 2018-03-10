package com.lala.app.domain;

import java.util.ArrayList;

public class Movie
{
    public int id;
    public String title;
    public int year;    
    public String genre;
    public String director;      


public int getId() {
        return id;
    }

    public void setId(int d) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirextor() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}