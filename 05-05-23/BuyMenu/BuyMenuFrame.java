import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class BuyMenuFrame extends JFrame implements ActionListener, KeyListener {

	JPanel weaponPanel;
	JPanel pricePanel;

	JButton[] weaponButtons = new JButton[8];

	JButton pistolButton;
	JButton shotgunButton;
	JButton smgButton;
	JButton rifleButton;
	JButton lmgButton;
	JButton ammoButton;
	JButton equipmentButton;
	JButton exitButton;

	final Font customFont = new Font("Arial", Font.BOLD, 18);

	public BuyMenuFrame() {

		this.setTitle("Buy Menu : Counter Strike");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(1, 2));
		this.setResizable(false);
		this.addKeyListener(this);

		weaponPanel = new JPanel();
		weaponPanel.setPreferredSize(new Dimension(500, 700));
		weaponPanel.setLayout(new GridLayout(8, 1, 0, 25));
		weaponPanel.setBorder(new EmptyBorder(25, 75, 25, 25));
		weaponPanel.setOpaque(true);
		weaponPanel.setBackground(new Color(129, 133, 137, 128)); // r, g, b, alpha value

		exitButton = new JButton("0. CANCEL");
		pistolButton = new JButton("1. PISTOLS");
		shotgunButton = new JButton("2. SHOTGUNS");
		smgButton = new JButton("3. SMGS");
		rifleButton = new JButton("4. RIFLES");
		lmgButton = new JButton("5. LMGS");
		ammoButton = new JButton("6. AMMO");
		equipmentButton = new JButton("7. EQUIPMENTS");

		weaponButtons[0] = pistolButton;
		weaponButtons[1] = shotgunButton;
		weaponButtons[2] = smgButton;
		weaponButtons[3] = rifleButton;
		weaponButtons[4] = lmgButton;
		weaponButtons[5] = ammoButton;
		weaponButtons[6] = equipmentButton;
		weaponButtons[7] = exitButton;

		for (int i = 0; i < weaponButtons.length; i++) {
			weaponButtons[i].addActionListener(this);
			weaponButtons[i].setHorizontalAlignment(JButton.LEFT);
			weaponButtons[i].setFocusable(false);
			weaponButtons[i].setBackground(new Color(129, 133, 137, 255));
			weaponButtons[i].setForeground(new Color(255, 195, 0));
			weaponButtons[i].setFont(customFont);
			weaponPanel.add(weaponButtons[i]);
		}

		this.add(weaponPanel);

		// TODO: add components to pricePanel, JTextArea?
		pricePanel = new JPanel();
		pricePanel.setPreferredSize(new Dimension(500, 700));
		pricePanel.setBorder(BorderFactory.createLineBorder(Color.RED));

		this.add(pricePanel);

		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		// TODO: add each weapon menus' JFrames
		if (arg0.getSource() == pistolButton) {
			System.out.println("PISTOL!");
		} else if (arg0.getSource() == shotgunButton) {
			System.out.println("SHOTGUN!");
		} else if (arg0.getSource() == smgButton) {
			System.out.println("SMG!");
		} else if (arg0.getSource() == rifleButton) {
			System.out.println("RIFLE!");
		} else if (arg0.getSource() == lmgButton) {
			System.out.println("LMG!");
		} else if (arg0.getSource() == ammoButton) {
			System.out.println("AMMO!");
		} else if (arg0.getSource() == equipmentButton) {
			System.out.println("EQUPMENT!");
		} else if (arg0.getSource() == exitButton) {
			this.dispose();
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {

		switch (e.getKeyChar()) {

			// TODO: add shortcuts for other buttons
			case '1':
				pistolButton.doClick();
				break;

			case '0':
				exitButton.doClick();
				break;

		}
	}

}
