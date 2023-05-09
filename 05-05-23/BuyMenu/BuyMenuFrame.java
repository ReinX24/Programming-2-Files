import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class BuyMenuFrame extends JFrame implements ActionListener, KeyListener {

	JPanel weaponPanel;
	JPanel pricePanel;
	static JPanel weaponOrderPanel;
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

	final static Font customFont = new Font("Arial", Font.BOLD, 14);

	public BuyMenuFrame() {

		this.setTitle("Buy Menu : Counter Strike");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(1, 2));
		this.setResizable(false);
		this.addKeyListener(this);

		weaponPanel = new JPanel();
		weaponPanel.setPreferredSize(new Dimension(500, 700));
		weaponPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 20));
		weaponPanel.setBorder(new EmptyBorder(25, 75, 25, 25));
		weaponPanel.setBackground(new Color(129, 133, 137, 128)); // r, g, b, alpha value

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

		for (int i = 0; i < weaponButtons.length; i++) {
			weaponButtons[i].setPreferredSize(new Dimension(400, 40));

			weaponButtons[i].addActionListener(this);
			weaponButtons[i].setHorizontalAlignment(JButton.LEFT);
			weaponButtons[i].setFocusable(false);
			weaponButtons[i].setBackground(new Color(129, 133, 137, 255));
			weaponButtons[i].setForeground(new Color(255, 195, 0));
			weaponButtons[i].setFont(customFont);
			weaponPanel.add(weaponButtons[i]);
		}

		this.add(weaponPanel);

		pricePanel = new JPanel();
		pricePanel.setPreferredSize(new Dimension(500, 700));
		pricePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 45));
		pricePanel.setBackground(new Color(129, 133, 137, 128));

		weaponOrderPanel = new JPanel();
		weaponOrderPanel.setPreferredSize(new Dimension(400, 450));
		weaponOrderPanel.setBackground(new Color(129, 133, 137, 255));
		weaponOrderPanel.setBorder(new EmptyBorder(25, 25, 25, 25));
		weaponOrderPanel.setLayout(new GridLayout(10, 1));

		pricePanel.add(weaponOrderPanel);

		totalPanel = new JPanel();
		totalPanel.setBackground(new Color(129, 133, 137, 255));
		totalPanel.setPreferredSize(new Dimension(400, 85));
		totalPanel.setLayout(new BorderLayout());

		totalLabel = new JLabel("TOTAL: $");
		totalLabel.setFont(customFont);
		totalLabel.setForeground(new Color(255, 195, 0));
		totalLabel.setBorder(new EmptyBorder(0, 25, 0, 0));

		totalPanel.add(totalLabel);

		pricePanel.add(totalPanel);

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
			new PistolMenu();

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
		} else if (arg0.getSource() == aboutButton) {
			System.out.println("ABOUT!");
		} else if (arg0.getSource() == buyButton) {
			System.out.println("BUY!");
		} else if (arg0.getSource() == exitButton) {
			this.dispose();
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

	class PistolMenu extends JFrame implements ActionListener, KeyListener, MouseListener {

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

		ImageIcon pistolIcon;
		JLabel pistolIconLabel;

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
				pistolArray[i].setFont(BuyMenuFrame.customFont);
				pistolArray[i].addMouseListener(this);

				pistolPanel.add(pistolArray[i]);
			}

			this.add(pistolPanel);

			descPanel = new JPanel();
			descPanel.setPreferredSize(new Dimension(500, 700));
			descPanel.setBackground(new Color(129, 133, 137, 128));
			descPanel.setBorder(new EmptyBorder(250, 0, 0, 0));

			pistolIcon = new ImageIcon();
			pistolIconLabel = new JLabel(pistolIcon);
			pistolIconLabel.setPreferredSize(new Dimension(400, 200));
			pistolIconLabel.setFont(customFont);
			pistolIconLabel.setOpaque(true);
			pistolIconLabel.setBackground(new Color(129, 133, 137, 255));
			pistolIconLabel.setForeground(new Color(255, 195, 0));
			descPanel.add(pistolIconLabel);

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
			}

		}

		public void pistolOrder(String gunModel, Double gunPrice) {
			BuyMenuFrame.userTotal += gunPrice;
			pistolOrderLabel = new JLabel(gunModel + " : $" + gunPrice);
			pistolOrderLabel.setFont(BuyMenuFrame.customFont);
			pistolOrderLabel.setForeground(new Color(255, 195, 0));
			BuyMenuFrame.weaponOrderPanel.add(pistolOrderLabel);
			BuyMenuFrame.totalLabel.setText("TOTAL: $" + BuyMenuFrame.userTotal);
			this.dispose();
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

		// TODO: add each photo for each image in PistolMenu
		@Override
		public void mouseEntered(MouseEvent e) {
			if (e.getComponent() == glockButton) {
				// TODO: create a method for this to be used universally	
				pistolIcon = new ImageIcon("PistolMenuPhotos/glockPhoto.png");
				pistolIconLabel.setIcon(pistolIcon);
				pistolIconLabel.setText("GLOCK : $400");
				pistolIconLabel.setVerticalTextPosition(JLabel.BOTTOM);
				pistolIconLabel.setHorizontalTextPosition(JLabel.CENTER);

			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (e.getComponent() == glockButton) {
				pistolIcon = new ImageIcon();
				pistolIconLabel.setIcon(pistolIcon);
				pistolIconLabel.setText("");
			}

		}

		@Override
		public void mousePressed(MouseEvent e) {

		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

	}

}
