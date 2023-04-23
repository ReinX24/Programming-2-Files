import javax.swing.*;
import java.awt.event.*;

public class LoginFormFrame extends JFrame implements ActionListener {

   JLabel userNameLabel;
   JTextField userNameField;

   JLabel passWordLabel;
   JTextField passWordTextField;
   JPasswordField passWordField;

   JCheckBox showPassWordBox;

   JButton loginButton;
   JButton resetButton;

   LoginFormFrame() {
      this.setTitle("[Login Form]");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(400, 800);
      this.setResizable(false);
      this.setLayout(null);

      userNameLabel = new JLabel("USERNAME");
      userNameLabel.setBounds(50, 180, 100, 50);
      this.add(userNameLabel);

      userNameField = new JTextField();
      userNameField.setBounds(150, 180, 200, 50);
      this.add(userNameField);

      passWordLabel = new JLabel("PASSWORD");
      passWordLabel.setBounds(50, 250, 100, 50);
      this.add(passWordLabel);

      passWordField = new JPasswordField();
      passWordField.setBounds(150, 250, 200, 50);
      this.add(passWordField);

      showPassWordBox = new JCheckBox("Show Password");
      showPassWordBox.setBounds(150, 300, 200, 50);
      showPassWordBox.setFocusable(false);
      showPassWordBox.addActionListener(this);
      this.add(showPassWordBox);

      loginButton = new JButton("Login");
      loginButton.setBounds(50, 350, 140, 50);
      loginButton.setFocusable(false);
      loginButton.addActionListener(this);
      this.add(loginButton);

      resetButton = new JButton("Reset");
      resetButton.setBounds(210, 350, 140, 50);
      resetButton.setFocusable(false);
      resetButton.addActionListener(this);
      this.add(resetButton);

      this.setLocationRelativeTo(null);
      this.setVisible(true);
   }

   public void actionPerformed(ActionEvent arg0) {

      if (arg0.getSource() == loginButton) {
         // TODO: research JPasswordField get text and compare. getText is deprecated
         if (userNameField.getText().equals("Rein") && passWordField.getText().equals("Minecraft64")) {
            JOptionPane.showMessageDialog(null, "Login Successful!", "[Login Success Message]",
                  JOptionPane.INFORMATION_MESSAGE);
         } else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password!", "[Login Invalid Message]",
                  JOptionPane.ERROR_MESSAGE);
         }
      } else if (arg0.getSource() == resetButton) {
         userNameField.setText("");
         passWordField.setText("");
      } else if (arg0.getSource() == showPassWordBox) {

         if (showPassWordBox.isSelected()) {
            passWordField.setEchoChar((char) 0); // shows the censored password
         } else {
            passWordField.setEchoChar('*'); // default password censor char
         }

      }

   }

}