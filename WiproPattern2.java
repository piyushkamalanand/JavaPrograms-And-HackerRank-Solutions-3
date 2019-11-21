package rank;
import java.util.*;
public class WiproPattern2 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(i);
			if(i<n)
				System.out.print("*");
		}	
		System.out.println();
		for(int i=2;i<=n;i++)
		{
			int k=1,j=1;
			if(i==n)
				k=n+1;
			else
				k=n*i+1;
			while(j<=n)
			{
				System.out.print(k);
				if(j<n)
					System.out.print("*");
				k++;
				j++;
			}
			System.out.println();
		}
	}
}
