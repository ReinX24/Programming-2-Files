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
   JComboBox monthBox;
   JComboBox dayBox;
   JComboBox yearBox;

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
      nameField.setBounds(125, 100, 250, 30);

      mainPanel.add(nameField);

      mobileLabel = new JLabel("Mobile");
      mobileLabel.setBounds(50, 150, 70, 30);
      mobileLabel.setFont(new Font("Arial", Font.BOLD, 16));
      mobileLabel.setForeground(Color.WHITE);

      mainPanel.add(mobileLabel);

      mobileField = new JTextField();
      mobileField.setBounds(125, 150, 250, 30);

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
      dayBox.setBounds(290, 250, 50, 30);

      // TODO: finish other components

      mainPanel.add(dayBox);

      this.add(mainPanel);
      this.pack(); // we pack our JFrame before setting it to visible
      this.setLocationRelativeTo(null);
      this.setVisible(true);

   }

   public void actionPerformed(ActionEvent arg0) {

   }

}