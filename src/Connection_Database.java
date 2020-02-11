import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class Connection_Database {

  Connection conn;
  PreparedStatement Pre_sta;
  ResultSet Rel_set;
  
  public Connection_Database() {
	  try {
		  Class.forName("com.mysql.jdbc.Driver");
		  conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq_database","root","");
	  }
	  catch(Exception e){
		  System.out.print("error: "+e);
		  
	  }
	  }
  public int Register(String first_name,String last_name, String email, String username, String password)
  {
      int result=0;
      try {
    	  Pre_sta=conn.prepareStatement("insert into users values(null, ?,?,?,?,?)");
    	  Pre_sta.setString(1,first_name);
    	  Pre_sta.setString(2,last_name);
    	  Pre_sta.setString(3,email);
    	  Pre_sta.setString(4,username);
    	  Pre_sta.setString(5,password);
    	  
          result=Pre_sta.executeUpdate();
      } catch (Exception e) {
          System.out.println("Error: "+e);
      }
         
          return result;
      
  }
  
  public int Save(String Question,String Answer1,String Answer2, String Answer3, String Answer4, int subject_id, String Right_Answer) 
  {
	  int result=0;
	  try {
		  Pre_sta=conn.prepareStatement("insert into questions values(null, ?,?,?,?,?,?,?)");
    	  Pre_sta.setString(1,Question);
    	  Pre_sta.setString(2,Answer1);
    	  Pre_sta.setString(3,Answer2);
    	  Pre_sta.setString(4,Answer3);
    	  Pre_sta.setString(5,Answer4);
    	  Pre_sta.setLong(6,subject_id);
    	  Pre_sta.setString(7,Right_Answer);
    	  
    	  result=Pre_sta.executeUpdate();
		  
	  }
	  catch (Exception e) {
          System.out.println("Error: "+e);
      }
	  return result;
  
  }
  public int update (String Question,String Answer1,String Answer2, String Answer3, String Answer4, int subject_id, String Right_Answer) 
  {
	  int result=0;
	  try {
		  Pre_sta=conn.prepareStatement("update into questions values(null, ?,?,?,?,?,?,?)");
    	  Pre_sta.setString(1,Question);
    	  Pre_sta.setString(2,Answer1);
    	  Pre_sta.setString(3,Answer2);
    	  Pre_sta.setString(4,Answer3);
    	  Pre_sta.setString(5,Answer4);
    	  Pre_sta.setLong(6,subject_id);
    	  Pre_sta.setString(7,Right_Answer);
    	  
    	  result=Pre_sta.executeUpdate();
		  
	  }
	  catch (Exception e) {
          System.out.println("Error: "+e);
      }
	  return result;
  
  }
  }

