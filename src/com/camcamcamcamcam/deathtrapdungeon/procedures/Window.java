package com.camcamcamcamcam.deathtrapdungeon.procedures;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import com.camcamcamcamcam.deathtrapdungeon.objects.Character;
import com.camcamcamcamcam.deathtrapdungeon.objects.States;

public class Window {

	public static JFrame frame;
	public static JRadioButton[] choices;
	public static ButtonGroup choiceGroup;
	public static GridBagConstraints[] gbc_choices;
	public static JTextArea textArea;
	public static JButton btnConfirm;
	public static JMenuItem mntmDrinkPotion, mntmEatFood, mntmSkill, mntmStamina, mntmLuck, mntmGold;
	public static JMenuBar menuBar;

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
					window.frame.setTitle("Deathtrap Dungeon");
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

		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		Deathtrap.character = new Character();

		mntmSkill = new JMenuItem(
				"Skill: " + Deathtrap.character.getSkill() + "/" + Deathtrap.character.getSkillInitial());
		menuBar.add(mntmSkill);

		mntmStamina = new JMenuItem(
				"Stamina: " + Deathtrap.character.getStamina() + "/" + Deathtrap.character.getStaminaInitial());
		menuBar.add(mntmStamina);

		mntmLuck = new JMenuItem("Luck: " + Deathtrap.character.getLuck() + "/" + Deathtrap.character.getLuckInitial());
		menuBar.add(mntmLuck);

		mntmGold = new JMenuItem("Gold: " + Deathtrap.character.getGold());
		menuBar.add(mntmGold);

		mntmEatFood = new JMenuItem("Eat food ( " + Deathtrap.character.getFood() + " left)");
		mntmEatFood.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Deathtrap.character.eat();
			}

		});
		menuBar.add(mntmEatFood);

		mntmDrinkPotion = new JMenuItem();
		mntmDrinkPotion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Deathtrap.character.drinkPotion();
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
							Deathtrap.character.equipment.add(choices[i].getText());
							mntmDrinkPotion.setText("Drink the " + choices[i].getText());
							menuBar.add(mntmDrinkPotion);

						} else {
							Deathtrap.character.setPage(Methods.pages[i]);

							Deathtrap.character.hungry();
							break;
						}
					}
				}
				started = true;
				textArea.setText(text());
				Deathtrap.pageMethods();
				if (Deathtrap.character.getStamina() <= 0) {
					Deathtrap.character.die(Window.textArea.getText());
				}
			}

		});
		textArea.setText(text());
		Methods.choosePath(0, 0, 0, "Potion of Skill", "Potion of Strength", "Potion of Fortune");

	}

	public static String text() {
		String text1 = "";
		String text2 = "";
		try {
			File file = new File("Text.txt");
			Scanner input = new Scanner(file);
			for (int i = 0; i <= Deathtrap.character.getPage(); i++) {
				text1 = input.nextLine();
				text2 = input.nextLine();
			}
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return text1 + "\n\n" + Deathtrap.character.states.setScores() + "\n\n" + text2;
	}
}
