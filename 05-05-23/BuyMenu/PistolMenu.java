import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class PistolMenu extends JFrame implements ActionListener, KeyListener, MouseListener {

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

    JLabel pistolOrderLabel;

    JPanel pistolInfoPanel;

    ImageIcon pistolIcon;
    JLabel pistolIconLabel;
    JLabel pistolNamePriceLabel;

    PistolMenu() {
        this.setTitle("Pistol Menu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        fiveSevenButton = new JButton("5. FN FIVE-SEVEN");
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
            pistolArray[i].setFont(BuyMenuFrame.CUSTOM_FONT);
            pistolArray[i].addMouseListener(this);
            pistolPanel.add(pistolArray[i]);
        }

        this.add(pistolPanel);

        descPanel = new JPanel();
        descPanel.setPreferredSize(new Dimension(500, 700));
        descPanel.setBackground(new Color(129, 133, 137, 128));
        descPanel.setBorder(new EmptyBorder(40, 0, 0, 0));

        pistolInfoPanel = new JPanel();
        pistolInfoPanel.setLayout(new GridLayout(2, 1)); // 2 rows, 1 column
        pistolInfoPanel.setPreferredSize(new Dimension(400, 400));
        pistolInfoPanel.setBackground(new Color(129, 133, 137, 255));

        // Adding ImageIcon that will hold our gun icons
        pistolIcon = new ImageIcon();
        pistolIconLabel = new JLabel(pistolIcon);

        pistolInfoPanel.add(pistolIconLabel);

        // Adding JLabel that will contain name and price of gun
        pistolNamePriceLabel = new JLabel("", JLabel.CENTER);
        pistolNamePriceLabel.setFont(BuyMenuFrame.CUSTOM_FONT);
        pistolNamePriceLabel.setForeground(new Color(255, 195, 0));

        pistolInfoPanel.add(pistolNamePriceLabel);

        // Adding our JPanel that contains an ImageIcon and JLabel to our descPanel
        descPanel.add(pistolInfoPanel);

        this.add(descPanel);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == glockButton) {
            pistolOrder("GLOCK", 400.0);
        } else if (e.getSource() == uspButton) {
            pistolOrder("USP TACTICAL", 500.0);
        } else if (e.getSource() == p228Button) {
            pistolOrder("P228", 600.0);
        } else if (e.getSource() == deagleButton) {
            pistolOrder("DESERT EAGLE", 650.0);
        } else if (e.getSource() == fiveSevenButton) {
            pistolOrder("FN FIVE-SEVEN", 750.0);
        } else if (e.getSource() == dualEliteButton) {
            pistolOrder("DUAL 96G ELITE BERETTAS", 800.0);
        } else if (e.getSource() == exitButton) {
            this.dispose();
            new BuyMenuFrame();
        }

    }

    public void pistolOrder(String gunModel, Double gunPrice) {
        // Adding gunModel and gunPrice to Main Menu pistolOrderLabel and userTotal
        pistolOrderLabel = new JLabel(gunModel + " : $" + gunPrice);
        pistolOrderLabel.setFont(BuyMenuFrame.CUSTOM_FONT);
        pistolOrderLabel.setForeground(new Color(255, 195, 0));
        BuyMenuFrame.userTotal += gunPrice;
        BuyMenuFrame.weaponOrderPanel.add(pistolOrderLabel);
        BuyMenuFrame.totalLabel.setText("TOTAL: $" + BuyMenuFrame.userTotal);
        this.dispose();
        new BuyMenuFrame();
    }

    public void updateMenuLabel() {

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

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    // Changes the ImageIcon of our pistolIconLabel
    public void changeIconLabel() {
        pistolIconLabel.setIcon(pistolIcon);
    }

    // Resets our pistolIconLabel and pistolNamePriceLabel
    public void resetIconLabel(JButton paraButton) {
        pistolIcon = new ImageIcon();
        pistolIconLabel.setIcon(pistolIcon);
        pistolNamePriceLabel.setText("");
    }

    // TODO: add each photo for each image in PistolMenu
    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getComponent() == glockButton) {
            pistolIcon = new ImageIcon("PistolMenuPhotos/glockPhoto.png");
            pistolNamePriceLabel.setText("GLOCK : $400");
            changeIconLabel();
        }

        if (e.getComponent() == uspButton) {
            pistolIcon = new ImageIcon("PistolMenuPhotos/usp45Photo.png");
            pistolNamePriceLabel.setText("USP TACTICAL : $500");
            changeIconLabel();
        }

        if (e.getComponent() == p228Button) {
            pistolIcon = new ImageIcon("PistolMenuPhotos/p228Photo.png");
            pistolNamePriceLabel.setText("P228 : $600");
            changeIconLabel();
        }

        if (e.getComponent() == deagleButton) {
            pistolIcon = new ImageIcon("PistolMenuPhotos/deserteaglePhoto.png");
            pistolNamePriceLabel.setText("DESERT EAGLE : $650");
            changeIconLabel();
        }

        if (e.getComponent() == fiveSevenButton) {
            pistolIcon = new ImageIcon("PistolMenuPhotos/fivesevenPhoto.png");
            pistolNamePriceLabel.setText("FN FIVE SEVEN : $750");
            changeIconLabel();
        }

        if (e.getComponent() == dualEliteButton) {
            pistolIcon = new ImageIcon("PistolMenuPhotos/elitesPhoto.png");
            pistolNamePriceLabel.setText("DUAL 96G ELITE BERETTAS : $800");
            changeIconLabel();
        }

    }

    public void mouseExited(MouseEvent e) {

        if (e.getComponent() == glockButton) {
            resetIconLabel(glockButton);
        }

        if (e.getComponent() == uspButton) {
            resetIconLabel(uspButton);
        }

        if (e.getComponent() == p228Button) {
            resetIconLabel(p228Button);
        }

        if (e.getComponent() == deagleButton) {
            resetIconLabel(deagleButton);
        }

        if (e.getComponent() == fiveSevenButton) {
            resetIconLabel(fiveSevenButton);
        }

        if (e.getComponent() == dualEliteButton) {
            resetIconLabel(dualEliteButton);
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

}