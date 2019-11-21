package rank;
import java.util.*;
public class TwoCharacters 
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		StringBuilder ss=new StringBuilder(s);
		int a[]=new int[26];
		int j=0,count=0;
		for(char c='a';c<='z';c++)
		{
			for(int i=0;i<s.length();i++)
			{
				if(c==s.charAt(i))
				{
					count++;
				}
			}
			if(count>0)
			{
				a[j]=count;
				j++;
				count=0;
			}
		}
		int z=ss.length();
		for(int i=0;i<n-1;i++)
		{
			if(ss.charAt(i)==ss.charAt(i+1))
			{
				for(int k=0;k<z;k++)
				{
					if(ss.charAt(i)==ss.charAt(k))
					{
						ss.deleteCharAt(k);
						z=ss.length();
					}
				}
			}
			System.out.println(ss);
		}
		
		
	}
}
