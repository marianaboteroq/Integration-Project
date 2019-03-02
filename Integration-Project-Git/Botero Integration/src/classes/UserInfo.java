package classes;

import java.util.Scanner;

public class UserInfo {

  private static String userName;

  public void setUserName() {
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    userName = name;
  }

  public String getUserName() {
    return userName;
  }

  private static String favBookType;

  public void setFavBookType() {
    Scanner scan2 = new Scanner(System.in);
    String bookType = scan2.nextLine();
    favBookType = bookType;
  }

  public String getFavBookType() {
    return favBookType;
  }


  private static String favBookGenre;

  public void setFavBookGenre() {
    Scanner scan3 = new Scanner(System.in);
    String bookGenre = scan3.nextLine();
    favBookGenre = bookGenre;
  }

  public String getFavBookGenre() {
    return favBookGenre;
  }


}


