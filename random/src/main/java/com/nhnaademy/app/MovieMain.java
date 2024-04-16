package com.nhnaademy.app;

import java.util.List;

public class MovieMain {
    public static void main(String[] args) {
        MovieParser movieParser = new ApacheCommonsCsvMovieParser();

        try {
            List<Movie> movieList = movieParser.parse();
            for (Movie movie : movieList) {
                System.out.print(movie.getMovieId() + ", " + movie.getTitle() + ", ");
                for (String genre : movie.getGenres()) {
                    System.out.print(genre + " | ");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
