package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import java.awt.TextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class SpellCheckerApplication extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpellCheckerApplication frame = new SpellCheckerApplication();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SpellCheckerApplication() {
		setTitle("Urdu Spell Checker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Suggestions:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 116, 81, 14);
		contentPane.add(lblNewLabel_1);
		
		TextArea textArea = new TextArea();
		textArea.setText("");
		textArea.setBounds(8, 149, 177, 126);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Replace word with:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(213, 184, 113, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Word not found: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(213, 117, 127, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Replace Word");
		btnNewButton.setBounds(213, 240, 122, 23);
		contentPane.add(btnNewButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 11, 415, 94);
		contentPane.add(textPane);
		
		JLabel lblNewLabel_3 = new JLabel("\u0644\u0641\u0638 \u062A\u0628\u062F\u06CC\u0644 \u06A9\u0631\u06CC\u06BA:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(344, 184, 81, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u0644\u0641\u0638 \u0646\u06C1\u06CC\u06BA \u0645\u0644\u0627:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(357, 117, 68, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u062A\u062C\u0627\u0648\u06CC\u0632:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(147, 116, 38, 14);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(213, 149, 127, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(213, 209, 127, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\AbduAllah\\Desktop\\photo-1593005510329-8a4035a7238f.jpg"));
		lblNewLabel_6.setBounds(0, 0, 435, 285);
		contentPane.add(lblNewLabel_6);
	}
}
