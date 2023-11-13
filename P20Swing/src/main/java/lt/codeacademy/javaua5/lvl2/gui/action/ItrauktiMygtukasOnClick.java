package lt.codeacademy.javaua5.lvl2.gui.action;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItrauktiMygtukasOnClick implements ActionListener {

	private final JTextField vardasTextField;
	private final JTextField pavardeTextField;
	private final DefaultListModel<String> model;

	public ItrauktiMygtukasOnClick(JTextField vardasTextField, JTextField pavardeTextField, DefaultListModel<String> model) {
		this.vardasTextField = vardasTextField;
		this.pavardeTextField = pavardeTextField;
		this.model = model;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String ivestasVardas = vardasTextField.getText();
		String ivestaPavarde = pavardeTextField.getText();
		model.addElement(ivestasVardas + " " + ivestaPavarde);
		vardasTextField.setText(null);
		pavardeTextField.setText(null);
	}
}
