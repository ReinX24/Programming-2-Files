import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class AmmoMenu extends JFrame implements ActionListener, KeyListener, MouseListener {

    JPanel gunButtonsPanel;
    JPanel descPanel;

    JButton pistolAmmoButton;
    JButton smgAmmoButton;
    JButton rifleAmmoButton;
    JButton lmgAmmoButton;
    JButton sniperAmmoButton;

    JButton exitButton;

    JButton[] gunArray = new JButton[6];

    JLabel gunOrderLabel;

    JPanel gunPriceAndModelPanel;

    ImageIcon gunIcon;
    JLabel gunIconLabel;
    JLabel gunNamePriceLabel;

    DecimalFormat decimalFormat;

    int gunAmmoAmount;

    AmmoMenu() {
        this.setTitle("AMMO MENU");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1, 2));
        this.setResizable(false);
        this.addKeyListener(this);

        gunButtonsPanel = new JPanel();
        gunButtonsPanel.setPreferredSize(new Dimension(500, 700));
        gunButtonsPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 20));
        gunButtonsPanel.setBorder(new EmptyBorder(25, 75, 25, 25));
        gunButtonsPanel.setBackground(new Color(129, 133, 137, 128));

        pistolAmmoButton = new JButton("1. PISTOL AMMO");
        smgAmmoButton = new JButton("2. SMG AMMO");
        rifleAmmoButton = new JButton("3. RIFLE AMMO");
        lmgAmmoButton = new JButton("4. LMG AMMO");
        sniperAmmoButton = new JButton("5. SNIPER AMMO BUTTON");

        exitButton = new JButton("0. CANCEL");

        gunArray[0] = pistolAmmoButton;
        gunArray[1] = smgAmmoButton;
        gunArray[2] = rifleAmmoButton;
        gunArray[3] = lmgAmmoButton;
        gunArray[4] = sniperAmmoButton;

        gunArray[5] = exitButton;

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

        if (e.getSource() == pistolAmmoButton) {
            try {
                gunAmmoAmount = Integer
                        .parseInt(JOptionPane.showInputDialog("Enter PISTOL Ammo Amount (1 Dollar per bullet)"));
                ammoOrder("PISTOL AMMO", gunAmmoAmount * 1, gunAmmoAmount); // 1 dollar per bullet
            } catch (Exception arg0) {
                JOptionPane.showMessageDialog(this, "Invalid Ammo Input!", "Invalid Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (e.getSource() == smgAmmoButton) {
            try {
                gunAmmoAmount = Integer
                        .parseInt(JOptionPane.showInputDialog("Enter SMG Ammo Amount (2 Dollars per bullet)"));
                ammoOrder("SMG AMMO", gunAmmoAmount * 2, gunAmmoAmount); // 2 dollars per bullet
            } catch (Exception arg0) {
                JOptionPane.showMessageDialog(this, "Invalid Ammo Input!", "Invalid Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (e.getSource() == rifleAmmoButton) {
            try {
                gunAmmoAmount = Integer
                        .parseInt(JOptionPane.showInputDialog("Enter RIFLE Ammo Amount (3 Dollars per bullet)"));
                ammoOrder("RIFLE AMMO", gunAmmoAmount * 3, gunAmmoAmount); // 3 dollars per bullet
            } catch (Exception arg0) {
                JOptionPane.showMessageDialog(this, "Invalid Ammo Input!", "Invalid Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (e.getSource() == lmgAmmoButton) {
            try {
                gunAmmoAmount = Integer
                        .parseInt(JOptionPane.showInputDialog("Enter LMG Ammo Amount (4 Dollars per bullet)"));
                ammoOrder("LMG AMMO", gunAmmoAmount * 4, gunAmmoAmount); // 4 dollars per bullet
            } catch (Exception arg0) {
                JOptionPane.showMessageDialog(this, "Invalid Ammo Input!", "Invalid Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (e.getSource() == sniperAmmoButton) {
            try {
                gunAmmoAmount = Integer
                        .parseInt(JOptionPane.showInputDialog("Enter SNIPER Ammo Amount (5 Dollars per bullet)"));
                ammoOrder("SNIPER AMMO", gunAmmoAmount * 5, gunAmmoAmount); // 5 dollars per bullet
            } catch (Exception arg0) {
                JOptionPane.showMessageDialog(this, "Invalid Ammo Input!", "Invalid Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (e.getSource() == exitButton) {
            this.dispose();
            new BuyMenuFrame();
        }

    }

    public void ammoOrder(String ammoType, int gunPrice, int ammoAmount) {

        if (BuyMenuFrame.itemsBoughtTracker == BuyMenuFrame.maxBuyItems) {
            JOptionPane.showMessageDialog(this, "Buy Limit Reached!", "Buy Limit Message", JOptionPane.WARNING_MESSAGE);
        } else {
            // Adding gunModel and gunPrice to Main Menu pistolOrderLabel and userTotal

            decimalFormat = new DecimalFormat("#.##");
            decimalFormat.setGroupingUsed(true);
            decimalFormat.setGroupingSize(3);

            gunOrderLabel = new JLabel(ammoType + " (" + ammoAmount + ") : $" + decimalFormat.format(gunPrice));
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
                pistolAmmoButton.doClick();
                break;

            case '2':
                smgAmmoButton.doClick();
                break;

            case '3':
                rifleAmmoButton.doClick();
                break;

            case '4':
                lmgAmmoButton.doClick();
                break;

            case '5':
                sniperAmmoButton.doClick();
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
        // TODO: add photos for each ammo type
        if (e.getComponent() == pistolAmmoButton) {
            gunIcon = new ImageIcon("SniperMenuPhotos/scoutPhoto.png");
            gunNamePriceLabel.setText("SCOUT : $2,750");
            changeIconLabel();
        }

        if (e.getComponent() == smgAmmoButton) {
            gunIcon = new ImageIcon("SniperMenuPhotos/g3sg1Photo.png");
            gunNamePriceLabel.setText("G3/SG-1 : $5,000");
            changeIconLabel();
        }

        if (e.getComponent() == rifleAmmoButton) {
            gunIcon = new ImageIcon("SniperMenuPhotos/sg550Photo.png");
            gunNamePriceLabel.setText("SG-550 : $4,200");
            changeIconLabel();
        }

        if (e.getComponent() == lmgAmmoButton) {
            gunIcon = new ImageIcon("SniperMenuPhotos/awpPhoto.png");
            gunNamePriceLabel.setText("AWP : $4,750");
            changeIconLabel();
        }

        if (e.getComponent() == sniperAmmoButton) {
            gunIcon = new ImageIcon("SniperMenuPhotos/scoutPhoto.png");
            gunNamePriceLabel.setText("AWP : $4,750");
            changeIconLabel();
        }

    }

    public void mouseExited(MouseEvent e) {

        if (e.getComponent() == pistolAmmoButton) {
            resetIconLabel(pistolAmmoButton);
        }

        if (e.getComponent() == smgAmmoButton) {
            resetIconLabel(smgAmmoButton);
        }

        if (e.getComponent() == rifleAmmoButton) {
            resetIconLabel(rifleAmmoButton);
        }

        if (e.getComponent() == lmgAmmoButton) {
            resetIconLabel(lmgAmmoButton);
        }

        if (e.getComponent() == sniperAmmoButton) {
            resetIconLabel(sniperAmmoButton);
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

}