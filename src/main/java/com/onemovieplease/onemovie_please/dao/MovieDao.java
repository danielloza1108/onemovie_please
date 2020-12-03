package com.onemovieplease.onemovie_please.dao;

import com.onemovieplease.onemovie_please.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.time.LocalDate;

public interface MovieDao extends JpaRepository<Movie,Long> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO movie (adult,date,generes_ids,movie_id,original_language," +
            "original_title,overview,popularity,poster_path,title,video,vote_avg,vote_count) " +
            "VALUES (:adult,:date,:generes_ids,:movie_id,:original_language,:original_title,:overview,:popularity," +
            ":poster_path,:title,:video,:vote_avg,:vote_count)",
            nativeQuery = true)
    void saveMovie(boolean adult, LocalDate date, String generes_ids, long movie_id, String original_language, String original_title
    , String overview,double popularity, String poster_path, String title, boolean video, double vote_avg, int vote_count);
    Movie findByMovie_id(Long movieId);
}
