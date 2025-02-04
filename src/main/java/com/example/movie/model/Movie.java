package com.example.movie.model;

import javax.persistence.*;

@Entity
@Table(name = "MOVIELIST")
public class Movie {
    @Id
    @Column(name = "movieId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId;
    @Column(name = "moviename")
    private String movieName;
    @Column(name = "leadActor")
    private String leadActor;

    public Movie() {
    }

    public Movie(int movieId, String movieName, String leadActor) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.leadActor = leadActor;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }

    public String getLeadActor() {
        return leadActor;
    }
}