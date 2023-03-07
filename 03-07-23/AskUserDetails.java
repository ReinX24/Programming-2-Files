import java.util.Scanner;

public class AskUserDetails {

   public static void main(String[] args) {
   
   /* 
   Create a Java program that gets the following details
   from the user.
   
   Print the following details from the user:
   - Last Name
   - First Name
   - Middle Name
   - Age
   - Birthday
   - Year
   - Block
   - Department
   - School
    */
   
      Scanner userInput = new Scanner(System.in);
      
      System.out.println("[User Information Program]");
      
      // Asking for last name
      System.out.print("Enter last name: ");
      String lastName = userInput.nextLine();
      
      // Asking for first name
      System.out.print("Enter first name: ");
      String firstName = userInput.nextLine();
      
      // Asking for middle name
      System.out.print("Enter middle name: ");
      String middleName = userInput.nextLine();
      
      // Asking for age
      System.out.print("Enter age: ");
      int userAge = userInput.nextInt();
      userInput.nextLine(); 
      // when asking for a String after asking for an int, put a nextLine after to avoid console formatting errors
      
      // Asking for birthday
      System.out.print("Enter your birthday: ");
      String userBirthday = userInput.nextLine();
      
      // Asking for year
      System.out.print("Enter your year: ");
      int userYear = userInput.nextInt();
      
      // Asking for block
      System.out.print("Enter your block: ");
      int blockNum = userInput.nextInt();
      userInput.nextLine(); 
      
      // Asking for department
      System.out.print("Enter your department: ");
      String userDepartment = userInput.nextLine();
      
      // Asking for school
      System.out.print("Enter your school: ");
      String userSchool = userInput.nextLine();
      
      // Printing user information, %s for Strings & %d for integers
      System.out.println("\n[User Information Summary]");
      System.out.printf("[%-11s : %-10s]\n", "Last Name", lastName);
      System.out.printf("[%-11s : %-10s]\n", "First Name", firstName);
      System.out.printf("[%-11s : %-10s]\n", "Middle Name", middleName);
      System.out.printf("[%-11s : %-10d]\n", "Age", userAge);
      System.out.printf("[%-11s : %-10s]\n", "Birthday", userBirthday);
      System.out.printf("[%-11s : %-10d]\n", "Year", userYear);
      System.out.printf("[%-11s : %-10d]\n", "Block", blockNum);
      System.out.printf("[%-11s : %-10s]\n", "Department", userDepartment);
      System.out.printf("[%-11s : %-10s]\n", "School", userSchool);
      
      // Closing our Scanner object
      userInput.close();
   }

}