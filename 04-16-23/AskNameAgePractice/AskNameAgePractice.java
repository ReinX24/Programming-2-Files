import javax.swing.*;

public class AskNameAgePractice {

   public static void main(String[] args) {
   
      // Accent a name and an age and turn age String into an integer
   
      String userName = JOptionPane.showInputDialog(null, "Enter your name");
      
      String userAge = JOptionPane.showInputDialog(null, "Enter your age");
      
      int userAgeNum = Integer.parseInt(userAge); // converting String into an integer
      
      JOptionPane.showMessageDialog(null, "Your name is " + userName + " and you are " + userAgeNum + " years old");
   
   }

}