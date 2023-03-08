import java.util.Scanner;

/* 
Authors: Rein Solis, Bread Castres
Date: 03/08/23
 */

public class AskUserInfo {

   public static void main(String[] args) {
      
      // Scanner object to accept user input
      Scanner userInput = new Scanner(System.in);
      
      System.out.println("\n[User Information Program]\n");
      
      // Input lastName
      System.out.print("Enter your last name: ");
      String lastName = userInput.nextLine();
      
      // Input firstName
      System.out.print("Enter your first name: ");
      String firstName = userInput.nextLine();
      
      // Input middleName
      System.out.print("Enter your middle name: ");
      String middleName = userInput.nextLine();
      
      // Input userBirthYear (INPUT BIRTHYEAR)
      System.out.print("Enter birth year: ");
      int userBirthYear = userInput.nextInt();
      
      // CALCULATE userAge (YEAR - BIRTHYEAR)
      final int CURRENT_YEAR = 2023;
      int userAge = CURRENT_YEAR - userBirthYear;
      
      // Input userYear
      System.out.print("Enter your year level: ");
      int userYearLevel = userInput.nextInt();
      
      // Input userBlock
      System.out.print("Enter your block number: ");
      int userBlockNum = userInput.nextInt();
      userInput.nextLine();
            
      // Input userDepartment
      System.out.print("Enter your department: ");
      String userDepartment = userInput.nextLine();
      
      // Input userSchool
      System.out.print("Enter your school: ");
      String userSchool = userInput.nextLine();
      
      // Display user's information summary
      System.out.println("\n[User Information Summary]\n");
      System.out.printf("[%-12s : %-12s]\n", "Last Name", lastName);
      System.out.printf("[%-12s : %-12s]\n", "First Name", firstName);
      System.out.printf("[%-12s : %-12s]\n", "Middle Name", middleName);
      System.out.printf("[%-12s : %-12d]\n", "Birth Year", userBirthYear);
      System.out.printf("[%-12s : %-12d]\n", "Age", userAge);
      System.out.printf("[%-12s : %-12d]\n", "Year Level", userYearLevel);
      System.out.printf("[%-12s : %-12d]\n", "Block Number", userBlockNum);
      System.out.printf("[%-12s : %-12s]\n", "Department", userDepartment);
      System.out.printf("[%-12s : %-12s]\n", "School", userSchool);
      
      // Closing our Scanner object
      userInput.close();
   }

}