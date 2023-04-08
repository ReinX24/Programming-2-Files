import javax.swing.*;

public class AskNameAndAge {

   public static void main(String[] args) {
   
      String userName = JOptionPane.showInputDialog(null, "Enter your name:");
      
      int userAge = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age: "));
      
      int userChoice = JOptionPane.showConfirmDialog(null, "Name: " + userName + "\nAge: " + userAge);
      
      if (userChoice == JOptionPane.YES_OPTION) {
         JOptionPane.showMessageDialog(null, "Name and Age Recorded!");
      } else if (userChoice == JOptionPane.NO_OPTION) {
         JOptionPane.showMessageDialog(null, "No Information Recorded!");
      } else if (userChoice == JOptionPane.CANCEL_OPTION) {
         JOptionPane.showMessageDialog(null, "Recording Cancelled!");
      }
      
   }

}