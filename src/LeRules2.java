import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextPane;


public class LeRules2 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					LeRules2 window = new LeRules2();
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
	public LeRules2() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnOk = new JButton("ok");
		btnOk.setBounds(262, 427, 89, 23);
		frame.getContentPane().add(btnOk);
		btnOk.addActionListener(new okbuttonhandler());
		
		JTextPane txtpnLeRulesPage = new JTextPane();
		txtpnLeRulesPage.setText("le rules page: \r\none-there are 3 types of npcs, one that gives you objects, one that takes objects, and one that is the gatekeeper that you have to fulfill the requirements of before you can pass to the next level\r\ntwo-to get back to the world map, you can use the button at the bottom right of the screen to go back if the level you are playing is too hard\r\nthree-there is a reset button if you accidentally took too many, or gave away too many items. it is also located in the bottom right hand corner above the \"go back\" button ");
		txtpnLeRulesPage.setBounds(10, 11, 604, 405);
		frame.getContentPane().add(txtpnLeRulesPage);
		
	}
	
	public class okbuttonhandler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			//Level1Test nextscreen = new Level1Test();
			//nextscreen.initialize();
			//System.exit(0);
			frame.dispose();
		}
		
	}
}
