package rank;
import java.util.*;
public class String_Construction 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0)
		{
			String s=sc.next();
			StringBuilder ss=new StringBuilder(s);
			int count=0,cc=0;
			int sum=0;
			for(char c='a';c<='z';c++)
			{
				for(int i=0;i<s.length();i++)
				{
					if(c==s.charAt(i))
					{
						count++;
					}
				}
				if(count>1)
				{
					cc++;
					sum=sum+count;
					//break;
				}
				count=0;
			}
			int r=s.length()-sum;
			System.out.println(cc+r);
		}
	}
}
