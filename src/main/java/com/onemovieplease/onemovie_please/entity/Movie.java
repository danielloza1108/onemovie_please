package com.onemovieplease.onemovie_please.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    private double popularity;
    @Column(name = "vote_count")
    private int voteCount;
    private boolean video;
    private int movie_id;
    private boolean adult;
    private LocalDate date;
    @Column(name = "poster_path")
    private String posterPath;
    @Column(name = "original_language")
    private String originalLanguage;
    @Column(name = "original_title")
    private String originalTitle;
    private String generesIds;
    private String title;
    @Column(name = "vote_avg")
    private double voteAvg;
    @Column(length = 1000)
    private String overview;

    public Movie(double popularity, int voteCount, boolean video, int movie_id, boolean adult, LocalDate date, String posterPath, String originalLanguage, String originalTitle, String generesIds, String title, double voteAvg, String overview) {
        this.popularity = popularity;
        this.voteCount = voteCount;
        this.video = video;
        this.movie_id = movie_id;
        this.adult = adult;
        this.date = date;
        this.posterPath = posterPath;
        this.originalLanguage = originalLanguage;
        this.originalTitle = originalTitle;
        this.generesIds = generesIds;
        this.title = title;
        this.voteAvg = voteAvg;
        this.overview = overview;
    }

    public Movie() {

    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", popularity=" + popularity +
                ", voteCount=" + voteCount +
                ", video=" + video +
                ", movie_id=" + movie_id +
                ", adult=" + adult +
                ", posterPath='" + posterPath + '\'' +
                ", originalLanguage='" + originalLanguage + '\'' +
                ", originalTitle='" + originalTitle + '\'' +
                ", generesIds=" + generesIds +
                ", title='" + title + '\'' +
                ", voteAvg=" + voteAvg +
                ", overview='" + overview + '\'' +
                '}';
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public long getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }



    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getGeneresIds() {
        return generesIds;
    }

    public void setGeneresIds(String generesIds) {
        this.generesIds = generesIds;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getVoteAvg() {
        return voteAvg;
    }

    public void setVoteAvg(double voteAvg) {
        this.voteAvg = voteAvg;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}
