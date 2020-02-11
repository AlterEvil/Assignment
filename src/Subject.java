import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Subject extends JFrame implements ActionListener{
	JLabel Subject;
	JLabel Sub_level;
	JComboBox Sub_combobox;
	JButton Sub_button;
	private JComboBox subject_combobox;
	
	public Subject() {
		
		setTitle("Sublect list");
		setSize(500,500);
		setLayout(null);
		
		Subject = new JLabel("Select the subject");
		Subject.setBounds(50, 20, 350, 60);
		Subject.setFont(new Font("Serif", Font.PLAIN, 50));
		add(Subject);
		
		Sub_level = new JLabel("Subject");
		Sub_level.setBounds(50,100,150,40);
		Sub_level.setFont(new Font("Serif", Font.PLAIN, 34));
		add(Sub_level);
		
		Sub_combobox = new JComboBox();
		Sub_combobox.setBounds(180, 100, 100, 40);
		Sub_combobox.setFont(new Font("Serif", Font.PLAIN, 34));
		Sub_combobox.addItem("Java");
		Sub_combobox.addItem("HTML");
		Sub_combobox.addItem("Ethics");
		Sub_combobox.addItem("Science");
		add(Sub_combobox);
		
		Sub_button = new JButton("Select");
		Sub_button.setBounds(150, 180, 100, 30);
		add(Sub_button);
		
		setVisible(true);
		Sub_button.addActionListener(this);
		}
	public static void main(String[] args) {
	 	new Subject().setVisible(true);
	 
	 }
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource().equals(Sub_button))
		{
			Connection_Database CD= new Connection_Database();
			
				
			}
		}
	}
	


