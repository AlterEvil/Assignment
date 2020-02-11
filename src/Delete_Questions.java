import javax.swing.*;

import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Delete_Questions extends JFrame{

	JLabel sub_id;
	JTextField sub_text_id;
	JButton delete;
	
	public Delete_Questions() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setSize(900,700);
		 setTitle("Delete_Question");
		 setLayout(null);
		 
		 sub_id = new JLabel("id");
		 sub_id.setBounds(100, 90, 100, 30);
		 add(sub_id);
		 
		 sub_text_id = new JTextField();
		 sub_text_id.setBounds(170, 90, 100, 30);
		 add(sub_text_id);
		 
		 delete = new JButton("Delete");
		 delete.setBounds(100, 150, 150, 30);
		 add(delete);
		 setVisible(true);
		 
	}
	 public static void main(String[] args) {
		 	new Delete_Questions().setVisible(true);
		 	  
		 
		 }
}
