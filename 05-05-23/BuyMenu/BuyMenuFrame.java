import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class BuyMenuFrame extends JFrame implements ActionListener, KeyListener {

	JPanel weaponPanel;
	JPanel pricePanel;
	static JPanel weaponOrderPanel = new JPanel();
	// ^ in order for components to be saves, must be static and instantiated
	// immediately
	JPanel totalPanel;

	JButton[] weaponButtons = new JButton[10];

	JButton pistolButton;
	JButton shotgunButton;
	JButton smgButton;
	JButton rifleButton;
	JButton lmgButton;
	JButton ammoButton;
	JButton equipmentButton;
	JButton aboutButton;
	JButton buyButton;
	JButton exitButton;

	static JLabel totalLabel;
	static Double userTotal = 0.0;
	String userGun;
	Double userGunPrice;

	static int maxBuyItems = 10;
	static int itemsBoughtTracker = 0;

	final static Font CUSTOM_FONT = new Font("Arial", Font.BOLD, 14);

	public BuyMenuFrame() {

		// Setting up our JFrame
		this.setTitle("BUY MENU : COUNTER STRIKE");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(1, 2));
		this.setResizable(false);
		this.addKeyListener(this);

		// Creating our JPanel that will contain our Gun Menu Buttons
		weaponPanel = new JPanel();
		weaponPanel.setPreferredSize(new Dimension(500, 700));
		weaponPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 20));
		weaponPanel.setBorder(new EmptyBorder(25, 75, 25, 25));
		weaponPanel.setBackground(new Color(129, 133, 137, 128)); // r, g, b, alpha value

		// Instantiating our JButtons
		exitButton = new JButton("0. CANCEL");
		buyButton = new JButton("9. BUY");
		pistolButton = new JButton("1. PISTOLS");
		shotgunButton = new JButton("2. SHOTGUNS");
		smgButton = new JButton("3. SMGS");
		rifleButton = new JButton("4. RIFLES");
		lmgButton = new JButton("5. LMGS");
		ammoButton = new JButton("6. AMMO");
		equipmentButton = new JButton("7. EQUIPMENTS");
		aboutButton = new JButton("8. ABOUT");

		// Adding our weapon buttons to our weaponButtons array
		weaponButtons[0] = pistolButton;
		weaponButtons[1] = shotgunButton;
		weaponButtons[2] = smgButton;
		weaponButtons[3] = rifleButton;
		weaponButtons[4] = lmgButton;
		weaponButtons[5] = ammoButton;
		weaponButtons[6] = equipmentButton;
		weaponButtons[7] = aboutButton;
		weaponButtons[8] = buyButton;
		weaponButtons[9] = exitButton;

		// Adding different settings to our JButtons
		for (int i = 0; i < weaponButtons.length; i++) {
			weaponButtons[i].setPreferredSize(new Dimension(400, 40));
			weaponButtons[i].addActionListener(this);
			weaponButtons[i].setHorizontalAlignment(JButton.LEFT);
			weaponButtons[i].setFocusable(false);
			weaponButtons[i].setBackground(new Color(129, 133, 137, 255));
			weaponButtons[i].setForeground(new Color(255, 195, 0));
			weaponButtons[i].setFont(CUSTOM_FONT);
			weaponPanel.add(weaponButtons[i]);
		}

		// Adding our weaponPanel to our JFrame
		this.add(weaponPanel);

		// JPanel that will contain another JPanel of user guns and prices
		pricePanel = new JPanel();
		pricePanel.setPreferredSize(new Dimension(500, 700));
		pricePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 45));
		pricePanel.setBackground(new Color(129, 133, 137, 128));

		// Creating a JLabel that contains user guns and prices
		weaponOrderPanel.setPreferredSize(new Dimension(400, 450));
		weaponOrderPanel.setBackground(new Color(129, 133, 137, 255));
		weaponOrderPanel.setBorder(new EmptyBorder(25, 25, 25, 25));
		weaponOrderPanel.setLayout(new GridLayout(10, 1));

		// Adding our weaponOrderPanel to our pricePanel
		pricePanel.add(weaponOrderPanel);

		// JPanel that will contains the total of our user's gun orders
		totalPanel = new JPanel();
		totalPanel.setBackground(new Color(129, 133, 137, 255));
		totalPanel.setPreferredSize(new Dimension(400, 85));
		totalPanel.setLayout(new BorderLayout());

		// JLabel that will show user's total amount
		totalLabel = new JLabel("TOTAL: $" + userTotal);
		totalLabel.setFont(CUSTOM_FONT);
		totalLabel.setForeground(new Color(255, 195, 0));
		totalLabel.setBorder(new EmptyBorder(0, 25, 0, 0));

		// Adding our JLabel containing user total to our JPanel
		totalPanel.add(totalLabel);

		// Adding our totalPanel to our pricePanel
		pricePanel.add(totalPanel);

		// Adding our pricePanel to our JFrame
		this.add(pricePanel);

		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		// TODO: add each weapon menus' JFrames

		if (arg0.getSource() == pistolButton) {
			new PistolMenu(); // PistolMenu constructor
			this.dispose();
		} else if (arg0.getSource() == shotgunButton) {
			new ShotgunMenu();
			this.dispose();
		} else if (arg0.getSource() == smgButton) {
			new SubmachinegunMenu();
			this.dispose();
		} else if (arg0.getSource() == rifleButton) {
			new RifleMenu();
			this.dispose();
		} else if (arg0.getSource() == lmgButton) {
			System.out.println("LMG!");
		} else if (arg0.getSource() == ammoButton) {
			System.out.println("AMMO!");
		} else if (arg0.getSource() == equipmentButton) {
			System.out.println("EQUPMENT!");
		} else if (arg0.getSource() == aboutButton) {
			JOptionPane.showMessageDialog(this, "Gun Buy Menu\nBy: Rein Solis", "About",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (arg0.getSource() == buyButton) {
			System.out.println("BUY!");
		} else if (arg0.getSource() == exitButton) {
			int confirmExit = JOptionPane.showConfirmDialog(this, "Exit Buy Menu?", "Exit",
					JOptionPane.YES_NO_OPTION);

			if (confirmExit == JOptionPane.YES_OPTION) {
				this.dispose();
			}
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

		switch (e.getKeyChar()) {

			case '1':
				pistolButton.doClick();
				break;

			case '2':
				shotgunButton.doClick();
				break;

			case '3':
				smgButton.doClick();
				break;

			case '4':
				rifleButton.doClick();
				break;

			case '5':
				lmgButton.doClick();
				break;

			case '6':
				ammoButton.doClick();
				break;

			case '7':
				equipmentButton.doClick();
				break;

			case '8':
				aboutButton.doClick();
				break;

			case '9':
				buyButton.doClick();
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
