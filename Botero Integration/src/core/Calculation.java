package core;

// @author MarianaBotero

public class Calculation {

  /**
   * This method calculates the range of points a user accumulates to decide what book they should 
   * read based off of their decisions.
   */
  public static void calculateTotal() {

    double theAlchemistMin = 587;
    double slaughterHouse5Min = 1087;
    double prideAndPrejudiceMin = 97;

    double theAlchemistMax = 736;
    double slaughterHouse5Max = 1236;
    double prideAndPrejudiceMax = 236;

    for (int i = 0; i <= 0; i++) { // will only allow for one iteration of the loop

      /*
       * In the following three statements, the variables prideAndPrejudiceMin/Max,
       * theAlchemistMin/Max, and slaughterHouse5Min/Max are casted from the previous double data
       * type, to int data type to truncate the ".0" that would have otherwise been at the end of
       * the numbers.
       */
      System.out.println("If your number is  between " + (int) prideAndPrejudiceMin + " and "
          + (int) prideAndPrejudiceMax + " you should read \"Pride and " + "Prejudice.\"");
      System.out.println("If your number is between " + (int) theAlchemistMin + " and "
          + (int) theAlchemistMax + " you should read \"The" + " Alchemist.\"");
      System.out.println("If your number is between " + (int) slaughterHouse5Min + " and "
          + (int) slaughterHouse5Max + " you should read \"" + "\"Slaughterhouse 5.\"");
      System.out.println("\nHappy Reading!");
      if (i == 0) {
        continue; /*
                   * because the boolean is true, the statement below will be skipped and control
                   * will go back to loop condition.
                   */
      }
      System.out.println("Hidden text that is skipped!");
    }
  }
}


