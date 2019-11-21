package rank;
import java.util.*;
public class TheLoveLetterMystery 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0)
		{
			int n,count=0;;
			String s=sc.next();
			if(s.length()%2==0)
			{
				n=s.length()/2;
			}
			else
			{
				n=(s.length()/2)+1;
			}
			for(int i=s.length()-1;i>=n;i--)
			{
				if(s.charAt(i)!=s.charAt(s.length()-1-i))
				{
					//int c1=(int)(s.charAt(i))-(int)(s.charAt(s.length()-1-i));
					int c=(int)(Math.abs((int)(s.charAt(i))-(int)(s.charAt(s.length()-1-i))));
					//System.out.println("ccc"+c+" "+c1);
					count=count+c;
				}
			}
			System.out.println(count);
		}
	}
}
