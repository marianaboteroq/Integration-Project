package core;

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
   */

  // This is a header, and public is an access modifier
  // Void is the return type, meaning this method doesn't return anything.
  // Method names should be in lowerCamelCase and named with a verb (main is the name of the method)
  // (String [] args) is the parameter (and can be defined arbitrarily)

  public static void main(String[] args) {

    int counter = 10; // this do while loop allows for only one iteration of the program
    int counter2 = 30;
    do { // program will have one iteration (at minimum) until it checks the condition at the bottom

      Intro.introduce(); // calling a method to introduce program to user (no argument specified
                         // here)
      Question1.askingName(); // creates an instance of class UserInfo do define name
      Question2.askingBookType();  // creates an instance of class UserInfo do find book type (fav)
      Question3.askingGenre(); /*
                                * contains equals method, if-else, switch, Math class, and +,-,%,*,
                                * and break statement
                                */
      Question4.askingQuote(); // uses +=
      Loading.loading(); // contains Random class, and ternary operator
      Calculation.calculateTotal(); // contains for loop, continue statement, 
      counter--; // decrements counter by 1
      counter2++; //increments counter2 by 1
    } while (counter >= 10 || counter2 <= 30); /*
                             * relational operator "OR": one of the values must be satisfied to
                             * continue the program also uses equality operators.
                             */

  }
}

