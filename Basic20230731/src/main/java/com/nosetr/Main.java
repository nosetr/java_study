package com.nosetr;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.setSleep(true);
        System.out.println(cat.getSleep());
        cat.eat();
    }
}