package com.company.Service;

import com.company.Interface.SortAble;
import com.company.Models.Director;
import com.company.Models.Movies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStore implements SortAble {
    @Override
    public void printAllMovies(List<Movies> movies) {
        movies.stream().forEach(System.out::println);
    }

    @Override
    public void findMovie(List<Movies> movies, String search) {
        movies.stream().map(Movies::getName).filter(s -> s.contains(search)).forEach(System.out::println);
    }

    @Override
    public void sortByYear(List<Movies> movies) {
        movies.stream().sorted(Comparator.comparing(Movies::getYear)).forEach(System.out::println);
    }

    @Override
    public void sortByName(List<Movies> movies) {
        movies.stream().sorted(Comparator.comparing(Movies::getName)).forEach(System.out::println);
    }

    @Override
    public void sortByDirector(List<Movies> movies) {
        Map<Director, List<Movies>> classificationListMap = movies.stream().collect(Collectors.groupingBy(Movies::getDirector));
        List <Director> directors = new ArrayList<>();

        directors.addAll(classificationListMap.keySet());
        directors.stream().sorted(Comparator.comparing(Director::getFullName)).forEach(System.out::println);
    }
}
