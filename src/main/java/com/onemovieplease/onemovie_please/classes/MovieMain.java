package com.onemovieplease.onemovie_please.classes;

import com.fasterxml.jackson.core.JsonProcessingException;

public class MovieMain {
    public static void main(String[] args) {
        MovieApi movieApi = new MovieApi();
            movieApi.getFilmFromApi();

    }
}
