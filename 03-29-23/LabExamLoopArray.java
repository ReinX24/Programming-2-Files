import java.util.Scanner;

public class LabExamLoopArray {

   public static void main (String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      
      int[] numArr = new int[10];   
      System.out.println("Enter 10 values:");
       
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
      int maxNum = Integer.MIN_VALUE;
      for (int i = 0; i < numArr.length; i++) {
         if (numArr[i] > maxNum) {
            maxNum = numArr[i];
         }
      }
      
      // Finding the second highest value
      int secondMaxNum = Integer.MIN_VALUE;
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
      averageNum /= numArr.length;
      System.out.println("The average of the 10 values is: " + averageNum);
      
      // Finding the lowest value
      int lowestValue = Integer.MAX_VALUE;
      for (int i = 0; i < numArr.length; i++) {
         if (numArr[i] < lowestValue) {
            lowestValue = numArr[i];
         }
      }
      
      System.out.println("The lowest value is: " + lowestValue);
      
      // Printing the highest value
      System.out.println("The highest value is: " + maxNum);
      
      // Finding the quotient of the highest and lowest value
      int quotientNum = maxNum / lowestValue;
      System.out.println("The quotient of the highest and lowest value is: " + quotientNum);
   
   }

}