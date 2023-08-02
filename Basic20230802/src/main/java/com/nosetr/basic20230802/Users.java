package com.nosetr.basic20230802;

/**
 *
 * @author nosetr
 */
public class Users {
    
    private static int globalId = 0;
    int id;
    String name;
    String status;

    public Users(String name) {
        this.id = globalId + 1;
        this.name = name;
        this.status = globalId > 0
                ? "student"
                : "teacher";
        globalId++;
    }
    
}
