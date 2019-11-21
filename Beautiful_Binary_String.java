package rank;
import java.util.*;
public class Beautiful_Binary_String 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		StringBuilder ss=new StringBuilder(s);
		String s1="010";
		String s2="";
		int c=0,count=0;
		for(int i=0;i<n-2;i++)
		{
			s2=s2+ss.charAt(i)+ss.charAt(i+1)+ss.charAt(i+2);
			//System.out.println(s2);
			{
				if(s2.equals(s1))
				{
					if(ss.charAt(i+2)=='0')
					{
						ss.setCharAt(i+2,'1');
					}
					else
					{
						ss.setCharAt(i+2,'0');
					}
					count++;
				}
			}
			//System.out.println(ss);
			s2="";
		}
		System.out.println(count);
	}
}
