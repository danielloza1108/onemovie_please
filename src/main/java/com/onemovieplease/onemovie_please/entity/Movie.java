package com.onemovieplease.onemovie_please.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "movie")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double popularity;
    @Column(name = "vote_count")
    private int voteCount;
    private boolean video;
    private long movie_id;
    private boolean adult;
    @Column(name = "poster_path")
    @JsonProperty("poster_path")
    private String posterPath;
    @Column(name = "original_language")
    private String originalLanguage;
    @Column(name = "original_title")
    private String originalTitle;
    @ManyToOne
    private Genere generesIds;
    private String title;
    @Column(name = "vote_avg")
    private double voteAvg;
    private String overview;

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

    public void setMovie_id(long movie_id) {
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

    public Genere getGeneresIds() {
        return generesIds;
    }

    public void setGeneresIds(Genere generesIds) {
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
