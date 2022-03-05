import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
				Class.forName("com.mysql.cj.jdbc.Driver");// step 2  class loader 
				
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","kalpesh1532@k");//step 3 create connection
				
				Statement st = con.createStatement();// step 4
			//	String query = "create table student(ID int primary key,SName varchar(20), SMarks int)";//step 6
				String query1 = "insert into student values(5,'zubeir',80)";
				
				//Delete 
				//String query2 = "delete from student where ID = 1";
				
				//Update 
				//String query3 = "update student set SName = 'shubham' where ID = 2";
				ResultSet rs = st.executeQuery("SELECT ID,SName, SMarks FROM student");
				while(rs.next())
			      {
			        System.out.println(rs.getString(1));  //First Column
			        System.out.println(rs.getString(2));  //Second Column
			        System.out.println(rs.getString(3));  //Third Column
			      }

				//st.executeUpdate(query);//steps 7
				st.executeUpdate(query1);
				System.out.println("Student Table created successfully");
				
				
				//System.out.println("Row inserted successfully");
				//System.out.println("Row Updated successfully");
				//System.out.println("Row Delete successfully");
				
			st.close();
			con.close();

	}

}
