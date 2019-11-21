package rank;
import java.util.*;
public class Maximizing_XOR 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int m=sc.nextInt();
		int max=0;
		for(int i=l;i<=m;i++)
		{
			for(int j=i;j<=m;j++)
			{
				if((i^j)>max)
				{
					max=(i^j);
				}
			}
		}
		System.out.println(max);
	}
}
