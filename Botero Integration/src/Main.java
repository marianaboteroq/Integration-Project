public class Main {
  /*
   * Name:                Mariana Botero 
   * Program Description: The purpose of this program is to advise a user what book they should read
   *                      using data from personality questions. It manifests beginner-Java 
   *                      development techniques.
   *                      
   * Java's Eight Primitive Data Types: 
   * byte:    Can hold up to 8 bits of data and supports a range of integers with values from -128  
   *          to 127.
   *          
   * short:   Can hold up to 16 bits of data and supports a range of integers with values from 
   *          -32,768 to 32,767. 
   *               
   * int:     Can hold up to 32 bits of data and supports a range of integers with values from -231 
   *          to 231-1.    
   *          
   * long:    Can hold up to 64 bits of data and supports a range of integers with values from 
   *          values of Math.pow(2, -63) to Math.pow(2, 63)-1.
   *          
   * char:    Can hold 16 bits of data represented with a Unicode character.
   * 
   * float:   Can hold up to 32 bits of data with a range of fractional numbers (decimals) from 
   *          values of 1.40 x Math.pow(10, -45) to 3.4 x Math.pow(10, 38). Typically represented 
   *          with an 'F' at the end of the number.      
   *          
   * double:  Can hold up to 64 bits of data with a range of fractional numbers (decimals) from 
   *          values of 4.94 x Math.pow(10, -324) to 1.79 x Math.pow(10, 308).
   *          
   * boolean: Can hold 1 bit of data. Has two possible values: True or False.
   * 
   * Variables and Scopes:
   * Variable: A place holder for something else; a location in memory. 
   * Scope: A variable (region or code) that is only accessible in the method it was declared.
   */
  public static void main(String[] args) {
    System.out.println("Hello! Welcome to your not-so-common personality test!\n \nI will be "
        + "telling you what book you should read next based on one question.");
    System.out.println("Before we begin, grab a piece of paper and a pencil. \n\nAfter you think "
        + "about the question, figure out which two answers you agree with the most, because"
        + " you will be calculating the average of both answers to reveal your suggested book!");
    System.out.println("\nAre you ready?\n");
    int theAlchemist = 500;
    int slaughterHouse5 = 1000;
    int prideAndPrejudice = 10;
    boolean userAgreement = true;
    final String QA = "Question";
    double prideQuotient = 255;
    double alchemistQuotient = 750;
    double slaughterQuotient = 505;
    System.out.println(QA + ": Pick two philosophies in which you agree with the most. Remember"
        + " to add up two values you think are true (shown beside it) and divide the sum by two.");
    System.out.println("- Your actions define your consequences " + "(" + userAgreement + "="
        + theAlchemist + ")");
    System.out.println("- Time defines your consequences, therefore there is not such thing as free"
        + " will " + "(" + userAgreement + "=" + slaughterHouse5 + ")");
    System.out.println("- Strata does not influence where you end up in life " + "(" + userAgreement
        + "=" + prideAndPrejudice + ")\n");
    System.out.println(
        "Write the quotient on a piece of paper, and match it up with the following" + " numbers.");
    /*
     * In the following three statements, the variables prideQuotient, alchemistQuotient, and
     * slaughterQuotient are casted from the previous double data type, to int data type to truncate
     * the ".0" that would have otherwise been at the end of the numbers.
     */
    System.out.println("If your number is " + (int) prideQuotient + " you should read \"Pride and "
        + "Prejudice.\"");
    System.out.println("If your number is " + (int) alchemistQuotient + " you should read \"The"
        + " Alchemist.\"");
    System.out.println("If your number is " + (int) slaughterQuotient + " you should read \""
        + "\"Slaughterhouse 5.\"");
    System.out.println("Happy Reading!");

  }
}

