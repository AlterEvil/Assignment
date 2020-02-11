import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Admin_login extends JFrame implements ActionListener{
	JLabel welcome;
	JLabel j_username;
	JLabel j_password;
	JLabel login;
	JTextField j_text_Username;
	JPasswordField j_text_password;
	JButton j_b_login;
	
	public Admin_login() {
		
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setSize(600,700);
		 setTitle("Admin Login");
		 setLayout(null);
		 
		 welcome = new JLabel("Admin Login");
		 welcome.setBounds(70, 50, 600, 40);
		 welcome.setFont(new Font("Arial", Font.ITALIC, 50));
		 add(welcome);
		 
		 j_username = new JLabel("Username");
		 j_username.setBounds(100,200,150,30);
		 j_username.setFont(new Font("Arial", Font.ITALIC, 30));
		 j_username.setForeground(new Color(255,0,0));
		 add(j_username); 
		 
		 j_text_Username = new JTextField("");
		 j_text_Username.setBounds(270,200,200,30);	
		 j_text_Username.setFont(new Font("Arial", Font.BOLD, 20));
		 j_text_Username.setForeground(new Color(17,17,17));
		 add(j_text_Username);
		 
		 j_password = new JLabel("Password");	
		 j_password.setBounds(100,260,150,30);
		 j_password.setFont(new Font("Arial", Font.ITALIC, 30));
		 j_password.setForeground(new Color(255,0,0));
		add(j_password);
	 
		 j_text_password = new JPasswordField();
		 j_text_password.setBounds(270,260,200,30);
		 j_text_password.setFont(new Font("Arial", Font.BOLD, 20));
		 j_text_password.setForeground(new Color(17,17,17));
		 add(j_text_password);
		 
		 j_b_login = new JButton("Login");
		 j_b_login.setBounds(210,330,150,40);
		 j_b_login.setFont(new Font("Arial", Font.ITALIC, 30));
		 j_b_login.setForeground(new Color(255,0,0));
		 j_b_login.setBackground(new Color(37,32,32));
		 add(j_b_login);
		 
		 j_b_login.addActionListener(this);
		 setVisible(true);
		 
	}
	public static void main(String[] args) {
	 	new Admin_login().setVisible(true);
	 	  
	 
	 }
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		if(ae.getSource().equals(j_b_login)) {
			String username;
			String password;
			
			username = j_text_Username.getText();
			password = j_text_password.getText();
			if(username.contentEquals("admin") && password.equals("admin")) {
//				new Admin_Dashboard();
				Admin_Dashboard AD =new Admin_Dashboard();
				AD.setVisible(true);
			}
			else {
				JOptionPane.showMessageDialog(this, "Invalid Username or Password");
			}
		}
		
	}
}
