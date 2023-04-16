import javax.swing.*;

public class AskNameAndLike {

   public static void main(String[] args) {
      
      // Ask for a name and ask the user if they like programming
      
      String userName = JOptionPane.showInputDialog(null, "Enter your name");
      
      int userChoice = JOptionPane.showConfirmDialog(null, "Do you like programming " + userName + " ?");
      
      if (userChoice == JOptionPane.YES_OPTION) {
         JOptionPane.showMessageDialog(null, "Nice! I like programming too!");
      } else if (userChoice == JOptionPane.NO_OPTION) {
         JOptionPane.showMessageDialog(null, "Aw man, oh well.");
      } else if (userChoice == JOptionPane.CANCEL_OPTION) {
         JOptionPane.showMessageDialog(null, "Operation Cancelled!");
      }
      
   }

}