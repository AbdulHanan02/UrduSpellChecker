package presentationLayer;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class UrduSpellView extends JFrame {

	private JPanel contentPane;
	JButton btnNewButton;
	JTextArea textArea;
	

	JTextArea textArea_1;
	
/**
 * @author Abdullah
 * GUI consisting of JFrame, labels, text areas and buttons
 */
	public UrduSpellView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setBackground(Color.yellow);
		
		JLabel lblNewLabel = new JLabel("Enter a sentence to check its word");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(33, 26, 458, 30);
		contentPane.add(lblNewLabel);
		
		textArea = new JTextArea();
		textArea.setBounds(33, 66, 458, 68);
		contentPane.add(textArea);
		
		textArea_1 = new JTextArea();
		textArea_1.setBounds(33, 245, 458, 31);
		contentPane.add(textArea_1);
		
		btnNewButton = new JButton("Check Sentence");
		btnNewButton.setBounds(210, 158, 145, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(35, 213, 91, 23);
		contentPane.add(lblNewLabel_1);
	}
	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JTextArea getTextArea_1() {
		return textArea_1;
	}

	public void setTextArea_1(JTextArea textArea_1) {
		this.textArea_1 = textArea_1;
	}
}
