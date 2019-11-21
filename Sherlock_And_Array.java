package rank;
import java.util.*;
public class Sherlock_And_Array 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int sum1=0;
			int sum2=0,c=0;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<i;j++)
				{
					sum1=sum1+a[j];
				}
				for(int k=i+1;k<n;k++)
				{
					sum2=sum2+a[k];
				}
				if(sum1==sum2)
				{
					System.out.println("YES");
					c=1;
					break;
				}
				sum1=0;
				sum2=0;
			}
			if(c==0)
			{
				System.out.println("NO");
			}
			
		}
		sc.close();
	}
}
