package lt.codeacademy.javaua5.lvl2.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Hello world!
 */
public class App {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My Forst GUI!");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.GRAY);
		frame.add(BorderLayout.CENTER, centerPanel);

		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.BLUE);
		frame.add(BorderLayout.SOUTH, bottomPanel);

		JButton button = new JButton("Click me 1!");
		centerPanel.add(button);

		JButton button2 = new JButton("Click me 2!");
		bottomPanel.add(button2);

		frame.setVisible(true);
	}
}
