import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JMenuItem;

public class Window {

	public static Character character;

	public static JFrame frame;
	public static JRadioButton[] choices;
	public static ButtonGroup choiceGroup;
	public static GridBagConstraints[] gbc_choices;
	public static JTextArea textArea;
	public static JButton btnConfirm;
	public static JMenu mnInventory, mnCharacter;
	public static JMenuItem[] mntmItem = new JMenuItem[100];
	public static JMenuItem mntmDrinkPotion, mntmEatFood;
	public static JLabel lblSkill, lblStamina, lblLuck;

	public static boolean started = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		mnCharacter = new JMenu("Character");
		menuBar.add(mnCharacter);

		mnInventory = new JMenu("Inventory");
		menuBar.add(mnInventory);

		for (int i = 0; i < 100; i++) {
			mntmItem[i] = new JMenuItem();
			mnInventory.add(mntmItem[i]);
		}

		character = new Character();

		lblSkill = new JLabel("Skill: " + character.getSkill() + "/" + character.getSkillInitial());
		mnCharacter.add(lblSkill);

		lblStamina = new JLabel("Stamina: " + character.getStamina() + "/" + character.getStaminaInitial());
		mnCharacter.add(lblStamina);

		lblLuck = new JLabel("Luck: " + character.getLuck() + "/" + character.getLuckInitial());
		mnCharacter.add(lblLuck);

		JSeparator separator = new JSeparator();
		mnCharacter.add(separator);

		mntmEatFood = new JMenuItem("Eat food ( " + character.getFood() + " left)");
		mntmEatFood.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				character.eat();
			}

		});
		mnCharacter.add(mntmEatFood);

		mntmDrinkPotion = new JMenuItem();
		mntmDrinkPotion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				character.drinkPotion();
			}

		});

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		choices = new JRadioButton[] { new JRadioButton(), new JRadioButton(), new JRadioButton(), new JRadioButton() };
		gbc_choices = new GridBagConstraints[] { new GridBagConstraints(), new GridBagConstraints(),
				new GridBagConstraints(), new GridBagConstraints() };
		choiceGroup = new ButtonGroup();
		for (int i = 0; i < choices.length; i++) {
			choiceGroup.add(choices[i]);
		}

		gbc_choices[0].insets = new Insets(0, 0, 0, 5);
		gbc_choices[0].gridx = 0;
		gbc_choices[0].gridy = 1;

		gbc_choices[1].insets = new Insets(0, 0, 0, 5);
		gbc_choices[1].gridx = 1;
		gbc_choices[1].gridy = 1;

		gbc_choices[2].insets = new Insets(0, 0, 0, 5);
		gbc_choices[2].gridx = 2;
		gbc_choices[2].gridy = 1;
		
		gbc_choices[3].insets = new Insets(0, 0, 0, 5);
		gbc_choices[3].gridx = 3;
		gbc_choices[3].gridy = 1;

		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 5;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 0;
		frame.getContentPane().add(textArea, gbc_textArea);

		btnConfirm = new JButton("Confirm");
		GridBagConstraints gbc_btnConfirm = new GridBagConstraints();
		gbc_btnConfirm.gridx = 4;
		gbc_btnConfirm.gridy = 1;
		frame.getContentPane().add(btnConfirm, gbc_btnConfirm);

		btnConfirm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < choices.length; i++) {
					if (choices[i].isSelected()) {
						if (!started) {
							character.addToInventory(choices[i].getText());
							character.addToInventory(choices[i].getText());
							mntmDrinkPotion.setText("Drink a " + choices[i].getText() + ": 2 left.");
							mnCharacter.add(mntmDrinkPotion);
						} else {
							character.setPage(Methods.pages[i]);
							character.hungry();
							break;
						}
					}
				}
				started = true;
				textArea.setText(Text.text(character.getPage()));
				Deathtrap.pageMethods();
				if (character.getStamina() <= 0) {
					character.die(Window.textArea.getText());
				}
			}

		});
		textArea.setText(Text.text(-1));
		Methods.choosePath(new String[] { "Potion of Skill", "Potion of Strength", "Potion of Fortune" });

	}
}
