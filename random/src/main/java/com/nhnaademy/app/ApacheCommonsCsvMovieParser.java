package com.nhnaademy.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class ApacheCommonsCsvMovieParser implements MovieParser {

    @Override
    public List<Movie> parse() throws IOException {
        InputStream in = getMovieFileAsStream();

        List<Movie> movieList = new ArrayList<>();

        try (BufferedReader csvData = new BufferedReader(new InputStreamReader(in))) {

            CSVParser parser = CSVParser.parse(csvData, CSVFormat.EXCEL);
            List<CSVRecord> csvRecordList = parser.getRecords();

            for (int record_i = 1; record_i < csvRecordList.size(); record_i++) {

                Movie movie = new Movie();

                movie.setMovieId(Long.parseLong(csvRecordList.get(record_i).get(0)));

                movie.setTitle(csvRecordList.get(record_i).get(1));

                String[] genreArr = csvRecordList.get(record_i).get(2).split("\\|");
                for (String genre : genreArr) {
                    movie.addGenres(genre);
                }

                movieList.add(movie);

            }

        }

        return movieList;
    }

}
