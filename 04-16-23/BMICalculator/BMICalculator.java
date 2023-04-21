import javax.swing.*;

public class BMICalculator {

   public static void main(String[] args) {
   
      int userChoice = JOptionPane.NO_OPTION;
   
      JOptionPane.showMessageDialog(null, "[BMI Calculator]");
   
      while (userChoice != JOptionPane.CANCEL_OPTION) {
      
         String userName = JOptionPane.showInputDialog(null, "Enter your name");
      
         String heightStr = JOptionPane.showInputDialog(null, "Enter your height in meters (ex. 1.67)");
      
         String weightStr = JOptionPane.showInputDialog(null, "Enter your weight in kilograms (ex. 71.4)");
         
         userChoice = JOptionPane.showConfirmDialog(null, "[Confirm Information]" 
         + "\nName: " + userName 
         + "\nHeight: " + heightStr + " m" 
         + "\nWeight: " + weightStr + " kg");
         
         switch (userChoice) {
            
            case JOptionPane.YES_OPTION : 
               // Calculate BMI
               // BMI Formula: BMI = kg / (m ^ 2)
               
               Double userWeight = Double.parseDouble(weightStr);
               Double userHeight = Double.parseDouble(heightStr);
               
               userHeight *= userHeight;
               
               Double userBMI = userWeight / userHeight;
               
               userBMI = (double) Math.round(userBMI * 100) / 100;
               
               String userStatus = "";
               
               if (userBMI < 18.5) {
                  userStatus = "Underweight";
               } else if (userBMI >= 18.5 && userBMI <= 24.9) {
                  userStatus = "Healthy";
               } else if (userBMI >= 25.0 && userBMI <= 29.9) {
                  userStatus = "Overweight";
               } else if (userBMI >= 30.0) {
                  userStatus = "Obese";
               }
               
               JOptionPane.showMessageDialog(null, "[User Information]" 
               + "\nName: " + userName 
               + "\nHeight: " + heightStr + " m" 
               + "\nWeight: " + weightStr + " kg"
               + "\n\n BMI: " + userBMI 
               + "\nStatus: " + userStatus);
               
            break;
            
            case JOptionPane.NO_OPTION: 
               // Restart process
               JOptionPane.showMessageDialog(null, "[Incorrect Info Entered, Restarting!]");
            break;
            
            case JOptionPane.CANCEL_OPTION:
               // Stops the program
               JOptionPane.showMessageDialog(null, "[Shutting Down Program!]");
               break;
         
         }
      
      }
      
   
   }

}