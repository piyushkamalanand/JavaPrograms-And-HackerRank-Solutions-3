package rank;
import java.util.*;
public class Marks_and_Toys 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int s=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int sum=0,c=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
			c++;
			if(sum>s)
			{
				break;
			}
		}
		System.out.println(c-1);
	}
}
