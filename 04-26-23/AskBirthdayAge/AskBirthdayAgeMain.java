import java.time.*;
import java.time.format.*;
import java.util.*;

public class AskBirthdayAgeMain {

   public static void main(String[] args) {
      
      // Scanner object to accept user input
      Scanner userInput = new Scanner(System.in);
      
      // Asking the user for their birthday
      System.out.print("What is your birthday? (MM-DD-YYYY): ");
      String userBirthday = userInput.nextLine();
      
      // Parse the user's input as a LocalDate object
      DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MM-dd-yyyy");
      LocalDate birthDate = LocalDate.parse(userBirthday, formatDate);

      // Calculating the user's age
      LocalDate nowDate = LocalDate.now();
      Period userAge = Period.between(birthDate, nowDate);
      
      // Printing the user's age
      System.out.println("You are " + userAge.getYears() + " years old.");

      userInput.close(); // closing our Scanner object

   }

}