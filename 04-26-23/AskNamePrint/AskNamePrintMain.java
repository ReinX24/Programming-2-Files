import javax.swing.*;

public class AskNamePrintMain {

   public static void main(String[] args) {
   
      // Asking and storing userName
      String userName = JOptionPane.showInputDialog(null, "What is your name?");
   
      // Printing userName using showMessageDialog
      JOptionPane.showMessageDialog(null, "Hello, " + userName + "!");
   
   }

}