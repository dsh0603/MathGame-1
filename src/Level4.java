import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;


public class Level4 {

	private JFrame frame;
	
	JLabel pile1 = new JLabel("");
	JLabel pile2 = new JLabel("");
	JLabel pile3 = new JLabel("");
	JLabel pile4 = new JLabel("");
	JLabel pile5 = new JLabel("");
	JLabel pile6 = new JLabel("");
	
	JLabel totalLabel = new JLabel("");
	
	private int total = 0;
	private int givenTotal = 0;
	private int answer = 0;
	private int fails = 0;
	
	private String equation = "";
	
	private int pile1Val = 0;
	private int pile2Val = 0;
	private int pile3Val = 0;
	private int pile4Val = 0;
	private int pile5Val = 0;
	private int pile6Val = 0;
	
	private boolean btn1Check = false;
	private boolean btn2Check = false;
	private boolean btn3Check = false;
	private boolean btn4Check = false;
	private boolean btn5Check = false;
	private boolean btn6Check = false;
	
	JPanel levelComPanel = new JPanel();
	JPanel panel_1 = new JPanel();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Level4 window = new Level4();
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
	public Level4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 641, 499);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		panel_1.setVisible(false);
		levelComPanel.setVisible(false);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Level Complete", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(188, 66, 271, 205);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		levelComPanel.setBounds(6, 18, 130, 181);
		panel_1.add(levelComPanel);
		levelComPanel.setVisible(false);
		
		JTextArea txtrCongradulationsYouCompleted = new JTextArea();
		txtrCongradulationsYouCompleted.setEditable(false);
		txtrCongradulationsYouCompleted.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		txtrCongradulationsYouCompleted.setTabSize(10);
		txtrCongradulationsYouCompleted.setWrapStyleWord(true);
		txtrCongradulationsYouCompleted.setLineWrap(true);
		txtrCongradulationsYouCompleted.setText("Well done! You completed the level, click continue to move on with your adventure.");
		levelComPanel.add(txtrCongradulationsYouCompleted);
		
		JButton btnContinue = new JButton("continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Do SQL inserts here for student, add fails and update what level they're on
				frame.dispose();				
			}
		});
		btnContinue.setBounds(148, 170, 117, 29);
		panel_1.add(btnContinue);
		
		JLabel starLabel = new JLabel("");
		starLabel.setIcon(new ImageIcon("images/star-icon.png"));
		starLabel.setBounds(137, 18, 128, 152);
		panel_1.add(starLabel);
		
		JLabel gkLabel = new JLabel("");
		gkLabel.setIcon(new ImageIcon("images/Pirate-icon.png"));
		gkLabel.setBounds(42, 150, 117, 135);
		frame.getContentPane().add(gkLabel);
		
		
		pile1.setIcon(new ImageIcon("images/cannonballs.png"));
		pile1.setBounds(229, 229, 30, 36);
		frame.getContentPane().add(pile1);
		
		
		pile2.setIcon(new ImageIcon("images/cannonball.png"));
		pile2.setBounds(387, 312, 37, 36);
		frame.getContentPane().add(pile2);
		
		
		pile3.setIcon(new ImageIcon("images/cannonballs.png"));
		pile3.setBounds(371, 250, 30, 35);
		frame.getContentPane().add(pile3);
		
		
		pile4.setIcon(new ImageIcon("images/cannonball.png"));
		pile4.setBounds(491, 341, 30, 36);
		frame.getContentPane().add(pile4);
		
		
		pile5.setIcon(new ImageIcon("images/cannonball.png"));
		pile5.setBounds(530, 324, 30, 36);
		frame.getContentPane().add(pile5);
		
		
		pile6.setIcon(new ImageIcon("images/cannonballs.png"));
		pile6.setBounds(375, 386, 37, 36);
		frame.getContentPane().add(pile6);
		
		JButton gkButton = new JButton("submit");
		gkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(total == answer){
					System.out.println("success");
					equation = equation + " = " + total;
					totalLabel.setText(equation);
					panel_1.setVisible(true);
					levelComPanel.setVisible(true);
				}
				else{
					System.out.println("fail");
					total = 0;
					equation = "" + givenTotal;
					totalLabel.setText(equation);
					
					pile1.setVisible(true);
					pile2.setVisible(true);
					pile3.setVisible(true);
					pile4.setVisible(true);
					pile5.setVisible(true);
					pile6.setVisible(true);
					
					btn1Check = false;
					btn2Check = false;
					btn3Check = false;
					btn4Check = false;
					btn5Check = false;
					btn6Check = false;
					
					fails += 1;
				}
			}
		});
		gkButton.setBounds(42, 281, 117, 29);
		frame.getContentPane().add(gkButton);
		
		JButton pile1Button = new JButton("take");
		pile1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn1Check == false){
					equation = equation + " - " + pile1Val;
					totalLabel.setText(equation);
					total = total - pile1Val;
					pile1.setVisible(false);
					btn1Check = true;
				}
			}
		});
		pile1Button.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		pile1Button.setBounds(225, 266, 45, 19);
		frame.getContentPane().add(pile1Button);
		
		JButton pile2Button = new JButton("take");
		pile2Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn2Check == false){
					equation = equation + " - " + pile2Val;
					totalLabel.setText(equation);
					total = total - pile1Val;
					pile2.setVisible(false);
					btn2Check = true;
				}
			}
		});
		pile2Button.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		pile2Button.setBounds(379, 341, 45, 19);
		frame.getContentPane().add(pile2Button);
		
		JButton pile3Button = new JButton("take");
		pile3Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn3Check == false){
					equation = equation + " - " + pile3Val;
					totalLabel.setText(equation);
					total = total - pile3Val;
					pile3.setVisible(false);
					btn3Check = true;
				}
			}
		});
		pile3Button.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		pile3Button.setBounds(367, 281, 45, 19);
		frame.getContentPane().add(pile3Button);
		
		JButton pile4Button = new JButton("take");
		pile4Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn4Check == false){
					equation = equation + " - " + pile4Val;
					totalLabel.setText(equation);
					total = total - pile4Val;
					pile4.setVisible(false);
					btn4Check = true;
				}
			}
		});
		pile4Button.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		pile4Button.setBounds(488, 372, 45, 19);
		frame.getContentPane().add(pile4Button);
		
		JButton pile5Button = new JButton("take");
		pile5Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn5Check == false){
					equation = equation + " - " + pile5Val;
					totalLabel.setText(equation);
					total = total - pile5Val;
					pile5.setVisible(false);
					btn5Check = true;
				}
			}
		});
		pile5Button.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		pile5Button.setBounds(533, 352, 45, 19);
		frame.getContentPane().add(pile5Button);
		
		JButton pile6Button = new JButton("take");
		pile6Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn6Check == false){
					equation = equation + " - " + pile6Val;
					totalLabel.setText(equation);
					total = total - pile6Val;
					pile6.setVisible(false);
					btn6Check = true;
				}
			}
		});
		pile6Button.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		pile6Button.setBounds(371, 420, 45, 19);
		frame.getContentPane().add(pile6Button);
		
		JTextArea gkTextArea = new JTextArea();
		gkTextArea.setEditable(false);
		gkTextArea.setBounds(6, 54, 127, 124);
		frame.getContentPane().add(gkTextArea);
		gkTextArea.setText("We need to move " + answer + " of these " + givenTotal + " cannonballs to the submersible to get you to the bottom of the ocean");
		gkTextArea.setWrapStyleWord(true);
		gkTextArea.setLineWrap(true);
		
		JLabel pile1Lab = new JLabel("-" + pile1Val);
		pile1Lab.setForeground(Color.WHITE);
		pile1Lab.setBackground(Color.WHITE);
		pile1Lab.setHorizontalAlignment(SwingConstants.CENTER);
		pile1Lab.setBounds(225, 216, 45, 19);
		frame.getContentPane().add(pile1Lab);
		
		JLabel pile2Lab = new JLabel("-" + pile2Val);
		pile2Lab.setHorizontalAlignment(SwingConstants.CENTER);
		pile2Lab.setForeground(Color.WHITE);
		pile2Lab.setBackground(Color.WHITE);
		pile2Lab.setBounds(381, 297, 45, 19);
		frame.getContentPane().add(pile2Lab);
		
		JLabel pile3Lab = new JLabel("-" + pile3Val);
		pile3Lab.setHorizontalAlignment(SwingConstants.CENTER);
		pile3Lab.setForeground(Color.WHITE);
		pile3Lab.setBackground(Color.WHITE);
		pile3Lab.setBounds(367, 229, 45, 19);
		frame.getContentPane().add(pile3Lab);
		
		JLabel pile4Lab = new JLabel("-" + pile4Val);
		pile4Lab.setHorizontalAlignment(SwingConstants.CENTER);
		pile4Lab.setForeground(Color.WHITE);
		pile4Lab.setBackground(Color.WHITE);
		pile4Lab.setBounds(488, 329, 45, 19);
		frame.getContentPane().add(pile4Lab);
		
		JLabel pile5Lab = new JLabel("-" + pile5Val);
		pile5Lab.setHorizontalAlignment(SwingConstants.CENTER);
		pile5Lab.setForeground(Color.WHITE);
		pile5Lab.setBackground(Color.WHITE);
		pile5Lab.setBounds(530, 312, 45, 19);
		frame.getContentPane().add(pile5Lab);
		
		JLabel pile6Lab = new JLabel("-" + pile6Val);
		pile6Lab.setHorizontalAlignment(SwingConstants.CENTER);
		pile6Lab.setForeground(Color.WHITE);
		pile6Lab.setBackground(Color.WHITE);
		pile6Lab.setBounds(371, 371, 45, 19);
		frame.getContentPane().add(pile6Lab);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "total", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(205, 6, 342, 50);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		equation = "" + givenTotal;
		totalLabel.setText(equation);
		totalLabel.setBounds(6, 18, 330, 24);
		panel.add(totalLabel);
		
		JButton btnReset = new JButton("reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("fail");
				total = 0;
				equation = "" + givenTotal;
				totalLabel.setText(equation);
				
				pile1.setVisible(true);
				pile2.setVisible(true);
				pile3.setVisible(true);
				pile4.setVisible(true);
				pile5.setVisible(true);
				pile6.setVisible(true);
				
				btn1Check = false;
				btn2Check = false;
				btn3Check = false;
				btn4Check = false;
				btn5Check = false;
				btn6Check = false;
				
				panel_1.setVisible(false);
				levelComPanel.setVisible(false);
				
				fails += 1;
			}
		});
		btnReset.setBounds(544, 6, 103, 29);
		frame.getContentPane().add(btnReset);
		
		JButton btnBackToMap = new JButton("back to map");
		btnBackToMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnBackToMap.setBounds(544, 31, 103, 29);
		frame.getContentPane().add(btnBackToMap);
		
		
		JLabel bgLabel = new JLabel("");
		bgLabel.setIcon(new ImageIcon("images/pirateshipbg.jpg"));
		bgLabel.setBounds(0, 0, 700, 500);
		frame.getContentPane().add(bgLabel);
		
		
	}
}
