package com.nosetr.basic20230808;

/**
 *
 * @author nosetr
 */
public class Basic20230808 {

  /**
   * #1
   */
//  static Scanner sc = new Scanner(System.in);
//  static int getInt(String txt, int min, int max){
//    int val = 0;
//    while (!(val >= min && val <= max)) {
//      System.out.printf("%s [%d %d]", txt, min, max);
//      if(sc.hasNextInt()){
//        val = sc.nextInt();
//      } else {
//        sc.next();
//      }
//    }
//    return val;
//  }
//  public static void main(String[] args) {
//    int a = getInt("value 1", 1, 3);
//    int b = getInt("value 2", 10, 20);
//    sc.close();
//  }
  /**
   * #2
   */
//  public static void main(String[] args) {
//    int val = 6;
//    switch (val) {
//      case 1:
//      case 2:
//      case 3:
//        break;
//      case 6:
//        System.err.println("OK");
//        break;
//      default:
//        throw new AssertionError();
//    }
//  }
  /**
   * #3 Создать программу, выводящую на экран случайно сгенерированное
   * трёхзначное натуральное число и его наибольшую цифру. Например: 398 Выход:
   * 9
   */
//  public static void main(String[] args) {
//    Random rand = new Random();
//    int val = rand.nextInt(100, 1000);
//    System.out.println("Random: " + val);
//    
//    int s = 0;
//    for (int i = 10; i < 10000; i*=10) {
//      int v = val%i/(i/10);
//      if(s < v) s = v;
//    }
//    System.out.println("Result: " + s);
//    
//    int a = new Random().nextInt(100, 100000000);
//    System.out.println("Random: " + a);
//    int max = -1;
//    while (a != 0) {
//      int o = a % 10;
//      a = a / 10;
//      if (o > max)
//        max = o;
//    }
//    System.out.println("Result: " + max);
//  }
  public static void main(String[] args) {
//    countChars("QeXZpE!", "e");
//    mySubstr("proba is this", 7);
//    makeItFunny("I NevEr LooK bAck", 3);

    BonBon bonbon = new BonBon();
    bonbon.game();
  }

  /**
   * Напишите функцию makeItFunny(), которая принимает на вход строку и
   * возвращает её копию, у которой каждый n-ный элемент переведен в верхний
   * регистр. n – задается на входе в функцию. Для определения каждого n-ного
   * элемента понадобится остаток от деления %. Подумайте, как его можно
   * использовать. const text = "I never look back"; Каждый третий элемент:
   * makeItFunny(text, 3); // "I NevEr LooK bAck"
   */
  static void makeItFunny(String txt, int n) {
    txt = txt.toLowerCase();
    System.out.println(txt);
    String newTxt = "";
    char[] arr = txt.toCharArray();
    for (int i = 0; i < arr.length; i++) {
      char ch = arr[i];
      if ((i + 1) % n == 0) {
        ch = Character.toUpperCase(ch);
      }
      newTxt += ch;
    }

    System.out.println(newTxt);
  }

  static void mySubstr(String str, int lng) {
    int strLng = str.length();
    if (lng > strLng) {
      lng = strLng;
    }
    String newStr = "";
    for (int i = 0; i < lng; i++) {
      newStr += str.charAt(i);
    }
    System.out.println(newStr);
  }

  /**
   * 6.Функция countChars() из теории считает, сколько раз входит буква в 
   * предложение и при этом учитывает регистр букв. То есть A и a с её точки 
   * зрения разные символы. Реализуйте вариант этой же функции, так чтобы 
   * регистр букв был не важен:
   * countChars("QeXZpE!", "e"); // 2
   * countChars("FeqkE123", "E"); // 2
   */
  static void countChars(String word, String s) {
    int count = 0;
    for (int i = 0; i < word.length(); i++) {
      if (Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(word.charAt(i))) {
        count++;
      }
    }
    System.out.println(count);
  }
}
