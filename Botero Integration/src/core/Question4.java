package core;

// @author MarianaBotero

public class Question4 {

  static final String QA = "Question";

  /**
   * This method is the fourth question which asks the user which quote they agree with the most.
   */
  public static void askingQuote() {

    double theAlchemist = 500;
    double slaughterHouse5 = 1000;
    double prideAndPrejudice = 10;
    boolean userAgreement = true;

    int sum = 19;
    while (sum < 20) { /*
                        * this loop will only repeat one time, because of its condition and update
                        * expression
                        */
      System.out.println("Fourth " + QA
          + ": Pick one philosophy in which you agree with the most. Remember"
          + " to write down the numerical value of the one you think is true (shown beside it).");
      System.out.println("- Your actions define your consequences " + "(" + userAgreement + "="
          + theAlchemist + ")");
      System.out
          .println("- Time defines your consequences, therefore there is no such thing as free"
              + " will " + "(" + userAgreement + "=" + slaughterHouse5 + ")");
      System.out.println("- Strata does not influence where you end up in life " + "("
          + userAgreement + "=" + prideAndPrejudice + ")\n");
      sum += 1; // adds one to sum, and makes new sum + 1 (accumulator)
    }
  }

}
