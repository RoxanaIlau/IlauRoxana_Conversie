package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import control.MyEventListener;

public class GUI extends JFrame {

	public JTextField textField;
	public JTextArea textArea;
	public JButton buton1;
	public JButton buton2;
	public JButton buton3;

	public GUI() {
		
		//BorderLayoutul este defaultul la JFrame
		//this.setLayout(new BorderLayout());
		
		textField = new JTextField(25);
		// textField.addActionListener(this);
		textField.setEditable(true);

		textArea = new JTextArea(10, 25);
		textArea.setEditable(false);
		JScrollPane scroll = new JScrollPane();
		textArea.append(
				"Apasatati pe unul din butoanele mai sus pentru a realiza conversia numarului introdus in campul de mai sus.");
		textArea.add(scroll);

		MyEventListener listener = new MyEventListener(this);
				
		buton1 = new JButton();
		buton1.setText("Conversie in baza2");
		buton1.addActionListener(listener);

		buton2 = new JButton();
		buton2.setText("Conversie in baza 8");
		buton2.addActionListener(listener);

		buton3 = new JButton();
		buton3.setText("Conversie in baza 16");
		buton3.addActionListener(listener);

		this.add(textField, BorderLayout.NORTH);
		this.add(textArea, BorderLayout.SOUTH);
		this.add(buton1, BorderLayout.WEST);
		this.add(buton2, BorderLayout.CENTER);
		this.add(buton3, BorderLayout.EAST);
		this.setTitle("Test pentru buton");

		this.pack();

		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

		this.setVisible(true);

	}

}
