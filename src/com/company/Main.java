package com.company;

import com.company.Interface.FindAble;
import com.company.Interface.SortAble;
import com.company.Json.JsonIO;
import com.company.Models.Movies;
import com.company.Service.FindByMap;
import com.company.Service.InputException;
import com.company.Service.MovieStore;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Movies> movies = JsonIO.getMovies();
    private static SortAble s = new MovieStore();
    private static FindAble f = new FindByMap();
    private static Scanner in = new Scanner(System.in);
    private static Scanner line = new Scanner(System.in);

    public static void main(String[] args) throws InputException {
        while (true) {
        commads();
        System.out.println("Выберите число");
        int number = in.nextInt();
        if (number == 1) {
            System.out.println("Всe фильмы: ");
            s.printAllMovies(movies);
        } else if (number == 2) {
            System.out.println("Какой фильм хотите найти?");
            String search = line.nextLine();
            s.findMovie(movies, search);
        } else if (number == 3) {
            System.out.println("Годы выпуска фильмов: ");
            s.sortByYear(movies);
        } else if (number == 4) {
            System.out.println("Название фильмов по алфавиту: ");
            s.sortByName(movies);
        } else if (number == 5) {
            System.out.println("Режиссеры: ");
            s.sortByDirector(movies);
        } else if (number == 6) {
            System.out.println("Введите имя актера: ");
            String title = line.nextLine();
            f.findMoviesByActor(movies, title);
        }else if (number == 7){
            System.out.println("Напишите имя режиссера: ");
            String director = line.nextLine();
            f.findMoviesByDirector(movies,director);
        }else if(number == 8){
            f.findMoviesByYear(movies,getInt());
        }else if(number == 9){
            System.out.println("Введите имя актера: ");
            String actorsName = line.nextLine();
            f.findMoviesAndRoleByActor(movies, actorsName);

        }else if(number == 10) {
            f.showActorRoles(movies);
        }else {
            System.out.println("Введите число 1 - 10.");
        }
      }
    }

    static void commads() {
        System.out.println("-------------------Commands-----------------------");
        System.out.println("Press 1 to print catalog");
        System.out.println("Press 2 to Find a Movie by full or part name");
        System.out.println("Press 3 to sort by year");
        System.out.println("Press 4 to sort by name");
        System.out.println("Press 5 to sort by director");
        System.out.println("Press 6 to find movies by actor's name");
        System.out.println("Press 7 to find movies by director's name");
        System.out.println("Press 8 to find movies by year");
        System.out.println("Press 9 to List all movies and roles by actor's name");
        System.out.println("Press 10 to sorted List of all actors with his roles");
        System.out.println("--------------------------------------------------");
    }

    static int getInt() {
        System.out.print("Укажите год:  ");
        int a = 0;
        try {
            String b = in.next();
            a = Integer.parseInt(b);
        } catch (Exception e) {
            System.out.println("Wrong again, try again");
            e.printStackTrace();
        }
        return a;
    }
}
