import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormFrame extends JFrame implements ActionListener {

   JPanel mainPanel;
   JLabel titleLabel;

   JLabel nameLabel;
   JTextField nameField;

   JLabel mobileLabel;
   JTextField mobileField;

   JLabel genderLabel;
   ButtonGroup genderButtonGroup;
   JRadioButton maleButton;
   JRadioButton femaleButton;

   JLabel birthLabel;
   JComboBox<String> monthBox;
   JComboBox<Integer> dayBox;
   JComboBox<Integer> yearBox;

   JLabel addressLabel;
   JTextArea addressArea;

   JCheckBox termsAndConditionsBox;

   JButton submitButton;
   JButton resetButton;

   JLabel statusLabel;

   JTextArea infoArea;

   FormFrame() {

      this.setTitle("[Simple User Registration Form]");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(900, 600);
      this.setResizable(false);

      // Adding a JPanel that will serve as our mainPanel
      mainPanel = new JPanel();
      // setPreferredSize since JFrame already has BorderLayout sa its layout
      mainPanel.setPreferredSize(new Dimension(900, 600));
      mainPanel.setBackground(new Color(0, 128, 128));
      mainPanel.setLayout(null);

      // Adding Registration Form title
      titleLabel = new JLabel("[Registration Form]");
      titleLabel.setBounds(300, 10, 300, 50);
      titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
      titleLabel.setHorizontalAlignment(JLabel.CENTER);
      titleLabel.setOpaque(true);
      titleLabel.setBackground(Color.WHITE);
      titleLabel.setForeground(Color.BLACK);
      titleLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

      mainPanel.add(titleLabel);

      // Adding name and mobile label and fields
      nameLabel = new JLabel("Name");
      nameLabel.setBounds(50, 100, 50, 30);
      nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
      nameLabel.setForeground(Color.WHITE);

      mainPanel.add(nameLabel);

      nameField = new JTextField();
      nameField.setBounds(125, 100, 275, 30);

      mainPanel.add(nameField);

      mobileLabel = new JLabel("Mobile");
      mobileLabel.setBounds(50, 150, 70, 30);
      mobileLabel.setFont(new Font("Arial", Font.BOLD, 16));
      mobileLabel.setForeground(Color.WHITE);

      mainPanel.add(mobileLabel);

      mobileField = new JTextField();
      mobileField.setBounds(125, 150, 275, 30);

      mainPanel.add(mobileField);

      // Adding gender radio buttons
      genderLabel = new JLabel("Gender");
      genderLabel.setBounds(50, 200, 70, 30);
      genderLabel.setFont(new Font("Arial", Font.BOLD, 16));
      genderLabel.setForeground(Color.WHITE);

      mainPanel.add(genderLabel);

      genderButtonGroup = new ButtonGroup(); // so that only 1 is selectable at a time

      maleButton = new JRadioButton("Male");
      maleButton.setFont(new Font("Arial", Font.BOLD, 16));
      maleButton.setBackground(new Color(0, 128, 128));
      maleButton.setForeground(Color.WHITE);
      maleButton.setBounds(150, 200, 100, 30);
      maleButton.setFocusable(false);
      maleButton.setSelected(true); // male by default

      genderButtonGroup.add(maleButton);

      mainPanel.add(maleButton);

      femaleButton = new JRadioButton("Female");
      femaleButton.setFont(new Font("Arial", Font.BOLD, 16));
      femaleButton.setBackground(new Color(0, 128, 128));
      femaleButton.setForeground(Color.WHITE);
      femaleButton.setBounds(250, 200, 100, 30);
      femaleButton.setFocusable(false);

      genderButtonGroup.add(femaleButton);

      mainPanel.add(femaleButton);

      // Adding date of birth combo boxes
      birthLabel = new JLabel("Date Of Birth");
      birthLabel.setBounds(50, 250, 150, 30);
      birthLabel.setFont(new Font("Arial", Font.BOLD, 16));
      birthLabel.setForeground(Color.WHITE);

      mainPanel.add(birthLabel);

      String[] monthArr = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December" };

      monthBox = new JComboBox<String>(monthArr);
      monthBox.setBounds(180, 250, 100, 30);

      mainPanel.add(monthBox);

      Integer[] dayArr = new Integer[31];
      for (int i = 0; i < 31; i++) {
         dayArr[i] = i + 1;
      }

      dayBox = new JComboBox<Integer>(dayArr);
      dayBox.setBounds(280, 250, 50, 30);

      mainPanel.add(dayBox);

      Integer[] yearArr = new Integer[100];
      Integer yearNum = 1923;
      for (int i = 0; i < 100; i++) {
         yearArr[i] = yearNum;
         yearNum++;
      }

      yearBox = new JComboBox<Integer>(yearArr);
      yearBox.setBounds(330, 250, 70, 30);

      mainPanel.add(yearBox);

      // Adding address label and jtextarea
      addressLabel = new JLabel("Address");
      addressLabel.setBounds(50, 300, 80, 30);
      addressLabel.setForeground(Color.WHITE);
      addressLabel.setFont(new Font("Arial", Font.BOLD, 16));

      mainPanel.add(addressLabel);

      addressArea = new JTextArea();
      addressArea.setLineWrap(true);
      addressArea.setBounds(150, 300, 250, 100);

      mainPanel.add(addressArea);

      termsAndConditionsBox = new JCheckBox("Accept Terms and Conditions");
      termsAndConditionsBox.setBounds(100, 410, 300, 50);
      termsAndConditionsBox.setFont(new Font("Arial", Font.BOLD, 16));
      termsAndConditionsBox.setOpaque(true);
      termsAndConditionsBox.setBackground(new Color(0, 128, 128));
      termsAndConditionsBox.setForeground(Color.WHITE);
      termsAndConditionsBox.setFocusable(false);

      mainPanel.add(termsAndConditionsBox);

      // Submit and Reset buttons
      submitButton = new JButton("Submit");
      submitButton.setHorizontalAlignment(JButton.CENTER);
      submitButton.setFocusable(false);
      submitButton.setBounds(50, 460, 160, 50);
      submitButton.addActionListener(this);

      mainPanel.add(submitButton);

      resetButton = new JButton("Reset");
      resetButton.setHorizontalAlignment(JButton.CENTER);
      resetButton.setFocusable(false);
      resetButton.setBounds(240, 460, 160, 50);
      resetButton.addActionListener(this);

      mainPanel.add(resetButton);

      // Adding a registration status label
      statusLabel = new JLabel("");
      statusLabel.setVisible(true);
      statusLabel.setOpaque(true);
      statusLabel.setBackground(Color.WHITE);
      statusLabel.setForeground(Color.BLACK);
      statusLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      statusLabel.setBounds(50, 520, 350, 40);
      statusLabel.setHorizontalAlignment(JLabel.CENTER);

      mainPanel.add(statusLabel);

      // infoArea, where all of the user's info will be stored
      infoArea = new JTextArea();
      infoArea.setLineWrap(true);
      infoArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      infoArea.setFont(new Font("Arial", Font.PLAIN, 12));
      infoArea.setBounds(500, 100, 350, 460);
      infoArea.setEditable(false);

      mainPanel.add(infoArea);

      this.add(mainPanel);
      this.pack(); // we pack our JFrame before setting it to visible
      this.setLocationRelativeTo(null);
      this.setVisible(true);

   }

   public void actionPerformed(ActionEvent arg0) {

      if (arg0.getSource() == submitButton) {

         if (checkInfo()) {

            JOptionPane.showMessageDialog(null, "Information Verified!", "[Regisration Success Message]",
                  JOptionPane.INFORMATION_MESSAGE);

            statusLabel.setText("Registration Successful!");

            // Adding the user's info in the userInfo JTextArea
            String userGender = maleButton.isSelected() ? "Male" : "Female";
            String userInfo = "";

            userInfo += "\nName: " + nameField.getText();
            userInfo += "\nMobile Number: " + mobileField.getText();
            userInfo += "\nGender: " + userGender;
            userInfo += "\nDate Of Birth: " + monthBox.getSelectedItem() + " / " + dayBox.getSelectedItem() + " / "
                  + yearBox.getSelectedItem();
            userInfo += "\nAddress: " + addressArea.getText();

            infoArea.setText(userInfo);

         } else {

            JOptionPane.showMessageDialog(null, "Please Check Terms and Conditions!",
                  "[Terms And Conditions Not Selected]",
                  JOptionPane.WARNING_MESSAGE);

         }

      } else if (arg0.getSource() == resetButton) {

         int userChoice = JOptionPane.showConfirmDialog(null, "Reset Information?", "[Reset Message]",
               JOptionPane.YES_NO_CANCEL_OPTION);

         if (userChoice == JOptionPane.YES_OPTION) {
            clearAll();
         }

      }

   }

   public boolean checkInfo() {

      if (termsAndConditionsBox.isSelected()) {
         return true;
      }
      return false;
   }

   public void clearAll() {

      // Clears all fields and resets to defaults
      nameField.setText("");
      mobileField.setText("");
      maleButton.setSelected(true);
      femaleButton.setSelected(false);
      monthBox.setSelectedIndex(0);
      dayBox.setSelectedIndex(0);
      yearBox.setSelectedIndex(0);
      addressArea.setText("");
      termsAndConditionsBox.setSelected(false);
      statusLabel.setText("");
      infoArea.setText("");

   }

}