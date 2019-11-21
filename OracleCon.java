package rank;
import java.util.*;
import java.sql.*;
public class OracleCon 
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Xyz!3456789");
			
			Statement s=c.createStatement();
		
			//s.executeUpdate("create table emp2(name varchar(20))");
			System.out.println("created");
			PreparedStatement pt1=c.prepareStatement("insert into emp2 values(?)");
			pt1.setString(1, "Vijay");
			int i=pt1.executeUpdate();
			System.out.println(i);
			ResultSet rs=s.executeQuery("select * from emp2");  
			while(rs.next())  
			System.out.println(rs.getString(1));
			
			c.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
