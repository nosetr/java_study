package com.nosetr.basic20230801;

/**
 *
 * @author nosetr
 */
public class Basic20230801 {

    public static void main(String[] args) {
//        // if bar2() not STATIC
//        Basic20230801 main = new Basic20230801();
//        main.bar2();
//        // if bar1() STATIC
//        Basic20230801.bar1();
//        
//        bar1(); // bar1() is in the same class
//        //bar2(); // geht nicht, weil bar2() nicht STATIC und main() - STATIC
    
        Calc clc = new Calc();
        String binValue = "1101101";
        clc.binToDec(binValue);
    }
    
//    public static void bar1() {
//        // STATIC
//    }
//    
//    public void bar2() {
//        // NOT STATIC
//    }
}

class Book {
    private static int globalId = 0;
    int id = 0;
    String title;
    String author;
    int pageCount;

    public Book(int id, String title, String author, int pageCount) {
        id = globalId;
        globalId++;
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }
}

class Printer {
    public void print(Book book){
        System.out.printf("%d %s %s %d\n",
                book.id,
                book.author,
                book.title,
                book.pageCount);
    }
}

class Calc{
    public String decToBin(int value, int p){
        String res = "";
        while (value != 0) {
            int o = value % p;
            res = o + res;
            value = value / p;
        }
        return res;
    }
    
    public String binToDec(String binValue){
        // 0123456 - was wir haben
        // 1101101 - String
        // 6543210 - wie wir brauchen
        int res = 0;
        
        int count = binValue.length();
        
        for (int i = 0; i < count; i++) {
            char v = binValue.charAt(i); // i-er Symbol vom String
            System.out.println(v);
        }
    }
}
