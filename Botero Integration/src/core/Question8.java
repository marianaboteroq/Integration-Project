package core;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// @author MarianaBotero

public class Question8 {
  /**
   * This method is the eighth question which prompts the user to enter their favorite number.
   */
  public static void askingFavNum() {
    System.out.println("Don't give up on me quite yet! This is the last question.\nQuestion 8: "
        + "Don't think about it too hard. What's the best number you see here?\nIf you can't "
        + "pick enter your lucky number.");

    ArrayList<Integer> favNum = new ArrayList<Integer>();
    favNum.add(7);
    favNum.add(33);
    favNum.add(9);
    favNum.add(77);
    favNum.add(18);
    favNum.add(22);
    favNum.add(91);
    favNum.add(3);
    for (int x : favNum) {
      System.out.printf(x + ", ");
      if (x == 91) {
        break;
        // used break statement to break out of the for loop, so the last number (3) would
        // not have a comma since it is the last number in the row; does not need a comma
      }
      System.out.printf("3");

      Scanner scan = new Scanner(System.in);
      do {
        try {
          int userFavNum = scan.nextInt();
          System.out.println("You entered " + userFavNum + " jot down 50 points.");
          System.out.println("Enter 'continue' ");
        } catch (InputMismatchException e) {
          System.out.println("You may only enter integers.");
        }
      } while (scan.hasNextInt());
      scan.close();
    }
  }
}
