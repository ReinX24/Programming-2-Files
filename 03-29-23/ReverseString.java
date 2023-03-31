import java.util.Scanner;

public class ReverseString {

   public static void main(String[] args) {
   
      /*
      
      Lab activity for students who were late for the class.
      
      Input a String and output the reverse of that String.
      
      */
      
      // Creating a Scanner object
      Scanner userInput = new Scanner(System.in);
      
      // Asking the user for a String
      System.out.print("Enter a String to be reversed: ");
      String userString = userInput.nextLine();
      
      // Reversing the String
      String reversedUserString = "";
      
      for (int i = userString.length() - 1; i >= 0; i--) {
         reversedUserString += userString.charAt(i);
      }
      
      // Printing the original and reversed String
      System.out.printf("%s : %s\n", "Original String", userString);
      System.out.printf("%s : %s\n", "Reversed String", reversedUserString);
   
      // Closing our Scanner object
      userInput.close();
   
   }

}