
/*
Lab 4
Partners: Andrew Ireton and Noah Hornback
Date:
*/

import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random r = new Random();

    int randomNum = r.nextInt(50) + 1;

    System.out.println("The Random number is: " + randomNum);

    if (randomNum <= 5) {
      System.out.println("Ahoy mateys!");

    } else if (randomNum > 25 && randomNum < 42) {
      System.out.println("Cannonball!");

    } else if (randomNum > 5 && randomNum <= 25){
      System.out.println("Blast off!");
      
    } else if (randomNum >= 42 && randomNum <=50){
      System.out.println("Blast off!");
    }
    while (randomNum >= 0) {
      System.out.println(randomNum);
      randomNum--;

    }
  }
}
