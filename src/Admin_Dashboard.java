import javax.swing.*;
import java.sql.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Admin_Dashboard extends JFrame implements ActionListener{
	JLabel welcome;
	JButton add_questions;
	JButton update_questions;
	JButton delete_questions;
	JButton show_questions;
	
	
	 public Admin_Dashboard() {
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setSize(600,700);
		 setTitle("Admin");
		 setLayout(null);
		 
		 welcome = new JLabel("Admin");
		 welcome.setBounds(230, 50, 600, 50);
		 welcome.setFont(new Font("Arial", Font.BOLD, 50));
		 add(welcome);
		 
		 add_questions = new JButton("Add Questions");
		 add_questions.setBounds(150, 150,300, 50);
		 add_questions.setFont(new Font("Arial", Font.BOLD, 30));
		 add_questions.setForeground(new Color(255,0,0));
		 add(add_questions);
		 
		 update_questions = new JButton("Update Questions");
		 update_questions.setBounds(150, 210,300, 50);
		 update_questions.setFont(new Font("Arial", Font.BOLD, 30));
		 update_questions.setForeground(new Color(255,0,0));
		 add(update_questions);
		 
		 delete_questions = new JButton("Delete Questions");
		 delete_questions.setBounds(150, 270,300, 50);
		 delete_questions.setFont(new Font("Arial", Font.BOLD, 30));
		 delete_questions.setForeground(new Color(255,0,0));
		 add(delete_questions);
		 
		 show_questions = new JButton("show Questions");
		 show_questions.setBounds(150, 330,300, 50);
		 show_questions.setFont(new Font("Arial", Font.BOLD, 30));
		 show_questions.setForeground(new Color(255,0,0));
		 add(show_questions);
		 
		 setVisible(true);
		 add_questions.addActionListener(this);
		 update_questions.addActionListener(this);
		 delete_questions.addActionListener(this);
		 
	 }
	 
		 public static void main(String[] args) {
			 	new Admin_Dashboard().setVisible(true);
			 	  
			 
			 }
	

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
                                                                                                                                                
		if(ae.getSource().equals(add_questions))
		{
			new Add_question();
		}
		
		if(ae.getSource().equals(update_questions))
		{
			new Update_Question();
		}
		
		if(ae.getSource().equals(delete_questions))
		{
			new Delete_Questions();
		}
		
			
   
	}
}
