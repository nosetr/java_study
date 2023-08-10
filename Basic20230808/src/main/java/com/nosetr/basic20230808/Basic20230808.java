package com.nosetr.basic20230808;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

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

class BonBon {

  private int score;
  private int userID;
  private int usersCount = 0;
  private final Random rand = new Random();
  private final Scanner sc = new Scanner(System.in);
  private String[] users = new String[2]; // Only 2 players
  private boolean bot = false; // if playing with bot

  /**
   * Constructor
   */
  public BonBon() {
    // Randoms
    this.score = this.rand.nextInt(10, 21); // Start score
    this.userID = this.rand.nextInt(2); // user to start
  }
  
  /**
   * Make the first character to uppercase
   * @param txt
   * @return 
   */
  private String firstToUpper(String txt){
    return txt.substring(0, 1).toUpperCase()
            + txt.substring(1);
  }
  
  /**
   * Set count of players
   */
  private void setUsersCount(){
    // with validation
    while (!(this.usersCount > 0 && this.usersCount < 3)) {
      
      // if 1 - 1 player whith bot
      System.out.println("Enter count of players from 1 to 2:");
      this.usersCount = this.sc.nextInt();
      
      // number must be 0 < usersCount < 3
      if (!(this.usersCount > 0 && this.usersCount < 3))
        System.out.println("Wrong input!!!");
    }
  }

  /**
   * Set users name
   */
  private void setUsers() {
    for (int i = 0; i < this.usersCount; i++) {
      String txt = this.usersCount == 1
              ? "Enter your name"
              : String.format("Enter the name of the %s player:",
                  i == 0 ? "first" : "second");
      System.out.println(txt);
      this.users[i] = this.sc.next();
    }
  }

  /**
   * Set score with validation
   */
  public void setScore() {
    int val = 0; // a number from 1 to 3 from users to set
    
    while (this.score > 3) {
      if(!!this.bot && this.userID == 1){
        try {
          TimeUnit.SECONDS.sleep(2);
          val = this.rand.nextInt(1, 4);
          System.out.println("The bot entered a number " + val);
        } catch (InterruptedException ex) {
          Logger.getLogger(BonBon.class.getName()).log(Level.SEVERE, null, ex);
        }
      } else {
        System.out.println(this.firstToUpper(users[this.userID]) + " please enter a number from 1 to 3:");
        val = this.sc.nextInt();
      }
      
      if (val > 0 && val < 4) {
        this.score -= val;
        System.out.println("Score: " + this.score);
        this.userID = this.userID == 0 ? 1 : 0;
      } else {
        System.out.println("Number must be from 1 to 3. Try again");
      }
    }
  }  

  /**
   * Run the game
   */
  public void game() {    
    // Set count of players
    this.setUsersCount();

    // Set users name
    this.setUsers();
    
    // If playing with bot
    if(this.usersCount == 1){
      users[1] = "the bot";
      this.bot = true;
    }

    System.out.println(this.firstToUpper(users[this.userID]) + " begins and the score is " + this.score);

    // Set score with validation
    this.setScore();

    String cgrt = (!!this.bot && this.userID == 1)
            ? "Sorry"
            : "Congratulations!!!";
    System.out.printf("The winner is %s. %s", this.firstToUpper(users[this.userID]), cgrt);
    this.sc.close();
  }
}
