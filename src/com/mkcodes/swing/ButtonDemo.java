package com.mkcodes.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class ButtonDemo implements ActionListener {

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

		// Without interface - new ActionListener() for each button? Too much work
		/*
		 * // Adding an action to our up button upButton.addActionListener(new
		 * ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * System.out.println("Moving up."); } });
		 * 
		 * // Adding an action to our down button downButton.addActionListener(new
		 * ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * System.out.println("Moving down."); } });
		 */

		// Now we've implemented ActionListener - much tidier

		upButton.addActionListener(this);
		downButton.addActionListener(this);

		label = new JLabel("Oh, hi Mark!");
		jFrame.add(upButton);
		jFrame.add(downButton);
		jFrame.add(label);
		jFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Respond to click - getActionCommand = what you instantiate the JButton with
		// (or by using the .setActionCommand() function)
		if (e.getActionCommand().equals("Up")) {
			label.setText("Moving up.");
		} else if (e.getActionCommand().equals("Down")) {
			label.setText("Moving down.");
		}
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
