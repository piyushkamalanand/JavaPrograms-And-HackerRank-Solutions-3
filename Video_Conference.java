package rank;
import java.util.*;
public class Video_Conference 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		String ss[]=new String[n];
		ss[0]=s[0].charAt(0)+" ";
		String ns="";
		System.out.println(s[0].charAt(0));
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<s[i].length();j++)
			{
				if(s[i].charAt(j)!=s[i-1].charAt(j))
				{
					ns=ns+s[i].charAt(j);
					break;
				}
				else
				{
					ns=ns+s[i].charAt(j);
				}
			}
			System.out.println(ns);
			ns="";
		}
	}
}
