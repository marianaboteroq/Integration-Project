package core;

import java.util.Random;

// @author MarianaBotero

public class Loading {
  /**
   * This method randomly generates seconds between 0 and 15 for the "loading" part of the program
   * right before it presents all the range values of points.
   */
  public static void loading() {
    Random seconds = new Random();
    int numOfSec = seconds.nextInt(15);
    System.out.println("Glad you have made it this far! Only a few things left.");
    System.out.println("Please wait " + numOfSec + " " + (numOfSec == 1 ? "second" : "seconds")
        + " while I pull up the rest of the data...\n");
    System.out.println(
        "Great! Now just add up all of the values from the responses you chose,\nand look at the "
            + "chart below to find the book you will \"read\" next!\n");

  }
}
