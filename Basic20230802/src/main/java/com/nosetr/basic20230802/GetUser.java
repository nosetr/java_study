package com.nosetr.basic20230802;

import java.util.Random;

/**
 *
 * @author nosetr
 */
public class GetUser {
    
    private static Random random = new Random();
    
    public static String[] names = {
        "John", "Marta", "Nico", "Sven", "Vlad", "Inna", "Lena", "Ivan", "Iren", "Max"
    };
    
    public static void getRandomUser(Users[] users){
        int rand = random.nextInt(1, users.length);
        System.out.printf("%s %s called the %s %s whith id %d",
                users[0].status,
                users[0].name,
                users[rand].status,
                users[rand].name,
                users[rand].id);
        System.out.println("");
    }
}
