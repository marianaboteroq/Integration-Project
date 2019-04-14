// @author Mariana Botero
package core;

import classes.Question;

public class Main {
  /*
   * Name: Mariana Botero Program Description: The purpose of this program is to advise a user what
   * book they should read using data from personality questions. It manifests beginner-Java
   * development techniques.
   * 
   * Java's Eight Primitive Data Types: byte: Can hold up to 8 bits of data and supports a range of
   * integers with values from -128 to 127.
   * 
   * short: Can hold up to 16 bits of data and supports a range of integers with values from -32,768
   * to 32,767.
   * 
   * int: Can hold up to 32 bits of data and supports a range of integers with values from -231 to
   * 231-1.  
   * 
   * long: Can hold up to 64 bits of data and supports a range of integers with values from values
   * of Math.pow(2, -63) to Math.pow(2, 63)-1.
   * 
   * char: Can hold 16 bits of data represented with a Unicode character.
   * 
   * float: Can hold up to 32 bits of data with a range of fractional numbers (decimals) from values
   * of 1.40 x Math.pow(10, -45) to 3.4 x Math.pow(10, 38). Typically represented with an 'F' at the
   * end of the number.
   * 
   * double: Can hold up to 64 bits of data with a range of fractional numbers (decimals) from
   * values of 4.94 x Math.pow(10, -324) to 1.79 x Math.pow(10, 308).
   * 
   * boolean: Can hold 1 bit of data. Has two possible values: True or False.
   * 
   * Variables and Scopes: Variable: A place holder for something else; a location in memory. Scope:
   * A variable is only accessible in the method it was declared. Final: A variable can only be
   * assigned once; is constant; cannot be changed.
   * 
   * Operator Precedence: Well-defined rules for specifying the order in which the operators in an
   * expression are evaluated when the expression has several operators (in other words PEMDAS for
   * operators); the rules can be overridden by using parenthesis. source:
   * https://introcs.cs.princeton.edu/java/11precedence/
   * 
   * Inheritance: A feature that allows a class to acquire the properties (methods and fields) of
   * another class. This is beneficial because you can reuse the fields and methods of an already
   * existing class without having to debug them and write them all over again.
   *
   * This is a header, and public is an access modifier Void is the return type, meaning this method
   * doesn't return anything. Method names should be in lowerCamelCase and named with a verb (main
   * is the name of the method) (String [] args) is the parameter (and can be defined arbitrarily)
   */

  public static void main(String[] args) {

    // Usage of polymorphism, inheritance, and sets/gets.
    Question questionFive = new Question5();

    // this do while loop allows for only one iteration of the program
    int counter = 10;
    int counter2 = 30;
    do { // program will have one iteration (at minimum) until it checks the condition at the bottom

      // calling a method to introduce program to user (no argument specified here)
      Intro.introduce();

      // creates an instance of class UserInfo do define name
      Question1.askingName();

      // creates an instance of class UserInfo do find book type (fav)
      Question2.askingBookType();

      // contains equals method, if-else, switch, Math class, and +,-,%,*, and break statement
      Question3.askingGenre();

      // uses +=
      Question4.askingQuote();

      // following three lines use polymorphism, inheritance, and sets/gets.
      questionFive.askQuestion();
      questionFive.findAnswer();
      questionFive.returnAnswer();

      // uses overloaded method
      System.out.println("You're " + Progress.PercentDone(25, 25) + "% done!");

      // contains array sum(w/ accumulator), enhanced for loop, and 1D arrays
      Question6.askingPageNums();

      // searches and finds index of 1D array; finds smallest and largest values in array
      Question7Me.tellingPageNums();

      // creates and searches multidimensional arrays (finds index as well)
      Question7User.askingTravelPref();

      // uses break statement in a loop; uses exception handling of user input int; uses ArrayList;
      // also uses enhanced for loop
      Question8.askingFavNum(); //

      // uses overloaded method
      System.out.println("You're " + Progress.PercentDone(25, 25, 25, 25) + "% done!");

      // contains Random class, and ternary operator
      Loading.loading();

      // contains for loop & continue statement
      Calculation.calculateTotal();

      counter--; // decrements counter by 1
      counter2++; // increments counter2 by 1

      // relational operator "OR": one of the values must be satisfied to continue the program
      // and also uses equality operators.
    } while (counter >= 10 || counter2 <= 30);


  }
}

