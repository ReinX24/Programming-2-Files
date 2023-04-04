import javax.swing.*;

public class AskNameAndCake {

   public static void main(String[] args) {
      
      // Asking and storing the name of the user
      String userName = JOptionPane.showInputDialog(null, "What is your name?"); // showInputDialog accepts Strings only
      
      // Asking the user of they like cake
      int userChoice = JOptionPane.showConfirmDialog(null, "Do you like cake, " + userName + "?"); // showConfirmDialog accepts integers only
      
      /*
      
      showConfirmDialog will have 3 options, Yes, No, and Cancel. Yes has an int value of 0, No has 1, and Cancel has 2.
      Another way of evaluating userChoice is by using JOptionPane.YES_OPTION, JOptionPane.NO_OPTION, and JOptionPane.CANCEL_OPTION
      
      */
      
      // Evaluating the user's choice and printing a result
      if (userChoice == JOptionPane.YES_OPTION) {
         JOptionPane.showMessageDialog(null, "Of course! Who doesn't?");
      } else if (userChoice == JOptionPane.NO_OPTION) {
         JOptionPane.showMessageDialog(null, "We'll have to agree to disagree.");
      } else if (userChoice == JOptionPane.CANCEL_OPTION) {
         JOptionPane.showMessageDialog(null, "Goodbye!");
      }
      
   }

}