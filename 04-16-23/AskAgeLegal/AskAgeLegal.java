import javax.swing.*;

public class AskAgeLegal {

   public static void main(String[] args) {
   
      // Ask the user for an age, convert age to an integer, and check if they are 18 and above
   
      String userAge = JOptionPane.showInputDialog(null, "Enter your age");
      
      int userAgeNum = Integer.parseInt(userAge);
      
      if (userAgeNum >= 18) {
         JOptionPane.showMessageDialog(null, "You are of legal age!");
      } else {
         JOptionPane.showMessageDialog(null, "You are still a minor!");
      }
   
   }

}