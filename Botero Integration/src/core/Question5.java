// @author Mariana Botero
package core;

import classes.Question;
import classes.UserInfo;


public class Question5 extends UserInfo implements Question {
  final static String QA = "Question";

  @Override
  public String askQuestion() {
    System.out.printf("\n(Fifth %s)\n", QA);
    System.out.println("Do you consider yourself a happy person?");
    return null;
  }

  @Override
  public String findAnswer() {
    super.setHappinessLevel();
    return null;
  }

  @Override
  public String returnAnswer() {
    System.out.println("You responded with " + getHappinessLevel() + ". Regardless, of this answer,"
        + "\nI only asked so you could sit there and really think.\n I did it for you to prepare"
        + " yourself for these next few questions.");
    return null;
  }


}


