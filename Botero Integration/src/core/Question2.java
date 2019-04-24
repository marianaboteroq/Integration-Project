package core;

import classes.UserInfo;

// @author MarianaBotero

public class Question2 {

  static final String QA = "Question";

  /**
   * This method is the second question that asks the user their favorite book (fiction/non-fiction)
   * Methodology done using gets/sets and a scanner.
   */
  public static void askingBookType() {
    System.out.printf("\nSecond order of bussiness (Second %s)\n", QA);
    System.out.println("What is your favorite book type? Fiction or Non-Fiction?");
    UserInfo bookType = new UserInfo();
    bookType.setFavBookType();

    // Link below is where I found a list of book genres:
    // https://reference.yourdictionary.com/books-literature/different-types-of-books.html
  }

}
