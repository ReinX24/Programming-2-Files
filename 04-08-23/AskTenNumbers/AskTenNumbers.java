import javax.swing.*;

public class AskTenNumbers {

   public static void main(String[] args) {
      
      // Showing the title of the program
      JOptionPane.showMessageDialog(null, "[Enter 10 Numbers Program]");
      
      int[] numArr = new int[10];
      
      int numAmount = 0;
      
      // Asking the user to enter 10 numbers
      while (numAmount < 10) {
         int userNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 10 numbers\nNumbers left: " + (numArr.length - numAmount)));
         numArr[numAmount++] = userNum;
      }
      
      // Printing the entered values in a JOptionPane message dialog
      String enteredValue = "The entered values are: ";
      for (int i = 0 ; i < numArr.length; i++) {
         if (i != numArr.length - 1) {
            enteredValue += numArr[i] + ", "; 
         } else {
            enteredValue += numArr[i];
         }
      }
      
      JOptionPane.showMessageDialog(null, enteredValue);
      
      // Finding the two highest values and their products
      
      // Finding the highest value
      int maxNum = Integer.MIN_VALUE;
      for (int i = 0; i < numArr.length; i++) {
         if (numArr[i] > maxNum) {
            maxNum = numArr[i];
         }
      }
      
      // Finding the second highest value
      int maxNumSecond = Integer.MIN_VALUE;
      for (int i = 0; i < numArr.length; i++) {
         if (numArr[i] > maxNumSecond && numArr[i] < maxNum) {
            maxNumSecond = numArr[i];
         }
      }
      
      // Showing the product of the highest and second highest entered values
      int productNum = maxNum * maxNumSecond;
      
      JOptionPane.showMessageDialog(null, "Highest Entered Value: " + maxNum 
      + "\nSecond Highest Entered Value: " + maxNumSecond 
      + "\n\nProduct of the Highest and the Second Highest Values: " + productNum);
      
      // Finding the average of the 10 values
      int averageNum = 0;
      for (int i = 0; i < numArr.length; i++) {
         averageNum += numArr[i];
      }
      
      averageNum /= numArr.length;
      
      JOptionPane.showMessageDialog(null, "The average of the 10 values is: " + averageNum);
      
      // Finding and showing the lowest value
      int lowestNum = Integer.MAX_VALUE;
      for (int i = 0; i < numArr.length; i++) {
         if (numArr[i] < lowestNum) {
            lowestNum = numArr[i];
         }
      }
      
      JOptionPane.showMessageDialog(null, "The lowest value is: " + lowestNum);
      
      // Printing the highest value, we already found it (check maxNum)
      JOptionPane.showMessageDialog(null, "The highest value is: " + maxNum);
      
      // Printing the quotient of the highest and lowest values
      int quotientNum = maxNum / lowestNum;
      JOptionPane.showMessageDialog(null, "The quotient of the highest and lowest value is: " + quotientNum);
   
   }

}