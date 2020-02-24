package com.mkcodes.swing.swingdemo;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TextField {

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

		// @TODO - JTextField, 06:48

		jFrame.add(jTextField);

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

}
