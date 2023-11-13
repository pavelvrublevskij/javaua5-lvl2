package lt.codeacademy.javaua5.lvl2.gui;

import javax.swing.*;

/**
 * Hello world!
 */
public class App {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My Forst GUI!");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button = new JButton("Click me!");
		frame.add(button);

		frame.setVisible(true);
	}
}
