package com.nosetr.basic20230802;

import java.util.Scanner;

/**
 *
 * @author nosetr
 */
public class Basic20230802 {

    public static void main(String[] args) {
//    Выбор случайного студента для вопроса:
//    Напишите метод, который принимает на вход количество студентов и “рандомально” выбирает любого студента начиная со второго включительно.
//    Например: в зуум сейчас присутствуют 10 участников. Первый участник - это преподаватель. Выбор должен быть сделан из 9 последующих, т.е. число выбирается из диапазона 2-10. 
        String[] names = GetUser.names;
        Users[] users = new Users[names.length];
        for (int i = 0; i < users.length; i++) {
            users[i] = new Users(names[i]);
        }
        GetUser.getRandomUser(users);
        
//    Напишите класс Converter для конвертации из градусов по Цельсию в Кельвины​, ​Фаренгейты:
//    У класса должны быть методы для конвертации.
//    Реализуйте два метода в классе:
//    runKelvinConverter(double baseValue)
//    runFahrenheitConverter(double baseValue)
        Converter convert = new Converter();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in Celsius:");
        double celsius = sc.nextDouble();
        convert.setCelsius(celsius);
        System.out.println(celsius + " °C is equal " + convert.runFahrenheitConverter() + " °F and " + convert.runKelvinConverter() + " K");
    }
}
