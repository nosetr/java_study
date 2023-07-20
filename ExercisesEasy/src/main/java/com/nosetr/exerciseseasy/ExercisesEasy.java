package com.nosetr.exerciseseasy;

import java.util.Locale;
import java.util.Scanner;

/**
 * Exercises list taked from:
 * https://github.com/iksergey/Hobby/blob/Exercises/Exercises/Easy.md
 *
 * @author nosetr
 */
public class ExercisesEasy {

    /**
     * Helper for println
     *
     * @param string
     */
    private static void PrintIt(String string) {
        System.out.println(string);
    }

    /**
     * Set scanner for input
     */
    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    
    public static void main(String[] args) {
////        1. Вывести квадрат числа
//        PrintIt("Enter number for ex1 (Вывести квадрат числа): ");
//        double ex1 = sc.nextDouble();
//        PrintIt(String.format("квадрат числа %s: %.2f", ex1, ex1 * ex1));
//
////        2. По двум заданным числам проверять является ли первое квадратом второго
//        PrintIt("Enterthe second number");
//        double ex2 = sc.nextDouble();
//        PrintIt(String.format("первое число%s является квадратом второго", (ex1 / ex2 == ex2 ? "" : " не")));
//
////        2. Даны два числа. Показать большее и меньшее число
//        String str1 = (ex1 == ex2)?"%s равно %s":"%s больше %s";
//        PrintIt(String.format(str1, Math.max(ex1, ex2), Math.min(ex1, ex2)));

////        3. По заданному номеру дня недели вывести его название
//        PrintIt("Enter the number of weekday:");
//        int dayNumb = sc.nextInt();
//        if (dayNumb > 0 && dayNumb <= 7) {
//            DayOfWeek weekDay = DayOfWeek.of(dayNumb);
//            PrintIt("The name of weekday is " + weekDay.name());
//        } else {
//            PrintIt("the number you get is false");
//        }
////        4. Найти максимальное из трех чисел
//        double ex3, ex4, ex5, max1;
//        PrintIt("Enter the first number:");
//        ex3 = sc.nextDouble();
//        PrintIt("Enter the second number:");
//        ex4 = sc.nextDouble();
//        PrintIt("Enter the third number:");
//        ex5 = sc.nextDouble();
//        max1 = Math.max(Math.max(ex3, ex4), ex5);
//        PrintIt("Maxnumber is: " + max1);
////        5. Выяснить является ли число чётным
//        PrintIt("Enter the number:");
//        int ex6 = sc.nextInt();
//        String str2 = (ex6 % 2 == 0) ? "" : " не";
//        PrintIt(String.format("число%s чётное", str2));
//        
////        8. Показать числа от -N до N 
//        PrintIt(String.format("Показать числа от -%s до %s", ex6, ex6));
//        for (int i = Math.min(ex6*-1, ex6); i <= Math.max(ex6*-1, ex6); i++) {
//            System.out.println(i);
//        }
//        
////        9. Показать четные числа от 1 до N
//        PrintIt(String.format("Показать четные числа от 1 до %s", ex6));
//        for (int i = 1; i <= ex6; i++) {
//            if(i%2 == 0) System.out.println(i);
//        }

//        10. Показать последнюю цифру трёхзначного числа
        PrintIt("Введите трёхзначное число");
        int ex7 = sc.nextInt();
        PrintIt("Последняя цифра: " + ex7 % 10);
    }
}
