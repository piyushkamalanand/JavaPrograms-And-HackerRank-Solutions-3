package rank;
import java.util.*;
public class Sum_Vs_XOR 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		long n=sc.nextLong();
		if(n==0)
		{
			System.out.println("1");
		}
		else{
		long count=0;
		for(long i=0;i<n;i++)
		{
			//System.out.println("Ss"+(n^i));
			if((n^i) == (n+i))
			{
				count++;
			}
		}
		System.out.println(count);
	}}
}
