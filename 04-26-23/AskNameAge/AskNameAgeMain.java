import javax.swing.*;
import java.awt.*;

public class AskNameAgeMain {

   public static void main(String[] args) {

      // Creating JTextFields for user input
      JTextField nameField = new JTextField(20);
      JTextField ageField = new JTextField();

      // Creating a JPanel that will hold our components
      JPanel mainPanel = new JPanel(new GridLayout(2, 2)); // setting layout for ou JPanel

      // Adding components for our JPanel
      mainPanel.add(new JLabel("Name: "));
      mainPanel.add(nameField);
      mainPanel.add(new JLabel("Age: "));
      mainPanel.add(ageField);

      // Displaying our form to the user using showConfirmDialog
      int userChoice = JOptionPane.showConfirmDialog(null, mainPanel, "[Ask Name and Age]",
            JOptionPane.OK_CANCEL_OPTION);

      // Evaluating userChoice
      if (userChoice == JOptionPane.YES_OPTION) {
         String userName = nameField.getText();
         int userAge = Integer.parseInt(ageField.getText());
         String userMessage = "Name: " + userName + "\nAge: " + userAge;
         // Printing userMessage using showMessageDialog
         JOptionPane.showMessageDialog(null, userMessage);
      }

   }

}