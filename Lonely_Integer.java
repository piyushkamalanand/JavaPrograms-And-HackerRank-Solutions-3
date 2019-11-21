package rank;
import java.util.*;
public class Lonely_Integer 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		if(n==1)
		{
			System.out.println(a[0]);
		}
		else
		{
			Arrays.sort(a);
			for(int i=0;i<n;i+=2)
			{
				if(i==(n-1))
				{
					System.out.println(a[n-1]);
				}
				else if(a[i]!=a[i+1])
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
}
