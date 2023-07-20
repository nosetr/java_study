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
     * Convert char to int
     * @param c
     * @return int
     */
    private static int GetNum(char c) {
        return Character.getNumericValue(c);
    }

    /**
     * Helper for println
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

////        10. Показать последнюю цифру трёхзначного числа
//        PrintIt("Введите трёхзначное число");
//        int ex7 = sc.nextInt();
//        PrintIt("Последняя цифра: " + ex7 % 10);
//        
////        11. Показать вторую цифру трёхзначного числа
//        PrintIt("a. Вторая цифра: " + ex7 / 10 % 10); // a.
//        char[] ex7Array = String.valueOf(ex7).toCharArray(); // b.
//        PrintIt("b. Вторая цифра: " + ex7Array[1]);
        
////        12. Дано число из отрезка [10, 99]. Показать наибольшую цифру числа
//        PrintIt("Введите число от 10 до 99:");
//        int ex8 = sc.nextInt();
//        if (ex8 >= 10 && ex8 <= 99){
//            char[] ex8Array = String.valueOf(ex8).toCharArray();
//            PrintIt("Наибольшая цифра числа: " + Math.max(GetNum(ex8Array[0]), GetNum(ex8Array[1])));
//        } else {
//            PrintIt("Число не правильное!");
//        }
        
////        13. Удалить вторую цифру трёхзначного числа
//        PrintIt("Введите трёхзначное число");
//        int ex9 = sc.nextInt();
//        StringBuilder sb = new StringBuilder(String.valueOf(ex9));
//        sb.deleteCharAt(1);
//        PrintIt("Output: " + sb.toString());
        
////        14. Выяснить, кратно ли число заданному, если нет, вывести остаток.
//        PrintIt("Введите 2а числа:");
//        int ex10 = sc.nextInt(), ex11 = sc.nextInt();
//        if(ex10 % ex11 == 0) {
//            PrintIt(String.format("Число %s кратно %s", ex10, ex11));
//        } else {
//            PrintIt(String.format("Число %s не кратно %s. Остаток %s.", ex10, ex11, ex10 % ex11));
//        }
        
////        15. Найти третью цифру числа или сообщить, что её нет
//        PrintIt("Введите число:");
//        int ex12 = sc.nextInt();
//        char[] ex12Array = String.valueOf(ex12).toCharArray();        
//        PrintIt(ex12Array.length < 3 ? "Третьей цифры нет!" : "Третья цифра от числа: " + ex12Array[2]);
        
////        16. Дано число. Проверить кратно ли оно 7 и 23
//        PrintIt("Введите число:");
//        int ex13 = sc.nextInt();
//        String str13_1 = (ex13 % 7 == 0 ? "" : "не "),
//               str13_2 = (ex13 % 23 == 0 ? "" : "не ");
//        PrintIt(String.format("Число %s %sкратно 7", ex13, str13_1));
//        PrintIt(String.format("Число %s %sкратно 23", ex13, str13_2));
        
////        16. Дано число обозначающее день недели. Выяснить является номер дня недели выходным
//        PrintIt("Enter the number of weekday:");
//        int dayNumb2 = sc.nextInt();
//        if (dayNumb2 > 0 && dayNumb2 <= 7) {
//            DayOfWeek weekDay2 = DayOfWeek.of(dayNumb2);
//            PrintIt("The name of weekday is " + weekDay2.name());
//            PrintIt(dayNumb2 > 5 ? "it's weekend": "it's workday" );
//        } else {
//            PrintIt("the number you get is false");
//        }
        
////        17. По двум заданным числам проверить является ли одно квадратом другого
//        PrintIt("Введите 2а числа:");
//        int ex14 = sc.nextInt(), ex15 = sc.nextInt(),
//            max14 = Math.max(ex14, ex15), min14 = Math.min(ex14, ex15);
//        String str14 = ( max14 / min14 == min14 ? "" : "не ");
//        PrintIt(String.format("Число %s %sявляется квадратом %s", max14, str14, min14));
        
////        18. Программа проверяет пятизначное число на палиндромом.
//        PrintIt("Введите пятизначное число:");
//        int ex16 = sc.nextInt(), ex17 = 0;
//        char[] ex16Array = String.valueOf(ex16).toCharArray();
//        for (int i = ex16Array.length - 1; i >= 0; i--) {
//            ex17 = ex17 * 10 + GetNum(ex16Array[i]);
//        }
//        PrintIt(String.format("Число %s %sявляется палиндромом", ex16, ( ex16 == ex17 ? "" : "не ")));
        
//        19. Найти расстояние между точками в двумерного пространстве
        PrintIt("Введите координаты первой точки (x, y):");
        double ex18_x = sc.nextDouble(), ex18_y = sc.nextDouble();
        PrintIt("Введите координаты второй точки (x, y):");
        double ex19_x = sc.nextDouble(), ex19_y = sc.nextDouble();
        double cat1 = Math.pow(Math.max(ex18_x, ex19_x) - Math.min(ex18_x, ex19_x), 2),
               cat2 = Math.pow(Math.max(ex18_y, ex19_y) - Math.min(ex18_y, ex19_y), 2);
        PrintIt("расстояние между точками: " + Math.sqrt(cat1 + cat2));
    }
}
