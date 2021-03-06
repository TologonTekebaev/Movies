package com.company.Models;

import com.company.Models.Cast;
import com.company.Models.Director;

import java.util.List;

public class Movies {

    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> cast;

    void printCast() {
        int counter = 1;
        for (Cast s : cast) {
            System.out.printf("%s)   Fullname: %s\n", counter, s.getFullName());
            System.out.println("     Role: " + s.getRole());
            counter++;
        }
    }

    public List<Cast> getCast() {
        return cast;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public Director getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return " " +
                "\nНазвание фильма: = " + name +
                "\nГод выпуска: = " + year +
                "\nОписание: = " + description +
                "\nРежиссер: = " + director +
                "\nВ ролях: = " + cast +" ";
    }
}
