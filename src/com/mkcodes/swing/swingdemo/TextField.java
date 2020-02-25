package com.mkcodes.swing.swingdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TextField implements ActionListener {

	JTextField jTextField;
	JButton reverseButton;
	JLabel promptLabel;
	JLabel contentLabel;

	public TextField() {
		JFrame jFrame = new JFrame("Text Entry Application");

		jFrame.setLayout(new FlowLayout());

		jFrame.setSize(250, 120);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create JTextField with width 10
		jTextField = new JTextField(10);

		jTextField.setActionCommand("textField");

		reverseButton = new JButton("Reverse");

		jTextField.addActionListener(this);
		reverseButton.addActionListener(this);

		promptLabel = new JLabel("Enter Text: ");
		contentLabel = new JLabel("");

		jFrame.add(promptLabel);
		jFrame.add(jTextField);
		jFrame.add(contentLabel);
		jFrame.add(reverseButton);

		jFrame.setVisible(true);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new TextField();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().contentEquals("Reverse")) {
			// Reverse the String
			String originalString = jTextField.getText();
			String holder = "";
			for (int i = originalString.length() - 1; i > 0; i--) {
				holder += originalString.charAt(i);
			}
			contentLabel.setText(holder);
		} else {
			// Enter was pressed while textField was selected
			contentLabel.setText("You pressed Enter. Text is: " + jTextField.getText());
		}
	}

}
