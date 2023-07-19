package com.nosetr.basic;

import com.nosetr.basic.model.Car;
import com.nosetr.basic.model.Worker;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author nosetr
 */
public class App {

    public static void main(String[] args) throws IOException {
        int value = 134;
        int a1 = value % 10;
        System.out.println(a1);
        int a2 = (value % 100) / 10;
        System.out.println(a2);
        int a3 = value / 100;
        System.out.println(a3);
        String s = String.format("%d", value);
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));

        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html#:~:text=int%3A%20By%20default%2C%20the%20int,value%20of%20232%2D1.
        // double, int, boolean, char
        // String
        // Примитивные
//        int a1 = 123456;
//        int a2 = 123456;
//
//        boolean flag = a1 == a2;
//        System.out.println(flag);
//
//        Integer a3 = 123456;
//        Integer a4 = 123456;
//        flag = a3 == a4;
//        System.out.println(flag);
//        System.out.println(a3.equals(a4));
//
//        System.out.println("==========");
//
//
//        byte myByte = 1; // Byte (whole number from -128 to 127)
//
//        short myShort = 3;// Short (whole number from -32768 to 32767)
//        int myNum = 5;// Integer (whole number) // 4 bytes
//
//        float myFloatNum = 132.1234567890123456789001234567890f;// Floating point number
//        System.out.println(myFloatNum);
//        double d = 1234567.1234567890123456789001234567890;
//        System.out.println(d);
//        char myLetter = 'D';// Character
//        boolean myBool = true;// Boolean
        // не примитивные типы данных
        Worker w = new Worker();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        w.setAge(sc.nextInt());
        w.setFirstName("John");
        w.setSalary(200.45);
        w.setDateOfBirth(LocalDate.of(2000, 2, 22));

        System.out.println("age: " + w.getAge());
        System.out.println("Name: " + w.getFirstName());

        Car car = new Car();
        car.setDriver(w);
        System.out.println("Driver: " + car.getDriver().getFirstName()
                + " " + car.getDriver().getLastName());
    }
}
