package com.example.moviecatalogservice.modal;
public class Rating {
    int movieId;
    int rating;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public Rating(int movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
