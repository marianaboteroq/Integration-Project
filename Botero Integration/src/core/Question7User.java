// @author Mariana Botero
package core;

import java.util.Scanner;

public class Question7User {

  public static void askingTravelPref() {
    System.out.println("Enough about me. Time for the 7th question. If you could move to any"
        + " of the following countries in the table below,"
        + "\nwhere would you live?\n");
    String countries[][] =
        {{"Japan", "England", "Netherlands", "Spain"}, {"India", "Colombia", "Brazil", "Canada"}};

    for (int i = 0; i < countries.length; i++) {
      for (int j = 0; j < countries[i].length; j++) {
        System.out.printf(countries[i][j] + " ");
      }
      System.out.println();
    }
    Scanner scan = new Scanner(System.in);
    String travelPref = scan.nextLine();

    for (int i = 0; i < countries.length; i++) {
      for (int j = 0; j < countries[i].length; j++) {
        if (countries[i][j].equalsIgnoreCase(travelPref)) {
          System.out.println("You picked row " + (i + 1) + " and column  " + (j + 1) + " which "
              + "would equate to exactly 30.0 points.\n");
        }
      }
    }
  }
}


