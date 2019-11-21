package rank;
import java.util.*;
public class CognizantEvenOdd 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i+=2) 
		{
			if((i+1)%2==0)
				System.out.print((i+1)+" ");
			System.out.print(i+" ");
		}
		sc.close();
	}
}
