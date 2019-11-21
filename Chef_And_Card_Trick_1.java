package rank;
import java.util.*;
public class Chef_And_Card_Trick_1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				//System.out.println(a[i]);
			}
			int min=a[0];
			int k=0;
			for(int i=1;i<n;i++)
			{
				if(a[i]<min)
				{
					min=a[i];
					k=i;
				}
			}
			int c=0;
			for(int i=k;i<n-1;i++)
			{
				if(a[i]>a[(i+1)])
				{
					System.out.println("NO");
					c=1;
					break;
				}
			}
			if(c==0)
			{
				for(int i=0;i<k-1;i++)
				{
					if(a[i]>a[(i+1)])
					{
						System.out.println("NO");
						c=1;
						break;
					}
				}
			}
			if(c==0)
			{
				System.out.println("YES");
			}
		}
	}
}
