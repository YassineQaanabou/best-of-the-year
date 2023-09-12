package org.learning.bestoftheyear.model;

public class Movies {
    private int movieId;
    private String movieName;

    public Movies(int movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }

    public Movies() {
    }

    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
