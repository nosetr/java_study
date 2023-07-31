package com.nosetr;

public class Worker {
    int age;
    String firstName;
    String lastName;
    double salary;

    public Worker(int age, String firstName, String lastName, double salary) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // #region

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // #endmethods
}
