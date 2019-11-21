package rank;
import java.util.*;
public class PalindromeIndex 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0)
		{
			String s=sc.next();
			StringBuilder ss=new StringBuilder(s);
			ss.reverse();
			int c=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)!=ss.charAt(i))
				{
					System.out.println(i);
					c=1;
					break;
				}
			}
			if(c==0)
			{
				System.out.println("-1");
			}
		}
	}
}
