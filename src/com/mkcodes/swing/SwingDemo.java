package com.mkcodes.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SwingDemo {

	public SwingDemo() {

		// Create a JFrame container
		JFrame jFrame = new JFrame("First Swing Application");

		// Give it a size
		jFrame.setSize(275, 100);

		// Terminate the program when the user closes the application
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Show it!
		jFrame.setVisible(true);

		// Create a JLabel
		JLabel jLabel = new JLabel("I see...");

		// Put the label on jFrame
		jFrame.add(jLabel);
	}

	public static void main(String[] args) {

		// Create the frame on the event-dispatch thread
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new SwingDemo();
			}
		});

	}

}
