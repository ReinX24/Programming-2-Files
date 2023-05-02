import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApp implements ActionListener {

   // Variables that we will be using in our program
   JFrame mainFrame; // for holding our program's components
   JTextField mainField; // where we will show our numbers and results

   JPanel buttonsPanel; // where we will store most of our buttons

   // Arrays that will store our JButtons
   JButton[] numberButtons = new JButton[10];
   JButton[] functionButtons = new JButton[9];

   // Buttons that we will be needing for our program
   JButton addButton, subButton, mulButton, divButton;
   JButton decButton, equButton, clrButton, delButton, negButton;

   // Custom Font settings for our JButtons
   Font customFont = new Font("Arial", Font.BOLD, 18);

   // Where we will store our numbers, result, and operator (+, -, *, /)
   double num1, num2, numResult;
   char userOperator;

   // Constructor of our class
   public CalculatorApp() {

      mainFrame = new JFrame("[Calculator App Practice]");
      mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mainFrame.setSize(500, 600);
      mainFrame.setLayout(null);

      mainField = new JTextField();
      mainField.setEditable(false);
      mainField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      mainField.setFont(customFont);
      mainField.setBounds(50, 25, 400, 100);

      mainFrame.add(mainField);

      // Creating our JButtons
      addButton = new JButton("+");
      subButton = new JButton("-");
      mulButton = new JButton("*");
      divButton = new JButton("/");
      decButton = new JButton(".");
      equButton = new JButton("=");
      clrButton = new JButton("CLEAR");
      delButton = new JButton("DEL");
      negButton = new JButton("(-)");

      // Adding our JButtons to our functionButtons array, 9 functionButtons
      functionButtons[0] = addButton;
      functionButtons[1] = subButton;
      functionButtons[2] = mulButton;
      functionButtons[3] = divButton;
      functionButtons[4] = decButton;
      functionButtons[5] = equButton;
      functionButtons[6] = clrButton;
      functionButtons[7] = delButton;
      functionButtons[8] = negButton;

      // Adding ActionListeners & more to each of our JButtons
      for (int i = 0; i < functionButtons.length; i++) {
         functionButtons[i].addActionListener(this);
         functionButtons[i].setFocusable(false);
         functionButtons[i].setFont(customFont);
      }

      // Filling in our numberButtons
      for (int i = 0; i < numberButtons.length; i++) {
         numberButtons[i] = new JButton(String.valueOf(i));
         numberButtons[i].addActionListener(this);
         numberButtons[i].setFocusable(false);
         numberButtons[i].setFont(customFont);
      }

      // Adding negButton, delButton, and clrButton at the bottom of our mainFrame
      negButton.setBounds(50, 500, 100, 50);
      delButton.setBounds(160, 500, 100, 50);
      clrButton.setBounds(270, 500, 100, 50);

      mainFrame.add(negButton);
      mainFrame.add(delButton);
      mainFrame.add(clrButton);

      // Creating our buttonsPanel
      buttonsPanel = new JPanel();
      buttonsPanel.setLayout(new GridLayout(4, 4, 10, 10));
      buttonsPanel.setBounds(50, 150, 400, 300);

      // Adding buttons to our buttonsPanel
      buttonsPanel.add(numberButtons[1]);
      buttonsPanel.add(numberButtons[2]);
      buttonsPanel.add(numberButtons[3]);
      buttonsPanel.add(addButton);
      buttonsPanel.add(numberButtons[4]);
      buttonsPanel.add(numberButtons[5]);
      buttonsPanel.add(numberButtons[6]);
      buttonsPanel.add(subButton);
      buttonsPanel.add(numberButtons[7]);
      buttonsPanel.add(numberButtons[8]);
      buttonsPanel.add(numberButtons[9]);
      buttonsPanel.add(mulButton);
      buttonsPanel.add(decButton);
      buttonsPanel.add(numberButtons[0]);
      buttonsPanel.add(equButton);
      buttonsPanel.add(divButton);

      mainFrame.add(buttonsPanel);

      mainFrame.setLocationRelativeTo(null);
      mainFrame.setVisible(true);

   }

   @Override // For our buttons
   public void actionPerformed(ActionEvent arg0) {

      // Checking if the user pressed any of our numberButtons
      for (int i = 0; i < numberButtons.length; i++) {
         if (arg0.getSource() == numberButtons[i]) {
            mainField.setText(mainField.getText().concat(String.valueOf(i)));
         }
      }

      // Checking if the user presses +, -, *, or /
      if (arg0.getSource() == addButton) {
         num1 = Double.parseDouble(mainField.getText());
         userOperator = '+';
         mainField.setText("");
      }

      if (arg0.getSource() == subButton) {
         num1 = Double.parseDouble(mainField.getText());
         userOperator = '-';
         mainField.setText("");
      }

      if (arg0.getSource() == mulButton) {
         num1 = Double.parseDouble(mainField.getText());
         userOperator = '*';
         mainField.setText("");
      }

      if (arg0.getSource() == divButton) {
         num1 = Double.parseDouble(mainField.getText());
         userOperator = '/';
         mainField.setText("");
      }

      // If the user presses the = operator
      if (arg0.getSource() == equButton) {

         num2 = Double.parseDouble(mainField.getText());

         switch (userOperator) {

            case '+':
               numResult = num1 + num2;
               break;

            case '-':
               numResult = num1 - num2;
               break;

            case '*':
               numResult = num1 * num2;
               break;

            case '/':
               numResult = num1 / num2;
               break;

         }

         mainField.setText(String.valueOf(numResult));
         num1 = numResult;

      }

      // Adds a decimal points to our number in our mainField
      if (arg0.getSource() == decButton) {
         mainField.setText(mainField.getText().concat("."));
      }

      // Makes the number in our mainField into a negative number
      if (arg0.getSource() == negButton) {
         double negNum = Double.parseDouble(mainField.getText());
         negNum *= -1; // negNum = negNum * -1; : turns the number into a negative number
         mainField.setText(String.valueOf(negNum));
      }

      // Deletes a last entered character in our mainField
      if (arg0.getSource() == delButton) {
         String tempString = mainField.getText();
         mainField.setText("");
         for (int i = 0; i < tempString.length() - 1; i++) {
            mainField.setText(mainField.getText() + tempString.charAt(i));
         }
      }

      // Clears our mainField
      if (arg0.getSource() == clrButton) {
         mainField.setText("");
      }

   }

   public static void main(String[] args) {
      new CalculatorApp(); // calling the constructor of our class
   }

}