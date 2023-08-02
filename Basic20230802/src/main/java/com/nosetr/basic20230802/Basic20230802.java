package com.nosetr.basic20230802;

/**
 *
 * @author nosetr
 */
public class Basic20230802 {

    public static void main(String[] args) {
//        Выбор случайного студента для вопроса:
//        Напишите метод, который принимает на вход количество студентов и “рандомально” выбирает любого студента начиная со второго включительно.
//        Например: в зуум сейчас присутствуют 10 участников. Первый участник - это преподаватель. Выбор должен быть сделан из 9 последующих, т.е. число выбирается из диапазона 2-10. 
        String[] names = GetUser.names;
        
        Users[] users = new Users[names.length];
        
        for (int i = 0; i < users.length; i++) {
            users[i] = new Users(names[i]);
        }
        
        GetUser.getRandomUser(users);
    }
}
