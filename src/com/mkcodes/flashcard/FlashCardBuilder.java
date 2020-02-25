package com.mkcodes.flashcard;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;

public class FlashCardBuilder {

	private JTextArea question;
	private JTextArea answer;
	private ArrayList<FlashCard> cardList;
	private JFrame frame;

	public FlashCardBuilder() {

		frame = new JFrame("Flash Card");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = new JPanel();

		Font font = new Font("Helvetica Neue", Font.BOLD, 21);

		question = new JTextArea(6, 20);
		question.setLineWrap(true);
		question.setWrapStyleWord(true);
		question.setFont(font);

		JScrollPane qScrollPane = new JScrollPane(question);
		qScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		answer = new JTextArea(6, 20);
		answer.setLineWrap(true);
		answer.setWrapStyleWord(true);
		answer.setFont(font);

		JScrollPane aScrollPane = new JScrollPane(answer);
		aScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		aScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		JButton nextButton = new JButton("Next Card");

		JLabel qLabel = new JLabel("Question");
		JLabel aLabel = new JLabel("Answer");

		mainPanel.add(qLabel);
		mainPanel.add(qScrollPane);
		mainPanel.add(aLabel);
		mainPanel.add(aScrollPane);
		mainPanel.add(nextButton);

		nextButton.addActionListener(new NextCardListener());

		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem newMenuItem = new JMenuItem("New");
		JMenuItem saveMenuItem = new JMenuItem("Save");

		fileMenu.add(newMenuItem);
		fileMenu.add(saveMenuItem);
		menuBar.add(fileMenu);

		newMenuItem.addActionListener(new NewMenuItemListener());
		saveMenuItem.addActionListener(new SaveMenuItemListener());

		frame.setJMenuBar(menuBar);

		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(500, 600);
		frame.setVisible(true);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new FlashCardBuilder();
			}
		});

	}

	class NextCardListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			FlashCard card = new FlashCard(question.getText(), answer.getText());
			cardList.add(card);
			clearCard();
		}

	}

	class NewMenuItemListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			System.out.println("New clicked");
		}

	}

	class SaveMenuItemListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			FlashCard card = new FlashCard(question.getText(), answer.getText());
			cardList.add(card);
			JFileChooser fileSave = new JFileChooser();
			fileSave.showSaveDialog(frame);
			saveFile(fileSave.getSelectedFile());
		}

	}

	public void clearCard() {
		question.setText("");
		answer.setText("");
		question.requestFocus();
	}

	public void saveFile(File selectedFile) {

		// Buffered Writer is more efficient than others
		try {

			BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile));

			Iterator<FlashCard> cardIterator = cardList.iterator();

			while (cardIterator.hasNext()) {
				// Don't have to cast, but guarantees it will always be a FlashCard
				FlashCard card = cardIterator.next();
				// This could be done in a toString override in FlashCard, but I haven't learnt
				// that yet
				writer.write(card.getQuestion() + "/" + card.getAnswer() + "\n");
			}
			writer.close();
		} catch (Exception e) {
			System.out.println("Couldn't write file");
			e.printStackTrace();
		}
	}
}
