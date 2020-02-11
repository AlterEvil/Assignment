import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
public class Question extends JFrame implements ActionListener{

JLabel questions;
JRadioButton answers1;
JRadioButton answers2;
JRadioButton answers3;
JRadioButton answers4;
JButton next;

 public Question() {
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 setSize(1500,1080);
	 setTitle("Questions");
	 setLayout(null);
	 
	 
	 questions = new JLabel("");
	 questions.setBounds(200, 200, 900, 40);
	 questions.setFont(new Font("Arial", Font.ITALIC, 20));
	 questions.setBackground(Color.red);
	 add(questions);
	 
	 answers1 = new JRadioButton("");
	 answers1.setBounds(300, 300, 500, 40);
	 answers1.setFont(new Font("Arial", Font.ITALIC, 20));
	 add(answers1);
	 
	 answers2 = new JRadioButton("");
	 answers2.setBounds(300, 360, 500, 40);
	 answers2.setFont(new Font("Arial", Font.ITALIC, 20));
	 add(answers2);
	 
	 answers3 = new JRadioButton("");
	 answers3.setBounds(300, 420, 500, 40);
	 answers3.setFont(new Font("Arial", Font.ITALIC, 20));
	 add(answers3);
	 
	 answers4 = new JRadioButton("");
	 answers4.setBounds(300, 480, 500, 40);
	 answers4.setFont(new Font("Arial", Font.ITALIC, 20));
	 add(answers4);
	 
	 ButtonGroup Button_group = new ButtonGroup();
		Button_group.add(answers1);
		Button_group.add(answers2);
		Button_group.add(answers3);
		Button_group.add(answers4);
		
		
		next = new  JButton("Next");
		next.setBounds(600, 550, 150, 30);
		add(next);
		next.addActionListener(this);
		pull_QnA();
		setVisible(true);
 }

 public static void main(String[] args) {
 	new Question().setVisible(true);
 	  
}

 public void pull_QnA() {
	 Connection_Database CD = new Connection_Database();
	 try {
		 
		String url= "Select* from questions Order by rand() LIMIT 1 ";
		 Statement Pre_sta= CD.conn.createStatement();
		 ResultSet Rel_set= Pre_sta.executeQuery(url);
		 while (Rel_set.next()) {
			 questions.setText(Rel_set.getString("question"));
			 answers1.setText(Rel_set.getString("answer1"));
			 answers2.setText(Rel_set.getString("answer2"));
			 answers3.setText(Rel_set.getString("answer3"));
			 answers4.setText(Rel_set.getString("answer4"));
		 }
	 }
		 catch(Exception e) {
//			 e.printStackTrace();
	 }
 }

 
@Override
public void actionPerformed(ActionEvent ae) {
	// TODO Auto-generated method stub
	
	if(ae.getSource().equals(next))
	{
//		int i;
//		for(i=0; i<10; i++)
		{
		new Question();
		pull_QnA();
		this.dispose();
		
	
	
	}
}
}
}
