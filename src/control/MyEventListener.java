package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.GUI;

public class MyEventListener implements ActionListener {

	GUI gui;

	public MyEventListener(GUI gui) {
		this.gui = gui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		String text = gui.textField.getText();
		text = text.trim();
		
		JButton butonApasat = (JButton) e.getSource();

		if (butonApasat.equals(gui.buton1)) {
			try {
				gui.textArea.setText(Long.toBinaryString(Long.parseLong(text)));
			} catch (NumberFormatException nfc) {
				gui.textArea.setText("Ati introdus un sir de caractere incompatibil");
			}
		} else if (butonApasat.equals(gui.buton2)) {
			try {
				gui.textArea.setText(Integer.toOctalString(Integer.parseInt(text)));
			} catch (NumberFormatException nfc) {
				gui.textArea.setText("Ati introdus un sir de caractere incompatibil");
			}

		} else if (butonApasat.equals(gui.buton3)) {
			try {
				gui.textArea.setText(Integer.toHexString(Integer.parseInt(text)));
			} catch (NumberFormatException nfc) {
				gui.textArea.setText("Ati introdus un sir de caractere incompatibil");
			}
		}
		gui.textField.setText("");

	}

}