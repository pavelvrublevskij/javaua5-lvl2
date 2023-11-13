package lt.codeacademy.javaua5.lvl2.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import lt.codeacademy.javaua5.lvl2.gui.action.ItrauktiMygtukasOnClick;

public class MainApplicationFrame extends JFrame {

	private JButton itrauktiMygtukas;
	private JButton isvalymoMygtukas;
	private JTextField vardasTextField;
	private JTextField pavardeTextField;
	private DefaultListModel<String> model = new DefaultListModel<>();

	public MainApplicationFrame() {
		super("My First GUI");
		createComponents();
		addActionListeners();
	}

	private void addActionListeners() {
		itrauktiMygtukas.addActionListener(new ItrauktiMygtukasOnClick());

/*		itrauktiMygtukas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String ivestasVardas = vardasTextField.getText();
				String ivestaPavarde = pavardeTextField.getText();
				model.addElement(ivestasVardas + " " + ivestaPavarde);
				vardasTextField.setText(null);
				pavardeTextField.setText(null);
			}
		});

		isvalymoMygtukas.addActionListener(e -> model.clear());*/
	}

	private void createComponents() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 600);

		JList<String> sarasas = new JList<>(model);

		JLabel labelVardas = new JLabel("Vardas");
		vardasTextField = new JTextField(20);
		JLabel labelPavarde = new JLabel("Pavarde");
		pavardeTextField = new JTextField(20);
		itrauktiMygtukas = new JButton("Itraukti i sarasa");
		isvalymoMygtukas = new JButton("Isvalyti sarasa");

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

		this.getContentPane().add(BorderLayout.NORTH, panelVirsus);
		this.getContentPane().add(BorderLayout.CENTER, panelCentras);

		this.setVisible(true);
	}
}
