import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	JComboBox<String> studentBox = new JComboBox<String>();
	JComboBox comboBox_1;
	String teacherName, level[] = new String[7], FName, LName, UserName,PassWord, Level;
	{
	level[0]="Level1";
	level[1]="Level2";
	level[2]="Level3";
	level[3]="Level4";
	level[4]="Level5";
	level[5]="Level6";
	level[6]="Level7";
	}
	Connection connection=sqliteConnection.dbConnector();
	{
	try{		
		String query="select UName from Student where TeacherID=1 order by UName";
		PreparedStatement pst=connection.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		int i=0;
		
		while(rs.next())
		{
			studentBox.addItem(rs.getString("UName"));
		//password[i]=rs.getString("SPW");
		//firstAndLast = firstAndLast + " " + rs.getString("LName");
		//name[i]=firstAndLast;
		//firstAndLast=null;
		//System.out.println(name[i]);
		i++;		
		
		}
		rs.close();
		pst.close();
		
	}catch(Exception e)
	{
		JOptionPane.showMessageDialog(null, e);
	}
	}

	String student;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					//AddStudent window = new AddStudent();
//					//window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 * 
	 */
	
	/**
	 * @wbp.parser.entryPoint
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
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome: " + teacherName);
		lblWelcome.setBounds(247, 0, 226, 15);
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
		
		
		
		
		
		studentBox.setBounds(388, 111, 152, 24);
		frame.getContentPane().add(studentBox);
		studentBox.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        student =  (String) studentBox.getSelectedItem();		        
		    }
		});
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(549, 55, 102, 25);
		frame.getContentPane().add(btnRegister);
		btnRegister.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		      FName=textField.getText();
		      LName=textField_1.getText();
		      UserName=textField_2.getText();
		      PassWord=textField_3.getText();
		      Level=textField_4.getText();
		      
		      try{
					String query1="Insert Into Student values((select max(SID)+1 from Student),'" + FName + "','" + LName + "','" + PassWord + "',"+ Level + ",'" + UserName + "'," + teacherID + ")";
					java.sql.Statement pst3 = null;
					pst3 = connection.createStatement();

					pst3.executeUpdate(query1);
					pst3.close();					
					
					studentBox.addItem(UserName);
					
				}catch(Exception p){
					JOptionPane.showMessageDialog(null,p);
					System.exit(1);
				}
		      
		    }
		});
		
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(549, 111, 102, 25);
		frame.getContentPane().add(btnRemove);
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query1="delete from Student where UName='" + student + "'";
					java.sql.Statement pst3 = null;
					pst3 = connection.createStatement();

					pst3.executeUpdate(query1);
					pst3.close();					
					studentBox.removeItem(student);
					
					
				}catch(Exception p){
					JOptionPane.showMessageDialog(null,p);
					System.exit(1);
				}
			}
		});
		
		comboBox_1 = new JComboBox(level);
		comboBox_1.setBounds(388, 174, 152, 24);
		frame.getContentPane().add(comboBox_1);
		
		
		JButton btnEdit = new JButton("Edit Level");
		btnEdit.setBounds(549, 174, 102, 25);
		frame.getContentPane().add(btnEdit);
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Level = (String) comboBox_1.getSelectedItem();//Closes add student window.
			JOptionPane.showMessageDialog(null,Level);
			}
			
		});
		
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(549, 228, 102, 25);
		frame.getContentPane().add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();//Closes add student window.
			}
		});
	}
}
