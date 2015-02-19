import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(165, 137, 118, 29);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(141, 49, 161, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setText("");
		passwordField.setBounds(141, 106, 161, 28);
		frame.getContentPane().add(passwordField);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(190, 78, 63, 16);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(190, 29, 72, 16);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblDoNotHave = new JLabel("Do not have an account?");
		lblDoNotHave.setBounds(141, 225, 161, 16);
		frame.getContentPane().add(lblDoNotHave);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(166, 243, 117, 29);
		frame.getContentPane().add(btnRegister);
	}
}
