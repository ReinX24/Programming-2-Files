import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class PistolMenu extends JFrame implements ActionListener, KeyListener {

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

    String pistolModel;
    double pistolPrice;

    // TODO: test PistolMenu
    PistolMenu() {
        this.setTitle("Pistol Menu");
        this.setLayout(new GridLayout(1, 2));
        this.setResizable(false);
        this.addKeyListener(this);

        pistolPanel = new JPanel();
        pistolPanel.setPreferredSize(new Dimension(500, 700));
        pistolPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 20));
        pistolPanel.setBorder(new EmptyBorder(25, 75, 25, 25));
        pistolPanel.setBackground(new Color(129, 133, 137, 128));

        glockButton = new JButton("1. GLOCK 18");
        uspButton = new JButton("2. USP TACTICAL");
        p228Button = new JButton("3. P228");
        deagleButton = new JButton("4. DESERT EAGLE");
        fiveSevenButton = new JButton("5. FN FIVE SEVEN");
        dualEliteButton = new JButton("6. DUAL G96 ELITE BERETTAS");
        exitButton = new JButton("0. CANCEL");

        pistolArray[0] = glockButton;
        pistolArray[1] = uspButton;
        pistolArray[2] = p228Button;
        pistolArray[3] = deagleButton;
        pistolArray[4] = fiveSevenButton;
        pistolArray[5] = dualEliteButton;
        pistolArray[6] = exitButton;

        for (int i = 0; i < pistolArray.length; i++) {
            pistolArray[i].setPreferredSize(new Dimension(400, 40));

            pistolArray[i].addActionListener(this);
            pistolArray[i].setHorizontalAlignment(JButton.LEFT);
            pistolArray[i].setFocusable(false);
            pistolArray[i].setBackground(new Color(129, 133, 137, 255));
            pistolArray[i].setForeground(new Color(255, 195, 0));
            pistolArray[i].setFont(customFont);
            pistolPanel.add(pistolArray[i]);
        }

        this.add(pistolPanel);

        descPanel = new JPanel();
        descPanel.setPreferredSize(new Dimension(500, 700));

        this.add(descPanel);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public Double returnResult() {
        return pistolPrice;
    }

    public String returnPistolModel() {
        return pistolModel;
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == glockButton) {
            pistolModel = "GLOCK 18";
            pistolPrice = 400;
        } else if (e.getSource() == uspButton) {

        } else if (e.getSource() == p228Button) {

        } else if (e.getSource() == deagleButton) {

        } else if (e.getSource() == fiveSevenButton) {

        } else if (e.getSource() == dualEliteButton) {

        } else if (e.getSource() == exitButton) {
            this.dispose();
        }

    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

        switch (e.getKeyChar()) {

            case '1':
                glockButton.doClick();
                break;

            case '2':
                uspButton.doClick();
                break;

            case '3':
                p228Button.doClick();
                break;

            case '4':
                deagleButton.doClick();
                break;

            case '5':
                fiveSevenButton.doClick();
                break;

            case '6':
                dualEliteButton.doClick();
                break;

            case '0':
                exitButton.doClick();
                break;

        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

}
