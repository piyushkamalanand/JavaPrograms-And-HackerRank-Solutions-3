package rank;
import java.util.*;
public class MaximumNumberBetweenRange 
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
		int l=sc.nextInt();
		int h=sc.nextInt();
		int max=0;
		for(int i=l;i<=h;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
