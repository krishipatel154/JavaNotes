import java.sql.*;
import java.util.Scanner;
 
public class JdbcDemo{
	private static final String url = "jdbc:mysql://localhost:3306/njstep";
	private static final String username="root";
	private static final String password="krishi@154";

	public static void main(String[] args){
	try{
		// set drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
	}catch(ClassNotFoundException e){
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	
	try{
		// create connection
		Connection conn = DriverManager.getConnection(url, username, password);
		
// ---------------------------------------------------------------------------------------------------------------------------------------				
		
		// using statement 
		// Statement st = conn.createStatement();
		
		/* for insert data
		String query = String.format("insert into students(name, age, marks) values('%s', %o, %f)","Rahul", 21, 88.00);
		int num = st.executeUpdate(query);
		if(num>0){
			System.out.println("Data inserted successfully");
		}else{
			System.out.println("Data not inserted successfully");
		}
		*/
		
// ---------------------------------------------------------------------------------------------------------------------------------------		
		
		/* for update 
		
		String query = String.format("update students set marks= %f where id=%d", 89.7, 2);
		int updatedRows = st.executeUpdate(query);
		if(updatedRows>0){
			System.out.println("Data updated successfully");
		}else{
			System.out.println("Data not updated successfully");
		}
		*/
		
// ---------------------------------------------------------------------------------------------------------------------------------------				
		
		/* for delete
		String query = String.format("delete from students where id = 2");
		int updatedRows = st.executeUpdate(query);
		if(updatedRows>0){
			System.out.println("Data deleted successfully");
		}else{
			System.out.println("Data not deleted successfully");
		}
		*/
		
// ---------------------------------------------------------------------------------------------------------------------------------------		
		
		/* for select statement
		String select = "select * from students";
		ResultSet rs = st.executeQuery(select);
		while(rs.next()){
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			double marks = rs.getDouble("marks");
			System.out.println("Id:-    "+id);
			System.out.println("Name:-  "+name);
			System.out.println("Age:-   "+age);
			System.out.println("Marks:- "+marks);
		}
		*/
		
// ------------------------------------------------------------------------------------------------------------------------------------------		
		
		// using prepared statement
		
		/* for insert 
		String query = "insert into students(name, age, marks) values(?, ?, ?)";	
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1,"Abha");
		ps.setInt(2,22);
		ps.setDouble(3,78);
		
		int updatedRows = ps.executeUpdate();
		if(updatedRows>0){
			System.out.println("Data inserted successfully");
		}else{
			System.out.println("Data not inserted successfully");
		}
		*/
		
// ---------------------------------------------------------------------------------------------------------------------------------------						
		
		/* for select 
		String query = "select marks from students where id=?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1,1);
		ResultSet rs = ps.executeQuery(query);
		if(rs.next()){
			double marks = rs.getDouble("marks");
			System.out.println("Marks:- "+marks);			
		}else{
			System.out.println("Marks not found");
		}
		*/
		
// ---------------------------------------------------------------------------------------------------------------------------------------						
		
		/* for update 
		String query = "update students set marks=? where id=?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setDouble(1, 66.7);
		ps.setInt(2,3);
				
		int updatedRows = ps.executeUpdate();
		if(updatedRows>0){
			System.out.println("Data updated successfully");
		}else{
			System.out.println("Data not updated successfully");
		}
		*/
		
// ---------------------------------------------------------------------------------------------------------------------------------------						
		
		/* for delete 
		String query = "delete from students where id = ?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, 3);
		int affectedRows = ps.executeUpdate();
		if(affectedRows>0){
			System.out.println("Data deleted successfully");
		}else{
			System.out.println("Data not deleted successfully");
		}
		*/
		
// ---------------------------------------------------------------------------------------------------------------------------------------				

	Scanner sc = new Scanner(System.in);
		Statement st = conn.createStatement();	
	while(true){
		System.out.println("Enter name");
		String name = sc.next();
		
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter marks: ");
		double marks = sc.nextDouble();
		
		System.out.println("Enter more data(y/n): ");
		String choice = sc.next();
		
		String query = String.format("insert into students(name, age, marks) values('%s', %d, %f)", name, age, marks);				
		

		st.addBatch(query);
		if(choice.toUpperCase().equals("N")){
			break;
		}

	}
	
	int[] arr = st.executeBatch();
	for(int i=0; i<arr.length;i++){
		if(arr[i]==0){
			System.out.println("Query"+i+"not executed sucessfully!!");
		}
	}
		/*if(affectedRows>0){
			System.out.println("Data deleted successfully");
		}else{
			System.out.println("Data not deleted successfully");
		}*/
		
	}catch(SQLException e){
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	}
}

/* for linux
 export CLASSPATH=$CLASSPATH:/home/njuser/Desktop/Krishi/mysql-connector-j-9.0.0.jar
*/

/* for windows
 C:\Users\Dell\Desktop\STEP\Java\JDBC>javac -cp .;C:/Users/Dell/Desktop/STEP/Java/JDBC/mysql-connector-j-9.0.0/mysql-connector-j-9.0.0.jar JdbcDemo.java

 C:\Users\Dell\Desktop\STEP\Java\JDBC>java -cp .;C:/Users/Dell/Desktop/STEP/Java/JDBC/mysql-connector-j-9.0.0/mysql-connector-j-9.0.0.jar JdbcDemo
*/