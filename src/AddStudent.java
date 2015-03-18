import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;


public class AddStudent {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	int teacherID;
	String teacherName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//AddStudent window = new AddStudent();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddStudent(int id, String name) {
		teacherID=id;
		teacherName=name;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 680, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome:");
		lblWelcome.setBounds(276, 0, 70, 15);
		frame.getContentPane().add(lblWelcome);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(12, 31, 81, 15);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name: ");
		lblLastName.setBounds(136, 31, 84, 15);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblNewLabel = new JLabel("User Name:");
		lblNewLabel.setBounds(263, 31, 82, 15);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(12, 58, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 58, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(262, 58, 114, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(388, 58, 81, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(392, 31, 75, 15);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblLevel = new JLabel("Level:");
		lblLevel.setBounds(493, 31, 70, 15);
		frame.getContentPane().add(lblLevel);
		
		textField_4 = new JTextField();
		textField_4.setBounds(481, 58, 59, 19);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(549, 55, 102, 25);
		frame.getContentPane().add(btnRegister);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(388, 111, 152, 24);
		frame.getContentPane().add(comboBox);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(549, 111, 102, 25);
		frame.getContentPane().add(btnRemove);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(388, 174, 152, 24);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnNewButton = new JButton("Edit Level");
		btnNewButton.setBounds(549, 174, 102, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
