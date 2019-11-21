package rank;
import java.util.*;
public class K2UseOfWrapperClass 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			String ss=sc.next();
			StringBuffer s=new StringBuffer(ss);
			if(Character.isUpperCase(s.charAt(0))==true)
			{
				s.setCharAt(0, Character.toLowerCase(s.charAt(0)));
			}
			else
			{
				s.setCharAt(0, Character.toUpperCase(s.charAt(0)));
			}
			if(Character.isUpperCase(s.charAt(1))==true)
			{
				s.setCharAt(1, Character.toLowerCase(s.charAt(1)));
			}
			else
			{
				s.setCharAt(1, Character.toUpperCase(s.charAt(1)));
			}
			if(Character.isUpperCase(s.charAt(s.length()-1))==true)
			{
				s.setCharAt(s.length()-1, Character.toLowerCase(s.charAt(s.length()-1)));
			}
			else
			{
				s.setCharAt(s.length()-1, Character.toUpperCase(s.charAt(s.length()-1)));
			}
			if(Character.isUpperCase(s.charAt(s.length()-2))==true)
			{
				s.setCharAt(s.length()-2, Character.toLowerCase(s.charAt(s.length()-2)));
			}
			else
			{
				s.setCharAt(s.length()-2, Character.toUpperCase(s.charAt(s.length()-2)));
			}
			System.out.println(s+""+(100+i));
		}
	}
}
