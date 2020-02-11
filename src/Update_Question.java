import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;
public class Update_Question extends JFrame implements ActionListener{

	JLabel Select;
	JLabel subject_choose;
	JLabel sub_id;
	JTextField sub_text_id;
	JComboBox subject_combobox;
	JLabel J_Question;
	JTextField J_text_Question;
	JLabel J_Answers;
	JTextField Answer_textfield1;
	JTextField Answer_textfield2;
	JTextField Answer_textfield3;
	JTextField Answer_textfield4;
	JLabel Correct_answer;
	JTextField Correct_ans_textfield;
	JButton Save;
	public Update_Question() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setSize(900,700);
		 setTitle("Admin_Dashboard");
		 setLayout(null);
		 
		 Select = new JLabel("Update Question");
		 Select.setBounds(300, 20, 250, 50);
		 Select.setFont(new Font("Serif", Font.PLAIN, 34));
		 add(Select);
		 
		 sub_id = new JLabel("id");
		 sub_id.setBounds(20, 90, 100, 30);
		 add(sub_id);
		 
		 sub_text_id = new JTextField();
		 sub_text_id.setBounds(130, 90, 100, 30);
		 add(sub_text_id);
		
		 subject_choose = new JLabel("Subject");
		 subject_choose.setBounds(400, 90, 100, 30);
		 add(subject_choose);
		 
		 subject_combobox = new JComboBox();
		 subject_combobox.setBounds(500, 90, 150, 40);
		 subject_combobox.setFont(new Font("Serif", Font.PLAIN, 20));
		 subject_combobox.addItem("Choose Subject");
		
		 add(subject_combobox);
		 
		 J_Question = new JLabel("Question");
		 J_Question.setBounds(20, 150, 100, 30);
		 add(J_Question);
		 
		 J_text_Question = new JTextField();
		 J_text_Question.setBounds(130, 150, 700, 60);
		 add(J_text_Question);
		 
		 J_Answers = new JLabel("Answers");
		 J_Answers.setBounds(20, 230, 200, 30);
		 add(J_Answers);
		 
		 Answer_textfield1 = new JTextField();
		 Answer_textfield1.setBounds(130, 230, 500, 30);
		 add(Answer_textfield1);
		 
		 Answer_textfield2 = new JTextField();
		 Answer_textfield2.setBounds(130, 280, 500, 30);
		 add(Answer_textfield2);
		 
		 Answer_textfield3 = new JTextField();
		 Answer_textfield3.setBounds(130, 330, 500, 30);
		 add(Answer_textfield3);
		 
		 Answer_textfield4 = new JTextField();
		 Answer_textfield4.setBounds(130, 380, 500, 30);
		 add(Answer_textfield4);
		 
		 Correct_answer = new JLabel("Correct Answer");
		 Correct_answer.setBounds(20, 430, 500, 30);
		 add(Correct_answer);
		 
		 Correct_ans_textfield = new JTextField();
		 Correct_ans_textfield.setBounds(130, 430, 100, 30);
		 add(Correct_ans_textfield);
		 
		 Save = new JButton("Save");
		 Save.setBounds(100, 480, 100, 40);
		 add(Save);
		 
		 setVisible(true);
		 Save.addActionListener(this);	{
		 Connection_Database CD =new Connection_Database();
		 //CD.Save(J_text_Question.getText(),Answer_textfield1.getText(),Answer_textfield2.getText(),Answer_textfield3.getText(), Answer_textfield4.getText(), Correct_ans_textfield.getText());
      }
	}
	 public static void main(String[] args) {
		 	new Update_Question().setVisible(true);
		 
	 }
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource().equals(Save))                                                                                                                                                  
		{
				try {
					Connection_Database CD= new Connection_Database();
					 int sub_id = subject_combobox.getSelectedIndex();
			                int result=CD.update(J_text_Question.getText(),Answer_textfield1.getText(),Answer_textfield2.getText(),Answer_textfield3.getText(), Answer_textfield4.getText(), sub_id, Correct_ans_textfield.getText() ); if(result>0)
			                {
			                    JOptionPane.showMessageDialog(null,"Saved");
			                    
			                }
			                else
			                {
			                    JOptionPane.showMessageDialog(null,"not saved");
			                }
			            } catch (Exception e) {
		            }	
	   }
	}

}
