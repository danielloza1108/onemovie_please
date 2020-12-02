package com.onemovieplease.onemovie_please.classes;

import com.onemovieplease.onemovie_please.dao.MovieDao;
import com.onemovieplease.onemovie_please.entity.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
@Repository
public class MovieMain{
    public String givenUsingJava8_whenGeneratingRandomAlphanumericString_thenCorrect() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(generatedString);
        return generatedString;
    }


    public static void main(String[] args) {


//        MovieApi movieApi = new MovieApi();
//        MovieDto filmFromApi = movieApi.getFilmFromApi();
//        for (int i = 0; i < filmFromApi.getMovie().length; i++) {
//
//            boolean adult = Boolean.parseBoolean(filmFromApi.getMovie()[i].getAdult());
//            String date = filmFromApi.getMovie()[i].getDate();
////            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
////            LocalDate date1 = LocalDate.parse(date,formatter);
//            int id = Integer.parseInt(filmFromApi.getMovie()[i].getId());
//            String original_language = filmFromApi.getMovie()[i].getOriginal_language();
//            String original_title = filmFromApi.getMovie()[i].getOriginal_title();
//            String overview = filmFromApi.getMovie()[i].getOverview();
//            double popularity = Double.parseDouble(filmFromApi.getMovie()[i].getPopularity());
//            String posterPath = filmFromApi.getMovie()[i].getPosterPath();
//            String title = filmFromApi.getMovie()[i].getTitle();
//            boolean video = Boolean.parseBoolean(filmFromApi.getMovie()[i].getVideo());
//            String voteAvg = filmFromApi.getMovie()[i].getVoteAvg();
//            String voteCount = filmFromApi.getMovie()[i].getVoteCount();
////            Movie movieToSave = new Movie(popularity,voteCount,video,id,adult,date,posterPath,original_language,original_title,genreIds,title,voteAvg,overview);
//
//
//            System.out.println(id);
//            System.out.println(title);
//            System.out.println(posterPath); //null
//            System.out.println(original_language);
//            System.out.println(original_title);
//            System.out.println(overview);
//            System.out.println(popularity);
//            System.out.println(video);
//            System.out.println(voteAvg); //null
//            System.out.println(voteCount); //null
//            System.out.println();
////            movieDao.saveMovie(adult,date,genreIds,id,original_language,original_title,overview,popularity,posterPath,title,video,voteAvg,voteCount);
        }
    }


