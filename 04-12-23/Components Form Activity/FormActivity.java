import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormActivity {

   public static void main(String[] args) {
   
      // Creating our JFrame for our program
      JFrame mainFrame = new JFrame();
      mainFrame.setTitle("Form Activity");
      mainFrame.setSize(800, 800);
      mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mainFrame.setResizable(false);
      mainFrame.setLayout(null);

         // Adding a titleLabel for our mainFrame
         JLabel titleLabel = new JLabel();
         titleLabel.setText("Pogi Enterprises");
         titleLabel.setOpaque(true);
         titleLabel.setBackground(Color.WHITE);
         titleLabel.setForeground(Color.BLACK);
         titleLabel.setBounds(300, 10, 100, 50);
         titleLabel.setHorizontalAlignment(JLabel.CENTER);
         titleLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
         
         mainFrame.add(titleLabel);

      
    // Adding ImageIcon to our mainFrame
      ImageIcon iconMain = new ImageIcon("KENNETH.png");
      mainFrame.setIconImage(iconMain.getImage()); // sets the ImageIcon of the mainFrame
      
      // Adding JLabels and JFields (3)
      JLabel iconLabel = new JLabel();
      iconLabel.setBounds(10, 10, 100, 100);
      
      JLabel orderLabel = new JLabel();
      orderLabel.setText("Order No: ");
      orderLabel.setBounds(20, 50, 100, 80);
      
      JTextField orderField = new JTextField();
      orderField.setBounds(90, 75, 100, 30);
            
      JLabel customerLabel = new JLabel();
      customerLabel.setText("Customer Name: ");
      customerLabel.setBounds(20, 100, 100, 80);
      
      JTextField customerField = new JTextField();
      customerField.setBounds(120, 125, 100, 30);
      
      JLabel quantityLabel = new JLabel();
      quantityLabel.setText("Quantity: ");
      quantityLabel.setBounds(20, 150, 100, 80);
      
      JTextField quantityField = new JTextField();
      quantityField.setBounds(80, 175, 100, 30);
      
      // Pizza Type JPanel
      
      // Creating a pizzaLabel for our pizzaPanel
      JLabel pizzaLabel = new JLabel();
      pizzaLabel.setText("Pizza Type");
      pizzaLabel.setBounds(60, 190, 100, 100);
      
      // Creating a pizzaPanel
      JPanel pizzaPanel = new JPanel();
      pizzaPanel.setBounds(20, 250, 180, 150);
      pizzaPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      
      // Adding radiobuttons
      ButtonGroup pizzaButtons = new ButtonGroup();
      
      JRadioButton panButton = new JRadioButton("Pan Pizza");
      panButton.setBounds(30, 260, 100, 50);
      
      JRadioButton stuffedButton = new JRadioButton("Stuffed Crust");
      stuffedButton.setBounds(30, 300, 100, 50);
      
      JRadioButton regularButton = new JRadioButton("Regular");
      regularButton.setBounds(30, 340, 100, 50);
      
      pizzaButtons.add(panButton);
      pizzaButtons.add(stuffedButton);
      pizzaButtons.add(regularButton);
      
      mainFrame.add(panButton);
      mainFrame.add(stuffedButton);
      mainFrame.add(regularButton);
      
      // Adding JButtons
      JButton rateButton = new JButton("Calculate Rate");
      rateButton.setBounds(20, 420, 120, 50);
      
      mainFrame.add(rateButton);
      
      JButton totalButton = new JButton("Calculate Total");
      totalButton.setBounds(160, 420, 120, 50);
      
      mainFrame.add(totalButton);
      
      JButton clearButton = new JButton("Clear");
      clearButton.setBounds(300, 420, 120, 50);
      
      mainFrame.add(clearButton);
      
      // Adding JTextAreas
      JLabel rateLabel = new JLabel();
      rateLabel.setText("Rate: ");
      rateLabel.setBounds(250, 75, 100, 30);
      
      mainFrame.add(rateLabel);
      
      JTextArea rateArea = new JTextArea(5, 20);
      rateArea.setBounds(290, 75, 100, 30);
      
      mainFrame.add(rateArea);
      
      // Adding more JLabel and JTextField
      JLabel amountLabel = new JLabel();
      amountLabel.setText("Amount: ");
      amountLabel.setBounds(250, 125, 100, 30);
      
      mainFrame.add(amountLabel);
      
      // Adding a JPasswordField
      JPasswordField passField = new JPasswordField();
      passField.setBounds(310, 125, 100, 30);
      
      mainFrame.add(passField);
      
      JLabel toppingLabel = new JLabel();
      toppingLabel.setText("Cost of Toppings: ");
      toppingLabel.setBounds(250, 175, 130, 30);
      
      mainFrame.add(toppingLabel);
      
      JTextField toppingField = new JTextField();
      toppingField.setBounds(360, 175, 100, 30);
      
      mainFrame.add(toppingField);
      
      // Toppings panel
      JLabel topLabel = new JLabel();
      topLabel.setBounds(270, 190, 100, 100);
      topLabel.setText("Toppings");
      
      mainFrame.add(topLabel);
      
      JPanel topPanel = new JPanel();
      topPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      topPanel.setBounds(250, 250, 180, 150);
      topPanel.setLayout(null);
      
      // Adding a JCheckBox
      JCheckBox onionBox = new JCheckBox("Onion");
      onionBox.setBounds(10, 5, 100, 20);
      topPanel.add(onionBox);
      
      JCheckBox cheeseBox = new JCheckBox("Cheese");
      cheeseBox.setBounds(10, 35, 100, 20);
      
      JCheckBox tomatoBox = new JCheckBox("Tomato");
      tomatoBox.setBounds(10, 65, 100, 20);
      
      JCheckBox cornBox = new JCheckBox("Baby Corn");
      cornBox.setBounds(10, 95, 100, 20);
      
      topPanel.add(onionBox);
      topPanel.add(cheeseBox);
      topPanel.add(tomatoBox);
      topPanel.add(cornBox);
      
      mainFrame.add(topPanel);
      
      // Adding a JList to our mainFrame
      JLabel listLabel = new JLabel();
      listLabel.setText("JList");
      listLabel.setBounds(500, 60, 100, 50);
      
      mainFrame.add(listLabel);
      
      String[] listOne = {"1", "2", "3", "4", "5"};
      
      JList numList = new JList(listOne);
      numList.setBounds(500, 100, 100, 100);
      
      mainFrame.add(numList);
      
      // Adding a JComboBox to our mainFrame
      JLabel comboLabel = new JLabel();
      comboLabel.setText("JComboBox");
      comboLabel.setBounds(500, 200, 100, 50);
      
      mainFrame.add(comboLabel);
      
      String[] boxArr = {"Onion", "Cheese", "Tomato", "Baby Corn"};
      JComboBox comboBox = new JComboBox(boxArr);
      comboBox.setSelectedIndex(0);
      comboBox.setBounds(500, 250, 100, 50);
      
      mainFrame.add(comboBox);
      
      // Adding a JFileChooser button
      JButton chooserButton = new JButton("Choose File");
      chooserButton.setBounds(500, 350, 100, 50);
      chooserButton.addActionListener(new ActionListener () {
      
         public void actionPerformed (ActionEvent arg0) {
            new ChooseFrame();
         }
      
      } );
      
      mainFrame.add(chooserButton);
      
      // Adding a JTabbedPane
      JLabel tabLabel = new JLabel();
      tabLabel.setText("JTabbedPane");
      tabLabel.setBounds(500, 400, 100, 100);
      
      mainFrame.add(tabLabel);
      
      JTabbedPane tabPane = new JTabbedPane();
      tabPane.setBounds(500, 500, 200, 100);
      
      JTextArea tabArea = new JTextArea(100, 100);
      
      JPanel p1 = new JPanel();
      p1.add(tabArea);
      
      JPanel p2 = new JPanel();
      p2.setBackground(Color.RED);
      
      JPanel p3 = new JPanel();
      p3.setBackground(Color.BLUE);
      
      tabPane.add("Main", p1);
      tabPane.add("Visit", p2);
      tabPane.add("Help", p3);
      
      mainFrame.add(tabPane);
      
      // Adding a JSlider
      JLabel sliderLabel = new JLabel();
      sliderLabel.setText("JSlider");
      sliderLabel.setBounds(500, 620, 100, 100);
      
      mainFrame.add(sliderLabel);
      
      JSlider mainSlider = new JSlider(0, 100, 50);
      mainSlider.setBounds(500, 680, 200, 50);
      
      mainFrame.add(mainSlider);
      
      // Adding components that are on the left side of the mainFrame
      mainFrame.add(orderLabel);
      mainFrame.add(orderField);
      
      mainFrame.add(customerLabel);
      mainFrame.add(customerField);
      
      mainFrame.add(quantityLabel);
      mainFrame.add(quantityField);
      
      mainFrame.add(pizzaLabel);
      mainFrame.add(pizzaPanel);
      
      mainFrame.setVisible(true);
   
   }

}