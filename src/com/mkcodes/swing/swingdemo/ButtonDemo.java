package com.mkcodes.swing.swingdemo;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class ButtonDemo {

	JLabel label;

	public ButtonDemo() {
		JFrame jFrame = new JFrame("Button Demo Application");

		// Layout manager - using FlowLayout
		// (https://docs.oracle.com/javase/tutorial/uiswing/layout/flow.html)
		jFrame.setLayout(new FlowLayout());

		jFrame.setSize(200, 80);

		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton upButton = new JButton("Up");
		JButton downButton = new JButton("Down");
		JButton leftButton = new JButton("Test");
		label = new JLabel("Oh, hi Mark!");
		jFrame.add(upButton);
		jFrame.add(downButton);
		jFrame.add(leftButton);
		jFrame.add(label);
		jFrame.setVisible(true);
	}

	public static void main(String[] args) {
		// Create the frame on the event-dispatch thread
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ButtonDemo();
			}
		});

	}

}
