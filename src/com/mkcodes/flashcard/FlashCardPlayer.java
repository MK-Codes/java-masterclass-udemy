package com.mkcodes.flashcard;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;

public class FlashCardPlayer {

	private JTextArea display;
	private JTextArea answer;
	private ArrayList<FlashCard> cardList;
	private Iterator cardIterator;
	private FlashCard currentCard;
	private int currentCardIndex;
	private JFrame frame;
	private boolean isShowAnswer;
	private JButton showAnswer;

	public FlashCardPlayer() {

		frame = new JFrame("Flash Card Player");
		JPanel mainPanel = new JPanel();
		Font font = new Font("Helvetica Neue", Font.BOLD, 22);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		display = new JTextArea(10, 20);
		display.setFont(font);

		JScrollPane qScrollPane = new JScrollPane(display);
		qScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		showAnswer = new JButton("Show Answer");
		mainPanel.add(qScrollPane);
		mainPanel.add(showAnswer);
		showAnswer.addActionListener(new NextCardListener());

		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem loadMenuItem = new JMenuItem("Load Card Set");

		loadMenuItem.addActionListener(new OpenMenuListener());

		fileMenu.add(loadMenuItem);
		menuBar.add(fileMenu);

		frame.setMenuBar(menuBar);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(640, 500);
		frame.setVisible(true);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new FlashCardPlayer();
			}
		});
	}

	class NextCardListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}
	}

	class OpenMenuListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JFileChooser fileOpen = new JFileChooser();
			fileOpen.showOpenDialog(frame);
			loadFile(fileOpen.getSelectedFile());
		}
	}

	private void loadFile(File selectedFile) {

	}
}
