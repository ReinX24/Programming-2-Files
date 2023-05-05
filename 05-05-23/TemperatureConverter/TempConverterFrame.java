import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;
import java.awt.*;

public class TempConverterFrame extends JFrame implements ActionListener {

    /* Clean how the code is writted and also improve the design of the program */

    JLabel titleLabel;

    JPanel mainPanel;

    JPanel bottomPanel;

    JComboBox<String> topBox;
    JComboBox<String> bottomBox;
    final String[] tempChoices = { "Celsius", "Fahrenheit" };

    JTextField topField;
    JTextField bottomField;

    JButton convertButton;
    JButton clearButton;
    JButton exitButton;

    final Font titleFont = new Font("Arial", Font.BOLD, 28);
    final Font bodyFont = new Font("Arial", Font.PLAIN, 20);

    public TempConverterFrame() {

        this.setTitle("[Temperature Converter]");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        titleLabel = new JLabel("Temperature Converter");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setVerticalAlignment(JLabel.CENTER);
        titleLabel.setFont(titleFont);
        titleLabel.setOpaque(true);
        titleLabel.setBackground(new Color(0, 128, 128));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setPreferredSize(new Dimension(600, 100));

        this.add(titleLabel, BorderLayout.NORTH);

        mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(600, 200));
        mainPanel.setLayout(new GridLayout(2, 2, 25, 25));
        mainPanel.setBorder(new EmptyBorder(50, 25, 50, 25));

        topBox = new JComboBox<String>(tempChoices);
        topBox.setSelectedIndex(0);
        topBox.setFont(bodyFont);

        topField = new JTextField();
        topField.setFont(bodyFont);
        topField.setText("0");

        bottomBox = new JComboBox<>(tempChoices);
        bottomBox.setSelectedIndex(1);
        bottomBox.setFont(bodyFont);

        bottomField = new JTextField();
        bottomField.setFont(bodyFont);
        bottomField.setText("32");
        bottomField.setEditable(false); // bottom TextField cannot be edited

        mainPanel.add(topBox);
        mainPanel.add(topField);
        mainPanel.add(bottomBox);
        mainPanel.add(bottomField);

        this.add(mainPanel, BorderLayout.CENTER);

        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1, 3, 25, 25));
        bottomPanel.setPreferredSize(new Dimension(600, 100));
        bottomPanel.setBorder(new EmptyBorder(0, 25, 50, 25));

        convertButton = new JButton("Convert");
        convertButton.setFocusable(false);
        convertButton.addActionListener(this);

        clearButton = new JButton("Clear");
        clearButton.setFocusable(false);
        clearButton.addActionListener(this);

        exitButton = new JButton("Exit");
        exitButton.setFocusable(false);
        exitButton.addActionListener(this);

        bottomPanel.add(convertButton);
        bottomPanel.add(clearButton);
        bottomPanel.add(exitButton);

        this.add(bottomPanel, BorderLayout.SOUTH);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent arg0) {

        if (arg0.getSource() == convertButton) {

            if (topField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter a Temperature Value!", "[No Temperature Message]",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                try {

                    double userTemp = Double.parseDouble(topField.getText());

                    if (topBox.getSelectedIndex() == 0 && bottomBox.getSelectedIndex() == 1) {
                        bottomField.setText(String.valueOf((userTemp * 9 / 5) + 32));
                    } else if (topBox.getSelectedIndex() == 1 && bottomBox.getSelectedIndex() == 0) {
                        bottomField.setText(String.valueOf((userTemp - 32) * 5 / 9));
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Invalid Temperature Entered", "[Invalid Temperature Message]",
                            JOptionPane.WARNING_MESSAGE);
                }
            }

        } else if (arg0.getSource() == clearButton) {
            topBox.setSelectedIndex(0);
            topField.setText("0");
            bottomBox.setSelectedIndex(1);
            bottomField.setText("32");
        } else if (arg0.getSource() == exitButton) {
            this.dispose();
        }

    }

}
