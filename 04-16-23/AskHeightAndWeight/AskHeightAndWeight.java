import javax.swing.*;

public class AskHeightAndWeight {

   public static void main(String[] args) {
   
      // Ask for the user for their height and weight and convert them to integer and double
   
      String userHeight = JOptionPane.showInputDialog(null, "[Enter your height in cm]");
   
      String userWeight = JOptionPane.showInputDialog(null, "[Enter your weight in kg]");
   
      int userHeightNum = Integer.parseInt(userHeight);
      
      double userWeightNum = Double.parseDouble(userWeight);
      
      JOptionPane.showMessageDialog(null, "Height: " + userHeightNum + " cm" 
      + "\nWeight: " + userWeightNum + " kg");
   
   }

}