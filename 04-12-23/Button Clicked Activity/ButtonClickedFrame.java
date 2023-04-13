import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonClickedFrame extends JFrame implements ActionListener {   
   
   JTextField mainField;
   JButton clickButton;
   JButton deleteButton;

   ButtonClickedFrame() {
      this.setTitle("My Form");
      this.setSize(400, 200);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setResizable(false);
      this.setLayout(null);
      
      mainField = new JTextField();
      mainField.setText("Please Click Button");
      mainField.setBounds(125, 20, 150, 30);
      
      clickButton = new JButton("Click Me!");
      clickButton.setBounds(100, 60, 90, 20);
      clickButton.addActionListener(this);
      
      deleteButton = new JButton("Delete");
      deleteButton.setBounds(210, 60, 90, 20);
      deleteButton.addActionListener(this);
      
      this.add(mainField);
      this.add(clickButton);
      this.add(deleteButton);
      
      this.setVisible(true);
   
   }
   
   public void actionPerformed (ActionEvent arg0) {
      if (arg0.getSource() == clickButton) {
         mainField.setText("Button Clicked!");
      } else if (arg0.getSource() == deleteButton) {
         mainField.setText("");
      }
   }

}