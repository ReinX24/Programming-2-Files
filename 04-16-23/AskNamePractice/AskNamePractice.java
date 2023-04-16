import javax.swing.*;

public class AskNamePractice {

   public static void main(String[] args) {
   
      // Accept a name an display a name using JOptionPane
   
      String userName = JOptionPane.showInputDialog(null, "Enter your name");
      
      JOptionPane.showMessageDialog(null, "Your name is " + userName);
      
   }

}