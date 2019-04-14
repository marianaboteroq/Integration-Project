// @author Mariana Botero
package core;

public class Question7Me {

  public static void tellingPageNums() {
    System.out.println("I wanted to make this quiz personal, so I will tell you a little bit about"
        + " my book length encounters.");
    int myPageNumbers[] = {340, 600, 94, 550, 1120, 234, 448};
    int smallest = myPageNumbers[0];
    int largest = myPageNumbers[0];

    for (int i = 0; i < myPageNumbers.length; i++) {
      if (largest < myPageNumbers[i]) {
        largest = myPageNumbers[i];
      } else if (smallest > myPageNumbers[i]) {
        smallest = myPageNumbers[i];
      }
    }

    for (int x = 0; x < myPageNumbers.length; x++)
      if (smallest == myPageNumbers[x])
        System.out.println("The shortest book I've read was The Time Machine by H.G Wells, and "
            + "according to the table of book pages,\nposition " + (x + 1) + " it was " + smallest
            + " pages long.\n");


    for (int y = 0; y < myPageNumbers.length; y++)
      if (largest == myPageNumbers[y])
        System.out.println("The longest book I've read was 11/22/63 by Stephen King, and "
            + "according to the table of book pages,\nposition " + (y + 1) + " it was " + largest
            + " pages long.\n");
  }
}


