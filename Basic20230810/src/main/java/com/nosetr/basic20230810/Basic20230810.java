package com.nosetr.basic20230810;

/**
 *
 * @author nosetr
 */
public class Basic20230810 {

  public static void main(String[] args) {
//        Basic20230810.halloProg(10);
    crypIt("go!");
    crypIt("car!");
  }

  /**
   * Инициализируйте переменную int count = 10; Создать метод, который печатает
   * в консоли “Привет программист” count раз Используйте цикл while
   */
  static void halloProg(int count) {
    while (count-- > 0) {
      System.out.println("Привет программист");
    }
  }

  /**
   * Сисадмин обнаружил, что его сообщения перехватываются и читаются в замке
   * «Близнецы», поэтому его атаки перестали быть внезапными. Немного подумав,
   * он разработал программу, которая будет шифровать передаваемые сообщения по
   * следующему алгоритму: программа получает на вход строку и меняет местами в
   * ней каждые 2 подряд идущих символа. Если длина строки нечётная, то
   * последний символ остаётся на своём месте. encrypt("move"); // "omev"
   * encrypt("attack"); // "taatkc" encrypt("car!"); // "ac!r" // Если длина
   * строки нечётная, // то последний символ остаётся на своём месте
   * encrypt("go!"); // "og!"
   */
  static void crypIt(String txt) {
    char[] txtArr = txt.toCharArray();
    String newTxt = "";
    String p = "";
    for (int i = 0; i < txtArr.length; i++) {
      if ((i + 1) % 2 == 0 || i + 1 == txtArr.length) {
        newTxt = newTxt + Character.toString(txtArr[i]);
        if (i + 1 < txtArr.length) {
          newTxt = newTxt + p;
        }
      } else {
        p = Character.toString(txtArr[i]);
      }
    }
    System.out.println("result: " + newTxt);
  }
}
