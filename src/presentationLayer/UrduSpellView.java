package presentationLayer;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class UrduSpellView extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UrduSpellView frame = new UrduSpellView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public UrduSpellView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	

		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setBackground(Color.yellow);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(53, 62, 306, 96);
		contentPane.add(textPane);
		
		JButton btnNewButton = new JButton("Check sentence");
		btnNewButton.setBounds(151, 204, 128, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Enter a sentence to check its word");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(53, 22, 262, 14);
		contentPane.add(lblNewLabel);
		
		
		
	}
}
