package com.nosetr.main;

import java.util.Scanner;

/**
 *
 * @author nosetr
 */
public class App {

    /**
     * Constructor
     * @param job
     * @param firstName
     * @param lastName 
     */
    public App(String job, String firstName, String lastName) {
        this.job = job;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    /**
     * Refactor -> Encapsulate Fields
     */
    private String job;

    /**
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(String job) {
        this.job = job;
    }

    private String firstName;

    private String lastName;

    public String getFullName() {
        return String.format("%s %s", firstName, this.lastName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static void main(String[] args) {
//        int value;
//        value = 12345;
//
//        while (value != 0) {
//            System.out.println(value % 10);
//            value = value / 10;
//        }

//        Scanner sc = new Scanner(System.in);
//        int value = 123456;
//
//        System.out.println("value: ");
//        По двум заданным числам проверять является ли одно квадратом другого
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextDouble();
        System.out.println("Enter b: ");
        b = sc.nextDouble();

        double result1 = a * a, result2 = b * b;
        String result;

        result = (result1 == b || result2 == a) ? "YES" : "NO";

        System.out.println(result);
    }
}
