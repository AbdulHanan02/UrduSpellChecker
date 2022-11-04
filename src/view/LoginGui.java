package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginGui {
	private JFrame frmUrduSpellChecker;
	private JTextField txtUser;
	private JTextField txtPass;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGui window = new LoginGui();
					window.frmUrduSpellChecker.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginGui() {
		initialize();
	}

	private void initialize() {
		frmUrduSpellChecker = new JFrame();
		frmUrduSpellChecker.getContentPane().setForeground(new Color(255, 255, 255));
		frmUrduSpellChecker.getContentPane().setBackground(new Color(255, 215, 0));
		frmUrduSpellChecker.setForeground(new Color(0, 0, 0));
		frmUrduSpellChecker.setTitle("URDU SPELL CHECKER");
		frmUrduSpellChecker.setBounds(100, 100, 450, 300);
		frmUrduSpellChecker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUrduSpellChecker.getContentPane().setLayout(null);
		
		txtUser = new JTextField();
		txtUser.setToolTipText("user");
		txtUser.setBounds(167, 57, 136, 20);
		frmUrduSpellChecker.getContentPane().add(txtUser);
		txtUser.setColumns(10);
		
		txtPass = new JTextField();
		txtPass.setToolTipText("pass");
		txtPass.setBounds(167, 103, 136, 20);
		frmUrduSpellChecker.getContentPane().add(txtPass);
		txtPass.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setBounds(88, 59, 69, 17);
		frmUrduSpellChecker.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setBounds(88, 106, 69, 17);
		frmUrduSpellChecker.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(164, 159, 89, 23);
		frmUrduSpellChecker.getContentPane().add(btnNewButton);
	}
}
