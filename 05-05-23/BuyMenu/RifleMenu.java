import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class RifleMenu extends JFrame implements ActionListener, KeyListener, MouseListener {

    JPanel gunButtonsPanel;
    JPanel descPanel;

    JButton galilButton;
    JButton famasButton;
    JButton ak47Button;
    JButton m4a1Button;
    JButton sgButton;
    JButton augButton;

    JButton exitButton;

    JButton[] gunArray = new JButton[7];

    JLabel gunOrderLabel;

    JPanel gunPriceAndModelPanel;

    ImageIcon gunIcon;
    JLabel gunIconLabel;
    JLabel gunNamePriceLabel;

    DecimalFormat decimalFormat;

    RifleMenu() {
        this.setTitle("RIFLE MENU");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1, 2));
        this.setResizable(false);
        this.addKeyListener(this);

        gunButtonsPanel = new JPanel();
        gunButtonsPanel.setPreferredSize(new Dimension(500, 700));
        gunButtonsPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 20));
        gunButtonsPanel.setBorder(new EmptyBorder(25, 75, 25, 25));
        gunButtonsPanel.setBackground(new Color(129, 133, 137, 128));

        galilButton = new JButton("1. IMI GALIL");
        famasButton = new JButton("2. FAMAS");
        ak47Button = new JButton("3. AK47");
        m4a1Button = new JButton("4. M4A1 CARBINE");
        sgButton = new JButton("5. SG-552 COMMANDO");
        augButton = new JButton("6. AUG");

        exitButton = new JButton("0. CANCEL");

        gunArray[0] = galilButton;
        gunArray[1] = famasButton;
        gunArray[2] = ak47Button;
        gunArray[3] = m4a1Button;
        gunArray[4] = sgButton;
        gunArray[5] = augButton;

        gunArray[6] = exitButton;

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

        if (e.getSource() == galilButton) {
            gunOrder("IMI GALIL", 2000);
        } else if (e.getSource() == famasButton) {
            gunOrder("FAMAS", 2250);
        } else if (e.getSource() == ak47Button) {
            gunOrder("AK47", 2500);
        } else if (e.getSource() == m4a1Button) {
            gunOrder("M4A1", 3100);
        } else if (e.getSource() == sgButton) {
            gunOrder("SG-552", 3500);
        } else if (e.getSource() == augButton) {
            gunOrder("AUG", 3500);
        } else if (e.getSource() == exitButton) {
            this.dispose();
            new BuyMenuFrame();
        }

    }

    public void gunOrder(String gunModel, int gunPrice) {

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
                galilButton.doClick();
                break;

            case '2':
                famasButton.doClick();
                break;

            case '3':
                ak47Button.doClick();
                break;

            case '4':
                m4a1Button.doClick();
                break;

            case '5':
                sgButton.doClick();
                break;

            case '6':
                augButton.doClick();
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
        if (e.getComponent() == galilButton) {
            gunIcon = new ImageIcon("RifleMenuPhotos/galilPhoto.png");
            gunNamePriceLabel.setText("IMI GALIL : $2,000");
            changeIconLabel();
        }

        if (e.getComponent() == famasButton) {
            gunIcon = new ImageIcon("RifleMenuPhotos/famasPhoto.png");
            gunNamePriceLabel.setText("FAMAS : $2,250");
            changeIconLabel();
        }

        if (e.getComponent() == ak47Button) {
            gunIcon = new ImageIcon("RifleMenuPhotos/ak47Photo.png");
            gunNamePriceLabel.setText("AK47 : $2,500");
            changeIconLabel();
        }

        if (e.getComponent() == m4a1Button) {
            gunIcon = new ImageIcon("RifleMenuPhotos/m4a1Photo.png");
            gunNamePriceLabel.setText("M4A1 : $3,100");
            changeIconLabel();
        }

        if (e.getComponent() == sgButton) {
            gunIcon = new ImageIcon("RifleMenuPhotos/sg552Photo.png");
            gunNamePriceLabel.setText("SG-552 : $3,500");
            changeIconLabel();
        }

        if (e.getComponent() == augButton) {
            gunIcon = new ImageIcon("RifleMenuPhotos/augPhoto.png");
            gunNamePriceLabel.setText("AUG : $3,500");
            changeIconLabel();
        }

    }

    public void mouseExited(MouseEvent e) {

        if (e.getComponent() == galilButton) {
            resetIconLabel(galilButton);
        }

        if (e.getComponent() == famasButton) {
            resetIconLabel(famasButton);
        }

        if (e.getComponent() == ak47Button) {
            resetIconLabel(ak47Button);
        }

        if (e.getComponent() == m4a1Button) {
            resetIconLabel(m4a1Button);
        }

        if (e.getComponent() == sgButton) {
            resetIconLabel(sgButton);
        }

        if (e.getComponent() == augButton) {
            resetIconLabel(augButton);
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

}