// @author Mariana Botero
package core;

import classes.UserInfo;

public class Question2 {

  final static String QA = "Question";

  public static void askingBookType() {
    System.out.printf("\nSecond order of bussiness (Second %s)\n", QA);
    System.out.println("What is your favorite book type? Fiction or Non-Fiction?");
    UserInfo bookType = new UserInfo();
    bookType.setFavBookType();

    // Link below is where I found a list of book genres:
    // https://reference.yourdictionary.com/books-literature/different-types-of-books.html
  }

}
