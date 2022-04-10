package com.company.Interface;

import com.company.Models.Movies;

import java.util.List;

public interface FindAble {

    void findMoviesByActor(List<Movies> movies, String actorName);

    void findMoviesByDirector(List<Movies> movies, String directorName);

    void findMoviesByYear(List<Movies> movies, int name);

    void findMoviesAndRoleByActor(List<Movies> movies, String actorsName);

    void showActorRoles(List<Movies> movies);
}
