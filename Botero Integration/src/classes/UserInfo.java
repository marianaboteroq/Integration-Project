package classes;

import java.util.Scanner;

// @author MarianaBotero

public class UserInfo {

  private String happinessLevel;
  Scanner scan = new Scanner(System.in);

  /**
   * This method is called to scan a user's input and set their input equal to their happiness 
   * level.
   */
  public void setHappinessLevel() {
    String happinessLevel = scan.nextLine();
    this.happinessLevel = happinessLevel;
  }

  public String getHappinessLevel() {
    return happinessLevel;
  }

  private String userName;
  
  /**
   * This method is called to scan a user's input and set their name based off that input.
   */
  public void setUserName() {
    String usersName = scan.nextLine();
    userName = usersName;
  }

  public String getUserName() {
    return userName;
  }

  private String favBookType;

  
  /**
   * This method is called to scan a user's input and set their input equal to their favorite book 
   * type.
   */
  public void setFavBookType() {
    String bookType = scan.nextLine();
    favBookType = bookType;

  }

  public String getFavBookType() {
    return favBookType;
  }

  private String favBookGenre;

  /**
   * This method is called to scan a user's input and set their input equal to their favorite book 
   * genre.
   */
  public void setFavBookGenre() {
    String bookGenre = scan.nextLine();
    favBookGenre = bookGenre;
  }

  public String getFavBookGenre() {
    return favBookGenre;
  }


}


