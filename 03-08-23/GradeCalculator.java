import java.util.Scanner;

/* 
Authors: Rein Solis, Bread Castres
Date: 03/08/23
 */

public class GradeCalculator {

   public static void main(String[] args) {
   
      // Creating a Scanner object
      Scanner userInput = new Scanner(System.in);
      
      // Ask for prelim grade
      System.out.print("Enter PRELIM GRADE: ");
      float prelimGrade = userInput.nextFloat();
      
      // Ask for midterm grade
      System.out.print("Enter MIDTERM GRADE: ");
      float midtermGrade = userInput.nextFloat();
      
      // Ask for semi final grade
      System.out.print("Enter SEMI-FINAL GRADE: ");
      float semiFinalGrade = userInput.nextFloat();
      
      // Calculate & show final grade
      float finalGrade = (prelimGrade + midtermGrade + semiFinalGrade) / 3;
      
      // Check which grade level it falls upon
      String gradeLevel = "";
      
      // Calculating for gradeLevel
      if (finalGrade < 65) {
         gradeLevel = "(E/F)";
      } else if (finalGrade >= 65 && finalGrade <= 66) {
         gradeLevel = "(D)";
      } else if (finalGrade >= 67 && finalGrade <= 69) {
         gradeLevel = "(D+)";
      } else if (finalGrade >= 70 && finalGrade <= 72) {
         gradeLevel = "(C-)";
      } else if (finalGrade >= 73 && finalGrade <= 76) {
         gradeLevel = "(C)";
      } else if (finalGrade >= 77 && finalGrade <= 79) {
         gradeLevel = "(C+)";
      } else if (finalGrade >= 80 && finalGrade <= 82) {
         gradeLevel = "(B-)";
      } else if (finalGrade >= 83 && finalGrade <= 86) {
         gradeLevel = "(B)";
      } else if (finalGrade >= 87 && finalGrade <= 89) {
         gradeLevel = "(B+)";
      } else if (finalGrade >= 90 && finalGrade <= 92) {
         gradeLevel = "(A-)";
      } else if (finalGrade >= 93 && finalGrade <= 96) {
         gradeLevel = "(A)";
      } else if (finalGrade >= 97 && finalGrade <= 100) {
         gradeLevel = "(A+)";
      }
      
      // Print final 
      System.out.println("FINAL GRADE IS: " + finalGrade + " " + gradeLevel);
      
      // Closing our Scanner object
      userInput.close();
   
   }

}