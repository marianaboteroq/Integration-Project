package core;

import classes.UserInfo;

public class Question1 {

  public static void askingName() {
    System.out.println("I want to get to know you first. What's your name?");

    UserInfo name = new UserInfo();
    name.setUserName();
    String newUserName = name.getUserName();

    System.out.println("Hello, " + newUserName + " nice to meet you.\n\nI want to explain how this"
        + " is going to work first.\nI am going to ask you a few questions, \"analyze\" "
        + "your answers,\nand come up with the next book you will tell people you're \"reading.\"");

    System.out.println("\nBefore we begin, grab a piece of paper and a pencil.\nYou will be writing"
        + " down the numerical point value of your answers (I will provide those as you go) "
        + "and\nat the end we will calculate the meaning of those points and equate them"
        + " to a corresponding book.\nJust write the numbers down as you go, and worry about"
        + " the rest later.");
  }

}
