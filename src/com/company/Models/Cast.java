package com.company.Models;

public class Cast {

    private String fullName;
    private String role;

    public String getFullName() {
        return fullName;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return " " +
                "\nИмя актера: = " + fullName +
                "\nРоль в фильме: = " + role + "";
    }
}
