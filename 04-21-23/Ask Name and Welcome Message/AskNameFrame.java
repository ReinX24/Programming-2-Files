import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AskNameFrame extends JFrame implements ActionListener {

   JLabel askNameLabel;
   JTextField askNameField;
   JButton okButton;

   AskNameFrame() {

      this.setTitle("[Ask Name and Welcome Message]");
      this.setSize(500, 500);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setResizable(false);
      this.getContentPane().setBackground(new Color(0, 128, 128));
      this.setLayout(null);

      askNameLabel = new JLabel("Enter your name");
      askNameLabel.setBounds(100, 50, 300, 50);
      askNameLabel.setOpaque(true);
      askNameLabel.setBackground(Color.WHITE);
      askNameLabel.setForeground(Color.BLACK);
      askNameLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      askNameLabel.setFont(new Font("Arial", Font.BOLD, 16));
      askNameLabel.setHorizontalAlignment(JLabel.CENTER);

      this.add(askNameLabel);

      askNameField = new JTextField();
      askNameField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      askNameField.setBounds(100, 130, 300, 100);
      askNameField.setFont(new Font("Arial", Font.PLAIN, 16));
      askNameField.setHorizontalAlignment(JTextField.CENTER);

      this.add(askNameField);

      okButton = new JButton("Ok");
      okButton.setBounds(150, 260, 200, 50);
      okButton.setHorizontalAlignment(JButton.CENTER);
      okButton.setFont(new Font("Arial", Font.BOLD, 16));
      okButton.setFocusable(false);
      okButton.addActionListener(this);

      this.add(okButton);

      this.setLocationRelativeTo(null);
      this.setVisible(true);

   }

   public void actionPerformed(ActionEvent arg0) {

      if (arg0.getSource() == okButton) {
         JOptionPane.showMessageDialog(this, "Welcome " + askNameField.getText(), "[Welcome Message]",
               JOptionPane.INFORMATION_MESSAGE);
      }

   }

}