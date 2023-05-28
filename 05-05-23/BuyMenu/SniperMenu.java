import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class SniperMenu extends JFrame implements ActionListener, KeyListener, MouseListener {

    JPanel gunButtonsPanel;
    JPanel descPanel;

    JButton scoutButton;
    JButton g3sg1Button;
    JButton sg550Button;
    JButton awpButton;

    JButton exitButton;

    JButton[] gunArray = new JButton[5];

    JLabel gunOrderLabel;

    JPanel gunPriceAndModelPanel;

    ImageIcon gunIcon;
    JLabel gunIconLabel;
    JLabel gunNamePriceLabel;

    DecimalFormat decimalFormat;

    SniperMenu() {
        this.setTitle("SNIPER MENU");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1, 2));
        this.setResizable(false);
        this.addKeyListener(this);

        gunButtonsPanel = new JPanel();
        gunButtonsPanel.setPreferredSize(new Dimension(500, 700));
        gunButtonsPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 20));
        gunButtonsPanel.setBorder(new EmptyBorder(25, 75, 25, 25));
        gunButtonsPanel.setBackground(new Color(129, 133, 137, 128));

        scoutButton = new JButton("1. SCOUT");
        g3sg1Button = new JButton("2. G3/SG-1");
        sg550Button = new JButton("3. SG-550");
        awpButton = new JButton("4. AWP");

        exitButton = new JButton("0. CANCEL");

        gunArray[0] = scoutButton;
        gunArray[1] = g3sg1Button;
        gunArray[2] = sg550Button;
        gunArray[3] = awpButton;

        gunArray[4] = exitButton;

        for (int i = 0; i < gunArray.length; i++) {
            gunArray[i].setPreferredSize(new Dimension(400, 40));
            gunArray[i].addActionListener(this);
            gunArray[i].setHorizontalAlignment(JButton.LEFT);
            gunArray[i].setFocusable(false);
            gunArray[i].setBackground(new Color(129, 133, 137, 255));
            gunArray[i].setForeground(new Color(255, 195, 0));
            gunArray[i].setFont(BuyMenuFrame.CUSTOM_FONT);
            gunArray[i].addMouseListener(this);
            gunButtonsPanel.add(gunArray[i]);
        }

        this.add(gunButtonsPanel);

        descPanel = new JPanel();
        descPanel.setPreferredSize(new Dimension(500, 700));
        descPanel.setBackground(new Color(129, 133, 137, 128));
        descPanel.setBorder(new EmptyBorder(40, 0, 0, 0));

        gunPriceAndModelPanel = new JPanel();
        gunPriceAndModelPanel.setLayout(new GridLayout(2, 1)); // 2 rows, 1 column
        gunPriceAndModelPanel.setPreferredSize(new Dimension(400, 580));
        gunPriceAndModelPanel.setBackground(new Color(129, 133, 137, 255));

        // Adding ImageIcon that will hold our gun icons
        gunIcon = new ImageIcon();
        gunIconLabel = new JLabel(gunIcon);

        gunPriceAndModelPanel.add(gunIconLabel);

        // Adding JLabel that will contain name and price of gun
        gunNamePriceLabel = new JLabel("", JLabel.CENTER);
        gunNamePriceLabel.setFont(BuyMenuFrame.CUSTOM_FONT);
        gunNamePriceLabel.setForeground(new Color(255, 195, 0));

        gunPriceAndModelPanel.add(gunNamePriceLabel);

        // Adding our JPanel that contains an ImageIcon and JLabel to our descPanel
        descPanel.add(gunPriceAndModelPanel);

        this.add(descPanel);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == scoutButton) {
            gunOrder("SCOUT", 2750.0);
        } else if (e.getSource() == g3sg1Button) {
            gunOrder("G3/SG-1", 5000.0);
        } else if (e.getSource() == sg550Button) {
            gunOrder("SG-550", 4200.0);
        } else if (e.getSource() == awpButton) {
            gunOrder("AWP", 4750.0);
        } else if (e.getSource() == exitButton) {
            this.dispose();
            new BuyMenuFrame();
        }

    }

    public void gunOrder(String gunModel, Double gunPrice) {

        if (BuyMenuFrame.itemsBoughtTracker == BuyMenuFrame.maxBuyItems) {
            JOptionPane.showMessageDialog(this, "Buy Limit Reached!", "Buy Limit Message", JOptionPane.WARNING_MESSAGE);
        } else {
            // Adding gunModel and gunPrice to Main Menu pistolOrderLabel and userTotal

            decimalFormat = new DecimalFormat("#.##");
            decimalFormat.setGroupingUsed(true);
            decimalFormat.setGroupingSize(3);

            gunOrderLabel = new JLabel(gunModel + " : $" + decimalFormat.format(gunPrice));
            gunOrderLabel.setFont(BuyMenuFrame.CUSTOM_FONT);
            gunOrderLabel.setForeground(new Color(255, 195, 0));
            BuyMenuFrame.userTotal += gunPrice;
            BuyMenuFrame.weaponOrderPanel.add(gunOrderLabel);
            BuyMenuFrame.totalLabel.setText("TOTAL: $" + decimalFormat.format(BuyMenuFrame.userTotal));
            BuyMenuFrame.itemsBoughtTracker += 1;
            this.dispose();
            new BuyMenuFrame();
        }

    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

        switch (e.getKeyChar()) {

            case '1':
                scoutButton.doClick();
                break;

            case '2':
                g3sg1Button.doClick();
                break;

            case '3':
                sg550Button.doClick();
                break;

            case '4':
                awpButton.doClick();
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
        gunIconLabel.setIcon(gunIcon);
    }

    // Resets our pistolIconLabel and pistolNamePriceLabel
    public void resetIconLabel(JButton paraButton) {
        gunIcon = new ImageIcon();
        gunIconLabel.setIcon(gunIcon);
        gunNamePriceLabel.setText("");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO: add SniperMenu photos
        if (e.getComponent() == scoutButton) {
            gunIcon = new ImageIcon("RifleMenuPhotos/galilPhoto.png");
            gunNamePriceLabel.setText("SCOUT : $2,750");
            changeIconLabel();
        }

        if (e.getComponent() == g3sg1Button) {
            gunIcon = new ImageIcon("RifleMenuPhotos/famasPhoto.png");
            gunNamePriceLabel.setText("G3/SG-1 : $5,000");
            changeIconLabel();
        }

        if (e.getComponent() == sg550Button) {
            gunIcon = new ImageIcon("RifleMenuPhotos/ak47Photo.png");
            gunNamePriceLabel.setText("SG-550 : $4,200");
            changeIconLabel();
        }

        if (e.getComponent() == awpButton) {
            gunIcon = new ImageIcon("RifleMenuPhotos/m4a1Photo.png");
            gunNamePriceLabel.setText("AWP : $4,750");
            changeIconLabel();
        }

    }

    public void mouseExited(MouseEvent e) {

        if (e.getComponent() == scoutButton) {
            resetIconLabel(scoutButton);
        }

        if (e.getComponent() == g3sg1Button) {
            resetIconLabel(g3sg1Button);
        }

        if (e.getComponent() == sg550Button) {
            resetIconLabel(sg550Button);
        }

        if (e.getComponent() == awpButton) {
            resetIconLabel(awpButton);
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

}