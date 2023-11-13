package lt.codeacademy.javaua5.lvl2.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Hello world!
 */
public class App {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My First GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 600);

		DefaultListModel<String> model = new DefaultListModel<>();
		JList<String> sarasas = new JList<>(model);

		JLabel labelVardas = new JLabel("Vardas");
		JTextField vardasTextField = new JTextField(20);
		JLabel labelPavarde = new JLabel("Pavarde");
		JTextField pavardeTextField = new JTextField(20);
		JButton itrauktiMygtukas = new JButton("Itraukti i sarasa");
		JButton isvalymoMygtukas = new JButton("Isvalyti sarasa");

		itrauktiMygtukas.addActionListener(e -> {
			String ivestasVardas = vardasTextField.getText();
			String ivestaPavarde = pavardeTextField.getText();
			model.addElement(ivestasVardas + " " + ivestaPavarde);
			vardasTextField.setText(null);
			pavardeTextField.setText(null);
		});

		isvalymoMygtukas.addActionListener(e -> model.clear());

		JPanel panelVirsus = new JPanel();
		panelVirsus.setPreferredSize(new Dimension(300, 100));
		JPanel panelCentras = new JPanel();
		panelVirsus.add(labelVardas);
		panelVirsus.add(vardasTextField);
		panelVirsus.add(labelPavarde);
		panelVirsus.add(pavardeTextField);
		panelVirsus.add(itrauktiMygtukas);
		panelVirsus.add(isvalymoMygtukas);
		panelCentras.add(sarasas);

		frame.getContentPane().add(BorderLayout.NORTH, panelVirsus);
		frame.getContentPane().add(BorderLayout.CENTER, panelCentras);

		frame.setVisible(true);
	}
}
