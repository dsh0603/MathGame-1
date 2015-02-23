import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;


public class WorldMap1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorldMap1 window = new WorldMap1();
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
	public WorldMap1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 675);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
			
			JButton btnLevel_1 = new JButton("Level 1");
			btnLevel_1.setBounds(36, 152, 87, 29);
			frame.getContentPane().add(btnLevel_1);
			btnLevel_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//o SQL inserts here for student, add fails and update what level they're on
					try {
						Level1Test window = new Level1Test();
						window.frame.setVisible(true);
					} catch (Exception j) {
						j.printStackTrace();
					}
					//frame.dispose();				
				}
			});
			
			JButton btnLevel_2 = new JButton("Level 2");
			btnLevel_2.setBounds(281, 100, 87, 29);
			frame.getContentPane().add(btnLevel_2);
			btnLevel_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//Do SQL inserts here for student, add fails and update what level they're on
					try {
						Level2Test window = new Level2Test();
						window.frame.setVisible(true);
					} catch (Exception k) {
						k.printStackTrace();
					}
					//frame.dispose();				
				}
			});
			
			JButton btnLevel_3 = new JButton("Level 3");
			btnLevel_3.setBounds(638, 119, 87, 29);
			frame.getContentPane().add(btnLevel_3);
			btnLevel_3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					try {
						Level3 window = new Level3();
						window.frame.setVisible(true);
					} catch (Exception l) {
						l.printStackTrace();
					}
					
				}
			});
			
			
			JButton btnLevel_4 = new JButton("Level 4");
			btnLevel_4.setBounds(423, 219, 87, 29);
			frame.getContentPane().add(btnLevel_4);
			btnLevel_4.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					try {
						Level4 window = new Level4();
						window.frame.setVisible(true);
					} catch (Exception m) {
						m.printStackTrace();
					}					
				}
			});
			
			JButton btnLevel_5 = new JButton("Level 5");
			btnLevel_5.setBounds(249, 306, 87, 29);
			frame.getContentPane().add(btnLevel_5);
			
			JButton btnLevel_6 = new JButton("Level 6");
			btnLevel_6.setBounds(47, 499, 87, 29);
			frame.getContentPane().add(btnLevel_6);
			
			JButton btnLevel_7 = new JButton("Level 7");
			btnLevel_7.setBounds(517, 412, 87, 29);
			frame.getContentPane().add(btnLevel_7);
			
			JButton btnLogout = new JButton("Logout");
			btnLogout.setBounds(683, 1, 117, 29);
			frame.getContentPane().add(btnLogout);
			btnLogout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent o) {
					frame.dispose();//in future add some actions to feed the database and reinitialize main map.
				}
			});
			
			JLabel lblwelcome = new JLabel("Welcome:");
			lblwelcome.setBounds(6, 6, 117, 16);
			frame.getContentPane().add(lblwelcome);
			
			JLabel lblCurrentUnlockedLevel = new JLabel("Current Unlocked Level:");
			lblCurrentUnlockedLevel.setBounds(212, 6, 214, 16);
			frame.getContentPane().add(lblCurrentUnlockedLevel);
		
			JLabel backgroundLabel = new JLabel("");
			backgroundLabel.setBounds(0, 29, 800, 624);
			backgroundLabel.setIcon(new ImageIcon("images/concept14.jpg"));
			frame.getContentPane().add(backgroundLabel);
			
			JButton btnTutorial = new JButton("Tutorial");
			btnTutorial.setBounds(556, 1, 117, 29);
			frame.getContentPane().add(btnTutorial);
			btnTutorial.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try 
					{
						LeRules2 window = new LeRules2();
						window.frame.setVisible(true);
					} catch (Exception n) {
						n.printStackTrace();
					}
				}
			});
	}
}
