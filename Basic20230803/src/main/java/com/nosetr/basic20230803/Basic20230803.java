package com.nosetr.basic20230803;

/**
 *
 * @author nosetr
 */
public class Basic20230803 {
    
    static boolean expression1() {
        System.out.println("expression1");
        return false;
    }
    
    static boolean expression2() {
        System.out.println("expression2");
        return true;
    }

    public static void main(String[] args) {
//        int a = 12;
//        a = ++a + a++;
//        
//        System.out.println(a++);
//        System.out.println(a);
//        System.out.println(++a);
//        System.out.println(a);

//        int value = 10;
//        Unary unary = new Unary();
//        System.out.println(unary.unaryConvert(value));

        boolean result = expression1() || expression2();
        System.out.println(result);

/*
Logical operator;
*/
        boolean a = true;
        boolean b = true;
//        
//        boolean and = a && b;
//        System.out.println(and);
//        
//        boolean or = a || b;
//        System.out.println(or);
//        
//        boolean not = !a;
//        System.out.println(not);
        
        boolean xor = a ^ b; // oder wird ausgenommen
        System.out.println(xor);
        
//        Реализуйте функцию isInternationalPhone(), которая проверяет формат 
//        указанного телефона. Если телефон начинается с +, значит это 
//        международный формат.
//        isInternationalPhone("89602223423"); // false
//        isInternationalPhone("+79602223423"); // true
        
    }
}

    
class Unary {
    int unaryConvert(int value){
        return -value;
    }
}