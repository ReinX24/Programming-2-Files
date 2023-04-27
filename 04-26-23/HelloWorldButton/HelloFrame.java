import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloFrame extends JFrame implements ActionListener {

   JLabel mainLabel;
   JButton mainButton;

   HelloFrame() {
      this.setTitle("Hello World Button");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(300, 300);

      // Since our JFrame has BorderLayout by default, we will be using this layout
      // method

      // Creating and adding our JLabel
      mainLabel = new JLabel("Click the button to say hello!");
      mainLabel.setHorizontalAlignment(JLabel.CENTER); // center align text
      this.add(mainLabel, BorderLayout.CENTER); // center align in our JFrame

      // Creating and adding our JButton
      mainButton = new JButton("Say Hello");
      mainButton.setFocusable(false);
      mainButton.addActionListener(this); // adding an ActionListener to our JButton
      this.add(mainButton, BorderLayout.SOUTH); // south align in our JFrame

      this.setLocationRelativeTo(null); // JFrame will appear in the middle
      this.setVisible(true); // the JFrame will be visible to the user
   }

   public void actionPerformed(ActionEvent arg0) {

      // if the user presses the mainButton
      if (arg0.getSource() == mainButton) {

         // change mainLabel text to "Hello, World!"
         mainLabel.setText("Hello, World!");

      }

   }

}