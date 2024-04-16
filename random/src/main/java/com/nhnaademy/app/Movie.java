package com.nhnaademy.app;

import java.util.HashSet;
import java.util.Set;

public class Movie {
    private long movieId;
    private String title;
    private Set<String> genres;

    public Movie() {
        genres = new HashSet<>();
    }

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<String> getGenres() {
        return genres;
    }

    public void addGenres(String genre) {
        genres.add(genre);
    }

}
