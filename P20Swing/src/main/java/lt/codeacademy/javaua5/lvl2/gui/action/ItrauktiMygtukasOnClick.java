package lt.codeacademy.javaua5.lvl2.gui.action;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItrauktiMygtukasOnClick implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton button = (JButton) e.getSource();
			button.setText("Paspaudete mygtuka!!!");
			button.setForeground(Color.RED);
		}

		JOptionPane.showMessageDialog(null, "Paspausto mygtuko tektas!!!");
	}
}
