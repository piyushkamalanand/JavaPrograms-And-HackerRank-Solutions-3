package rank;
import java.util.*;
public class ReverseAString 
{
	static Scanner sc=new Scanner(System.in);
	static String s=sc.next();
	static int i=s.length()-1;
	public static void main(String args[])
	{
		ReverseAString.reverse(s);
	}
	public static void reverse(String s)
	{
		if(s.length()>0)
		{
			System.out.print(s.charAt(i));
			i--;
			if(s.length()>0)
			reverse(s);
		}
	}
}
