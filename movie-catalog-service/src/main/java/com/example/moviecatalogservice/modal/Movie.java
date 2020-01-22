package com.example.moviecatalogservice.modal;

public class Movie {
    private int movieId;
    private String name;

    public int getMovieId() {
        return movieId;
    }

    public Movie(){

    }
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public Movie(int movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
