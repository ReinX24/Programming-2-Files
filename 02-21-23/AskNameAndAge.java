import java.util.Scanner;

public class AskNameAndAge {

   public static void main(String[] args) {
      // Creating a Scanner object to accept user input
      Scanner userInput = new Scanner(System.in);
      // Ask for name
      System.out.print("Enter your name: ");
      String userName = userInput.nextLine();
      // Ask for age
      System.out.print("Enter your age: ");
      int userAge = userInput.nextInt();
      // Printing userName & userAge
      System.out.printf("[Name\t:\t%s]\n[Age\t:\t%d]\n", userName, userAge);
      // Closing our Scanner object (userInput)
      userInput.close();
      
   }

}