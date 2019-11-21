package rank;
import java.util.*;
public class MaxArea 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			b[i]=a[i];
		}
		Arrays.sort(a);
		int min=a[0]*n*10,min1=0;
		int m=a[0],count=0;
		for(int i=0;i<n;i++)
		{
			if(b[i]>=m)
			{
				count++;
			}
			else
			{
				if(b[i]==a[0])
					continue;
				else
				{
					m=b[i];
					min1=count*b[i-1]*10;
					if(min1>min)
					{
						min=min1;
					}
				}
			}
		}
		System.out.println(min);
	}
}
