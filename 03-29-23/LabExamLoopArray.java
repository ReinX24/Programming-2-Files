import java.util.Scanner;

public class LabExamLoopArray {

   public static void main (String[] args) {
   
      /* 
         Why does this program user loops and array?
      
         The reason why this program uses a lot of for loops and
         an array is because if focuses on multiple test cases
         rather than the fixed text case that was given as the
         problem to be solved. So if you were to change the order
         in which you input your values or change your values
         as a whole, it will still output the correct results
         regardless of the values you put in and their order.
      
      */
   
      // Creating a Scanner object to accept user input
      Scanner userInput = new Scanner(System.in);
      
      // Creating an array that will hold our 10 integers
      int[] numArr = new int[10];   
      System.out.println("Enter 10 values:");
       
      // Prompting the user to enter 10 integers
      for (int i = 0; i < numArr.length; i++) {
         System.out.print("");
         numArr[i] = userInput.nextInt();
      }
      
      // Printing values using a for loop
      System.out.print("The entered values are ");
      for (int i = 0; i < numArr.length; i++) {
         if (i != numArr.length - 1) {
            System.out.print(numArr[i] + ", ");
         } else {
            System.out.println(numArr[i]);
         }
      }
      
      // Finding the two highest values and their product
      
      // Finding the highest value
      int maxNum = Integer.MIN_VALUE; // start from the smallest Integer value
      for (int i = 0; i < numArr.length; i++) {
         if (numArr[i] > maxNum) {
            maxNum = numArr[i];
         }
      }
      
      // Finding the second highest value
      int secondMaxNum = Integer.MIN_VALUE; // start from the smallest Integer value
      for (int i = 0; i < numArr.length; i++) {
         if (numArr[i] < maxNum && numArr[i] > secondMaxNum) {
            secondMaxNum = numArr[i];
         }
      }
      
      // Finding the product of the higest and second highest numbers
      int productNum = maxNum * secondMaxNum;
      System.out.println("The product of the two highest values is: " + productNum);
      
      // Finding the average of the 10 values
      int averageNum = 0;
      for (int i = 0; i < numArr.length; i++) {
         averageNum += numArr[i];
      }
      
      // Calculating and printing the average
      averageNum /= numArr.length;
      System.out.println("The average of the 10 values is: " + averageNum);
      
      // Finding the lowest value
      int lowestValue = Integer.MAX_VALUE; // start from the highest possible Integer value
      for (int i = 0; i < numArr.length; i++) {
         if (numArr[i] < lowestValue) {
            lowestValue = numArr[i];
         }
      }
      
      // Printing the lowest value in the array
      System.out.println("The lowest value is: " + lowestValue);
      
      // Printing the highest value in the array
      System.out.println("The highest value is: " + maxNum);
      
      // Finding the quotient of the highest and lowest value
      int quotientNum = maxNum / lowestValue;
      System.out.println("The quotient of the highest and lowest value is: " + quotientNum);
   
   }

}