package rank;
import java.util.*;
public class WiproStringRotation 
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		//System.out.println(true);
		if(s1.length()!=s2.length())
			System.out.println(false);
		else
		{
			int i=s2.indexOf(s1.charAt(0));
			int j=0;
			while(j<s2.length() && i>=0)//abcd cdab
			{
				if(i==s1.length())
					i=0;
				if(s2.charAt(i)!=s1.charAt(j))
				{
					//System.out.println(false);
					break;
				}
				j++;
				i++;
			}
			if(j==s2.length())
			System.out.println(true);
			else
				System.out.println(false);
		}
	}
}
