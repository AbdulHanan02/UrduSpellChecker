package presentationLayer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManualAdd extends JFrame{

	private JTextField textField;
	private JButton btnNewButton;

	public ManualAdd() {
		initialize();
	}
	
	private void initialize() {
		
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(42, 57, 130, 26);
		this.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Insert Word");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(178, 57, 117, 29);
		this.getContentPane().add(btnNewButton);
	}
	
	public JTextField getTextField() {
		return textField;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}
	
	
}
