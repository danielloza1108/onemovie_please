package com.onemovieplease.onemovie_please.classes;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MovieApi {
    public void getFilmFromApi(){
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "https://api.themoviedb.org/3/discover/movie?api_key=ae22655d10ba154730725dc320931685&language=en" +
                "-US&sort_by=popularity.desc&include_adult=false&include_video=false&page=1&with_genres=28";
        ResponseEntity<MovieDto> movie = restTemplate.getForEntity(fooResourceUrl, MovieDto.class);
        MovieDto movies = movie.getBody();

        assert movies != null;
        System.out.println(movies.getMovie()[0].getTitle());

    }
}
