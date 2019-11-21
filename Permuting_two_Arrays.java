package rank;
import java.util.*;
public class Permuting_two_Arrays 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				b[i]=sc.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			int c=0;
			for(int i=n-1;i>=0;i--)
			{
				if((b[i]+a[(n-1)-i])>=k)
				{
					c++;
				}
			}
			if(c==n)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}
