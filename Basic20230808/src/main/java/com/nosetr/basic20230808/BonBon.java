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
public class BonBon {
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
