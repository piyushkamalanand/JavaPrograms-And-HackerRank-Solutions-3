package rank;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class StudentDatabase 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Xyz!3456789");
			
			Statement s=c.createStatement();
			
			//s.executeUpdate("create table student1(id int, name varchar(100),department varchar(10))");
			
			char cc='Y';
			PreparedStatement pt1=c.prepareStatement("insert into student1 values(?,?,?)");
			do
			{
				System.out.println("Enter The Id-");
				pt1.setInt(1, Integer.parseInt(br.readLine()));
				System.out.println("Enter The Name-");
				pt1.setString(2, br.readLine());
				System.out.println("Enter The Department-");
				pt1.setString(3, br.readLine());
				System.out.println("Want To Add More? Y?N");
				cc=br.readLine().charAt(0);
			}while(cc=='Y');
			
			pt1.executeUpdate();
			
			ResultSet rs=s.executeQuery("select * from student1 where id=1");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
			c.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
