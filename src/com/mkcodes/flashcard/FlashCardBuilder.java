package com.mkcodes.flashcard;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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

}
