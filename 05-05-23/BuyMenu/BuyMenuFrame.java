import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class BuyMenuFrame extends JFrame implements ActionListener, KeyListener {

	JPanel weaponPanel;
	JPanel pricePanel;
	static JPanel weaponOrderPanel = new JPanel();
	// ^ in order for components to be saved, must be static and instantiated
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
	JButton sniperButton;
	JButton buyButton;
	JButton exitClearButton;

	static JLabel totalLabel;
	static int userTotal = 0;
	String userGun;
	Double userGunPrice;

	static int maxBuyItems = 202334;
	static int itemsBoughtTracker = 0;

	final static Font CUSTOM_FONT = new Font("Arial", Font.BOLD, 14);

	DecimalFormat decimalFormat;

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
		exitClearButton = new JButton("0. EXIT / CLEAR");
		buyButton = new JButton("9. BUY");
		pistolButton = new JButton("1. PISTOLS");
		shotgunButton = new JButton("2. SHOTGUNS");
		smgButton = new JButton("3. SMGS");
		rifleButton = new JButton("4. RIFLES");
		sniperButton = new JButton("5. SNIPERS");
		lmgButton = new JButton("6. LMGS");
		ammoButton = new JButton("7. AMMO");
		equipmentButton = new JButton("8. EQUIPMENTS");

		// Adding our weapon buttons to our weaponButtons array
		weaponButtons[0] = pistolButton;
		weaponButtons[1] = shotgunButton;
		weaponButtons[2] = smgButton;
		weaponButtons[3] = rifleButton;
		weaponButtons[4] = sniperButton;
		weaponButtons[5] = lmgButton;
		weaponButtons[6] = ammoButton;
		weaponButtons[7] = equipmentButton;
		weaponButtons[8] = buyButton;
		weaponButtons[9] = exitClearButton;

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
		weaponOrderPanel.setLayout(new GridLayout(20, 1));

		// Adding our weaponOrderPanel to our pricePanel
		pricePanel.add(weaponOrderPanel);

		// JPanel that will contains the total of our user's gun orders
		totalPanel = new JPanel();
		totalPanel.setBackground(new Color(129, 133, 137, 255));
		totalPanel.setPreferredSize(new Dimension(400, 85));
		totalPanel.setLayout(new BorderLayout());

		// JLabel that will show user's total amount

		decimalFormat = new DecimalFormat("#.##");
		decimalFormat.setGroupingUsed(true);
		decimalFormat.setGroupingSize(3);

		totalLabel = new JLabel("TOTAL: $" + decimalFormat.format(userTotal));
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

		if (arg0.getSource() == pistolButton) {
			new PistolMenu(); // PistolMenu constructor
			this.dispose();
		} else if (arg0.getSource() == shotgunButton) {
			new ShotgunMenu();
			this.dispose();
		} else if (arg0.getSource() == smgButton) {
			new SubMachinegunMenu();
			this.dispose();
		} else if (arg0.getSource() == rifleButton) {
			new RifleMenu();
			this.dispose();
		} else if (arg0.getSource() == sniperButton) {
			new SniperMenu();
			this.dispose();
		} else if (arg0.getSource() == lmgButton) {
			new LargeMachineGunMenu();
			this.dispose();
		} else if (arg0.getSource() == ammoButton) {
			new AmmoMenu();
			this.dispose();
		} else if (arg0.getSource() == equipmentButton) {
			new EquipmentMenu();
			this.dispose();
		} else if (arg0.getSource() == buyButton) {
			confirmBuy();
		} else if (arg0.getSource() == exitClearButton) {

			String[] exitClearChoices = { "Exit", "Clear", "Cancel" };
			int confirmClearExit = JOptionPane.showOptionDialog(this, "Exit Buy Menu / Clear Buy Menu", "Exit / Clear",
					JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, exitClearChoices, null);

			if (confirmClearExit == 0) {
				// Closes our BuyMenuFrame
				confirmClose();
			} else if (confirmClearExit == 1) {
				// Resets items bought, total, and removes all weapon order labels
				confirmClear();
			}
		}

	}

	public void confirmBuy() {
		// TODO: make userTotal have commas's for prices
		int confirmBuyChoice = JOptionPane.showConfirmDialog(this, "Buy Orders for $" + userTotal, "Buy Confirmation", JOptionPane.YES_NO_OPTION);
		if (confirmBuyChoice == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(this, "Paid $" + userTotal, "Paid Message", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void confirmClose() {
		int confirmCloseChoice = JOptionPane.showConfirmDialog(this, "Exit Buy Menu?", "Exit Confirmation",
				JOptionPane.YES_NO_OPTION);
		if (confirmCloseChoice == JOptionPane.YES_OPTION) {
			this.dispose();
		}
	}

	public void confirmClear() {
		int confirmClearChoice = JOptionPane.showConfirmDialog(this, "Clear Weapon Order/s?", "Clear Confirmation",
				JOptionPane.YES_NO_OPTION);
		if (confirmClearChoice == JOptionPane.YES_OPTION) {
			itemsBoughtTracker = 0;
			userTotal = 0;

			decimalFormat = new DecimalFormat("#.##");
			decimalFormat.setGroupingUsed(true);
			decimalFormat.setGroupingSize(3);

			totalLabel.setText("TOTAL: $" + decimalFormat.format(userTotal));
			weaponOrderPanel.removeAll();
			this.repaint();
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {

		switch (e.getKeyChar()) {

			case 'b': // Buy button
				buyButton.doClick();
				break;

			case 'c': // Clear weapon orders
				confirmClear();
				break;

			case 'e': // Exit BuyMenyu
				confirmClose();
				break;

		}

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
				sniperButton.doClick();
				break;

			case '6':
				lmgButton.doClick();
				break;

			case '7':
				ammoButton.doClick();
				break;

			case '8':
				equipmentButton.doClick();
				break;

			case '9':
				buyButton.doClick();
				break;

			case '0':
				exitClearButton.doClick();
				break;

		}

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

}
