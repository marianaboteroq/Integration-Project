package core;

import classes.UserInfo;

public class Question3 {

  public static void askingGenre() {
    
      final String QA = "Question"; // final variables cannot be changed
      String typeOne = "fiction"; // defining variables for later reference
      String typeTwo = "non fiction";
      
      UserInfo bookType = new UserInfo();  // creating new instance of UserInfo class (favBookType)
      String newBookType = bookType.getFavBookType(); 
      
      /* creating boolean variables to  compare two strings, disregarding case sensitivity
       * the equals method is used to compare the similarity of two objects, as == will merely
       * compare the location of those objects and not the similarity like equals() 
       * source: https://stackoverflow.com/questions/767372/string-equals-versus
      */
      boolean fiction = newBookType.equalsIgnoreCase(typeOne); 
      boolean nFiction = newBookType.equalsIgnoreCase(typeTwo);
                                                  
      System.out.printf("\nThird %s\n", QA); // Stating that this is the third question
      
      if (fiction == true) { 
          System.out.println("You picked fiction! Good choice. Now, which of the following"
              + " would you consider your favorite genre?");
          System.out.println("Satire, Fantasy, or Romance?" + " Respond in lowercase.\n");
          UserInfo favGenre = new UserInfo();
          favGenre.setFavBookGenre();

     } else if (nFiction == true) {
          System.out.println("You picked non-fiction! Good choice. Now, which of the following"
              + " would you consider your favorite genre?");
          System.out.println("Memoir, Science, or Spirituality?" + " Respond in lowercase.\n");
          UserInfo favGenre = new UserInfo();
          favGenre.setFavBookGenre();
     } else {
          System.out.println("Not a valid book type.");
      }
      
      UserInfo favGenre = new UserInfo();
      String newFavGenre = favGenre.getFavBookGenre();
      
      String a = "satire"; 
      // compares user's input to satire, while ignoring case sensitivity
      int varA = newFavGenre.compareToIgnoreCase(a); 
      if(varA == 0) { // if user input is the same as the "satire" genre
        System.out.println("You picked satire, jot down " + (Math.pow(2, 5) / 2) + " points\n");
        // 16
        // points
      
    } else { // otherwise program will compare user's input to all of the other genres
        switch (newFavGenre) {
          case "fantasy":
            System.out.println("You picked fantasy, jot down " + ((Math.pow(2, 5))) + " points.\n");
            // 32
            // points
            break; /* if newFavGenre (user input) corresponds to this specific case ("fantasy"), 
                     control will pass to statement outside of the loop. */
          case "romance":
            System.out.println("You picked romance, jot down " + ((Math.pow(2, 5)) * 2) + " points.\n");
            // 64
            // points
            break;
          case "memoir":
            System.out.println("You picked memoir, jot down " + ((Math.pow(2, 7)) - 2) + " points.\n");
            // 126
            // points
            break;
          case "science":
            System.out.println("You picked science, jot down " + ((Math.pow(2, 7)) % 3) + " points.\n");
            // 2
            // points
            break;
          case "spirituality":
            System.out
                .println("You picked spirituality, jot down" + ((Math.pow(2, 2)) * 3) + " points.\n"); 
            // 12
            // points
            break;
          default:
            System.out.println("Invalid response, try again in lowercase.\n"); 
        }

      }
    }
 }
