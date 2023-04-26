/* ---------- Imports for our program ---------- */

import javax.swing.*;
import java.awt.*;
import java.time.*;
import java.time.format.*;

public class AskUserDetailsForm extends JPanel {
   /*
    * this extends JPanel so that we do not need to make a JPanel, we use the
    * "this." keyword instead.
    */

   /* ---------- Variables that we will be using ---------- */

   JLabel nameLabel;
   JTextField nameField;

   JLabel birthdayLabel;
   JTextField birthdayField;

   JLabel genderLabel;
   JComboBox<String> genderBox; // JComboBox for gender choices
   final String[] GENDER_CHOICES = { "Male", "Female" }; // Array for JComboBox

   JLabel subjectLabel;
   JTextField subjectField;

   /* ---------- Starts the program, called in main method ---------- */
   AskUserDetailsForm() {

      // Setting the layout of our JPanel to GridLayout
      this.setLayout(new GridLayout(4, 2)); // 4 rows, 2 columns,

      /* ---------- Finish creating components and adding them ---------- */
      nameLabel = new JLabel("Name:");
      this.add(nameLabel);

      // 20 columns, other fields also get set 20 columns
      nameField = new JTextField(20);
      this.add(nameField);

      birthdayLabel = new JLabel("Birthday (MM/dd/yyyy):");
      this.add(birthdayLabel);

      birthdayField = new JTextField();
      this.add(birthdayField);

      genderLabel = new JLabel("Gender:");
      this.add(genderLabel);

      genderBox = new JComboBox<String>(GENDER_CHOICES);
      this.add(genderBox);

      subjectLabel = new JLabel("Subject:");
      this.add(subjectLabel);

      subjectField = new JTextField();
      this.add(subjectField);

      // Showing our components using a showConfirmDialog box
      int userChoice = JOptionPane.showConfirmDialog(null, this, "[AskUserDetails Program]",
            JOptionPane.OK_CANCEL_OPTION);

      // If the user chooses yes, showMessageDialog with user's details
      if (userChoice == JOptionPane.YES_OPTION) {

         /* ---------- Calculating for our userAge ---------- */

         // Creating a DateTimeFormatter object, for setting the format of our date
         DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("MM/dd/yyyy");

         // Formatting the entered birthdate information into our formattedDate object
         LocalDate userBirthday = LocalDate.parse(birthdayField.getText(), formattedDate);

         // Getting the current date
         LocalDate currentDate = LocalDate.now();

         // Calculating for userAge and putting it in a Period object
         Period userAge = Period.between(userBirthday, currentDate);

         // Storing our user's details in one String
         String userDetails = "Name: " + nameField.getText()
               + "\nBirthday: " + birthdayField.getText()
               + "\nGender: " + genderBox.getSelectedItem()
               + "\nEmail: " + subjectField.getText()
               + "\nAge: " + userAge.getYears(); // getting the user's age from our Period object

         // Printing user's details using a showMessageDialog box
         JOptionPane.showMessageDialog(null, userDetails, "[User Details Summary]", JOptionPane.INFORMATION_MESSAGE);

      }

   }

}