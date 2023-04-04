import javax.swing.*;

public class AskAgeAndMoney {

   public static void main(String[] args) {
   
      // Asking the user for their age
      String inputAge = JOptionPane.showInputDialog(null, "How old are you?");
      
      // Converting the String inputAge to an Integer using parseInt
      int userAge = Integer.parseInt(inputAge);
      
      // Asking the user for their current amount of money
      String inputMoney = JOptionPane.showInputDialog(null, "How much money do you have?");
      
      // Converting the String inputMoney to a Double
      double userMoney = Double.parseDouble(inputMoney);
      
      // Printing the results along with messages and operations on entered values
      JOptionPane.showMessageDialog(null, "If you can double your money each year,\n" + 
      "You'll have " + (userMoney * 32) + 
      " dollars at age " + (userAge + 5) + "!"); 
   
   }

}