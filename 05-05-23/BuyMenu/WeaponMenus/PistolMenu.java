import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class PistolMenu extends JFrame implements ActionListener {

    JPanel pistolPanel;
    JPanel descPanel;

    JButton glockButton;
    JButton uspButton;
    JButton p228Button;
    JButton deagleButton;
    JButton fiveSevenButton;
    JButton dualEliteButton;
    JButton exitButton;

    JButton[] pistolArray = new JButton[7];

    final Font customFont = new Font("Arial", Font.BOLD, 18);

    // TODO: test PistolMenu
    public PistolMenu() {
        this.setTitle("Pistol Menu");
        this.setLayout(new GridLayout(1, 2));

        pistolPanel = new JPanel();
        pistolPanel.setPreferredSize(new Dimension(1000, 700));
        pistolPanel.setLayout(new GridLayout(7, 1, 0, 25));
        pistolPanel.setBorder(new EmptyBorder(25, 75, 25, 25));
        
        glockButton = new JButton("1. GLOCK 18");
        uspButton = new JButton("2. USP TACTICAL");
        p228Button = new JButton("3. P228");
        deagleButton = new JButton("4. DESERT EAGLE");
        fiveSevenButton = new JButton("5. FN FIVE SEVEN");
        dualEliteButton = new JButton("6. DUAL G96 ELITE BERETTAS");

        pistolArray[0] = glockButton;
        pistolArray[1] = uspButton;
        pistolArray[2] = p228Button;
        pistolArray[3] = deagleButton;
        pistolArray[4] = fiveSevenButton;
        pistolArray[5] = dualEliteButton;
        pistolArray[6] = exitButton;

        for (int i = 0; i < pistolArray.length; i++) {
            pistolArray[i].addActionListener(this);
			pistolArray[i].setHorizontalAlignment(JButton.LEFT);
			pistolArray[i].setFocusable(false);
			pistolArray[i].setBackground(new Color(129, 133, 137, 255));
			pistolArray[i].setForeground(new Color(255, 195, 0));
			pistolArray[i].setFont(customFont);
			pistolPanel.add(pistolArray[i]);
        }

        this.add(pistolPanel);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public Double returnResult() {
        return 1.1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
