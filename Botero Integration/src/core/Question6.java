// @author Mariana Botero
package core;

public class Question6 {


  public static void askingPageNums() {
    int longPageNumbers[] = {100, 20, 86, 90, 65};
    int mediumPageNumbers[] = {5, 16, 50, 30, 50};
    int shortPageNumbers[] = {5, 10, 30, 21, 20};

    int sumLong = 0;
    int sumMedium = 0;
    int sumShort = 0;


    for (int x : longPageNumbers) {
      sumLong += x;
    }
    for (int counter = 0; counter < mediumPageNumbers.length; counter++) {
      sumMedium += mediumPageNumbers[counter];
    }
    for (int counter = 0; counter < shortPageNumbers.length; counter++) {
      sumShort += shortPageNumbers[counter];
    }
    System.out.println("\nSixth question. How long of a book do you see yourself reading?");
    System.out.println(sumLong + " pages, " + sumMedium + " pages, or " + sumShort + " pages?");
    System.out.println("\nNow follow the chart to record your points accordingly.\n");
    System.out.println("If you picked 361 jot down 20 points, if you picked 151, jot down 10 points"
        + ", and if you picked 86,\njot down 5 points.\n");
  }

}
