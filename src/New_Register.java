import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
public class New_Register extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JLabel reg_top;
	
	JLabel first_name;
	JTextField first_name_textfield;
	JLabel Second_name;
	JTextField Second_name_textfield;
	JLabel email;
	JTextField email_textfield;
	
	JLabel username;
	JTextField username_textField;
	
	JLabel password;
	JTextField password_textfield;
	
	JButton token;
	JButton Register;
	
	 public New_Register() {
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setSize(700,600);
		 setTitle("New Register");
		 setLayout(null);	
		 
		 reg_top = new JLabel("New Register");
		 reg_top.setBounds(150, 40, 400, 60);
		 reg_top.setFont(new Font("Arial", Font.BOLD, 50));
//		 reg_top.setForeground(new Color(17,17,242));
		 add(reg_top);
		 
		 first_name = new JLabel("First Name");
		 first_name.setBounds(150, 150, 150, 30);
		 first_name.setFont(new Font("Arial", Font.ITALIC, 20));
		 first_name.setForeground(new Color(17,17,242));
		 add(first_name);
		 
		 first_name_textfield = new JTextField();
		 first_name_textfield.setBounds(300, 150, 150, 30);
		 first_name_textfield.setFont(new Font("Arial", Font.BOLD, 20));
		 first_name.setForeground(new Color(17,17,242));
		 add(first_name_textfield);
		 
		 Second_name = new JLabel("Second Name");
		 Second_name.setBounds(150, 200, 150, 30);
		 Second_name.setFont(new Font("Arial", Font.ITALIC, 20));
		 Second_name.setForeground(new Color(17,17,242));
		 add(Second_name);
		 
		 Second_name_textfield = new JTextField();
		 Second_name_textfield.setBounds(300, 200, 150, 30);
		 Second_name_textfield.setFont(new Font("Arial", Font.BOLD, 20));
		 Second_name_textfield.setForeground(new Color(17,17,242));
		 add(Second_name_textfield);
		 
		 username = new JLabel("Username");
		 username.setBounds(150, 250, 150, 30);
		 username.setFont(new Font("Arial", Font.ITALIC, 20));
		 username.setForeground(new Color(17,17,242));
		 add(username);
		 
		 username_textField = new JTextField();
		 username_textField.setBounds(300, 250, 150, 30);
		 username_textField.setFont(new Font("Arial", Font.BOLD, 20));
		 username_textField.setForeground(new Color(17,17,242));
		 add(username_textField);
		 
		 
		 email = new JLabel("Email");
		 email.setBounds(150, 300, 150, 30);
		 email.setFont(new Font("Arial", Font.ITALIC, 20));
		 email.setForeground(new Color(17,17,242));
		 add(email);
		 
		 email_textfield = new JTextField();
		 email_textfield.setBounds(300, 300, 150, 30);
		 email_textfield.setFont(new Font("Arial", Font.BOLD, 20));
		 email_textfield.setForeground(new Color(17,17,242));
		 add(email_textfield);
		 
		 password = new JLabel("Password");
		 password.setBounds(150, 350, 150, 30);
		 password.setFont(new Font("Arial", Font.ITALIC, 20));
		 password.setForeground(new Color(17,17,242));
		 add(password);
		 
		 password_textfield =new JTextField();
		 password_textfield.setBounds(300, 350, 150, 30);
		 password_textfield.setFont(new Font("Arial", Font.BOLD, 20));
		 password_textfield.setForeground(new Color(17,17,242));
		 add(password_textfield);
	
		 token = new JButton("T");
		 token.setBounds(500, 350, 50, 30);
		 token.setFont(new Font("Arial", Font.BOLD, 20));
		 add(token);
		 
		 Register = new JButton("Register");
		 Register.setBounds(250, 450, 150, 30);
		 Register.setFont(new Font("Arial", Font.BOLD, 20));
		 add(Register);
		 
		 

		 setVisible(true);
		 token.addActionListener(this);
		 Register.addActionListener(this);{
			 Connection_Database CD =new Connection_Database();
			 CD.Register(first_name_textfield.getText(),Second_name_textfield.getText(),email_textfield.getText(),username_textField.getText(), password_textfield.getText());
          }
	 }
	 
	 static char[] createtoken(int length){
         System.out.println("");
         String numbers="01234568789";
         Random r = new Random();
         char[] token=new char[length];
         for(int i=0;i<length;i++){
             token[i]=numbers.charAt(r.nextInt(numbers.length()));
         }
         return token;
     }
     public static void main1(String[] args){
         System.out.println("Creating token........");
         System.out.println(createtoken(6));
         
     }
     public static void main(String[] args) {
    	 	new New_Register().setVisible(true);
    	 	  	 
     }


	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource().equals(Register))
		{
			try {
				Connection_Database CD= new Connection_Database();
		                int result=CD.Register(first_name_textfield.getText(),Second_name_textfield.getText(),email_textfield.getText(),username_textField.getText(), password_textfield.getText());
		                if(result>0)
		                {
		                    JOptionPane.showMessageDialog(null,"Saved");
		                    
		                }
		                else
		                {
		                    JOptionPane.showMessageDialog(null,"not saved");
		                }
		            } catch (Exception e) {
		            }
			this.dispose();
			}
		
		if(ae.getSource().equals(token)) {
			String token = new String(createtoken(4));
			password_textfield.setText(token);
		}
		}
	}
	 

