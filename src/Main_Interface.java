import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main_Interface extends JFrame implements ActionListener{

	JMenuBar Menu_Bar;
	JMenu Admin, User;
	JMenuItem Admin_Login;
	JMenuItem User_Login, User_Registration;
	
	public Main_Interface() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setSize(700,700);
		 setTitle("Main Interface");
		 setLayout(null);
		 
		 Menu_Bar= new JMenuBar();
		 Admin = new JMenu("Admin");
		 User = new JMenu("User");
		 Admin_Login = new JMenu("Admin_Login");
		 User_Login = new JMenu("User_Login");
		 User_Registration = new JMenu("User_Registration");
		 
		 Menu_Bar.add(Admin); Menu_Bar.add(User);
		 Admin.add(Admin_Login);
		 User.add(User_Login); User.add(User_Registration);
		 add(Menu_Bar);
		 setJMenuBar(Menu_Bar);
		 User_Registration.addActionListener(this);
	}
	public static void main(String[] args) {
		new Main_Interface().setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(User_Registration))
		{
			new New_Register();
		}
	}
}
