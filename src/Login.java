import javax.swing.*;

import java.sql.*;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Login extends JFrame implements ActionListener{
JLabel welcome;
JLabel j_username;
JLabel j_password;
JLabel login;
JLabel account;
JTextField j_text_Username;
JPasswordField j_text_password;
JCheckBox showpasword;
JButton j_b_login;
JButton j_b_register;
JButton admin_login;


 public Login() {
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 setSize(600,700);
	 setTitle("Login");
	 setLayout(null);
//	 getContentPane().setBackground(Color.RED);
	 
	 welcome = new JLabel("Welcome to the MCQ");
	 welcome.setBounds(70, 50, 600, 50);
	 welcome.setFont(new Font("Arial", Font.ITALIC, 50));
	 add(welcome);
	 
	 login = new JLabel("LOGIN");
	 login.setBounds(230, 120,150, 50);
	 login.setFont(new Font("Arial", Font.BOLD, 40));
	 login.setForeground(new Color(17,17,242));
	 add(login);
	 
	 j_username = new JLabel("Username");
	 j_username.setBounds(100,200,150,30);
	 j_username.setFont(new Font("Arial", Font.ITALIC, 30));
	 j_username.setForeground(new Color(255,0,0));
	 add(j_username); 
	 
	 j_text_Username = new JTextField();
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
	 
	 showpasword = new JCheckBox("Show password");
	 showpasword.setBounds(270, 300, 150, 30);
	 showpasword.setFont(new Font("Arial", Font.BOLD, 15));
	 add(showpasword);
	 
	 j_b_login = new JButton("Login");
	 j_b_login.setBounds(210,330,150,40);
	 j_b_login.setFont(new Font("Arial", Font.ITALIC, 30));
	 j_b_login.setForeground(new Color(255,0,0));
	 j_b_login.setBackground(new Color(37,32,32));
	 add(j_b_login);

	 account = new JLabel("If you are new click here");
	 account.setBounds(100, 400, 250, 30);
	 account.setFont(new Font("Arial", Font.ITALIC, 20));
	 account.setForeground(new Color(17,17,242));
	 add(account);
	 	 
	 j_b_register = new JButton("Register");
	 j_b_register.setBounds(320, 400, 90, 30);
	 j_b_register.setBorder(BorderFactory.createEmptyBorder(6, 4, 4, 4));
	 j_b_register.setContentAreaFilled(false);
	 j_b_register.setFont(new Font("Arial", Font.ITALIC, 20));
	 j_b_register.setForeground(new Color(255,0,0));
	 add(j_b_register);
	 
	 admin_login = new JButton("Admin Login");
	 admin_login.setBounds(170, 470, 230, 40);
	 admin_login.setFont(new Font("Arial", Font.ITALIC, 30));
	 admin_login.setForeground(new Color(255,0,0));
	 admin_login.setBackground(new Color(37,32,32));
	 add(admin_login);
	 
	
	 j_b_login.addActionListener(this);
	 j_b_register.addActionListener(this);
	 showpasword.addActionListener(this);
	 admin_login.addActionListener(this);
	 
	 
 }
 public static void main(String[] args) {
 	new Login().setVisible(true);
 	  
 
 }
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getSource().equals(j_b_login))
	{
		Connection_Database CD = new Connection_Database();
		if(j_text_Username.equals("admin") && j_text_password.toString().equals("admin")){
			 new Admin_Dashboard();
			 setVisible(true);
		}
		else {
		try {
			
            Statement st =CD.conn.createStatement();
            String sql="Select * from users where username= '"+j_text_Username.getText()+"'"
                    + " and password='"+j_text_password.getText()+"' ";
            ResultSet rs=st.executeQuery(sql);

            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, "Login Sucess");
                new Subject();
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid Information");
            }
           // CD.conn.close();
          
        } catch (Exception e) {
            System.out.println(e);
        }	
		}
	}
	if(arg0.getSource().equals(j_b_register))
	{
		new New_Register();
	}
	if(showpasword.isSelected()) {
		j_text_password.setEchoChar((char)0);
	}
	else {
		j_text_password.setEchoChar('*');
	}
	
	if(arg0.getSource().equals(admin_login))
	{
		new Admin_login();
	}
	
}
}
