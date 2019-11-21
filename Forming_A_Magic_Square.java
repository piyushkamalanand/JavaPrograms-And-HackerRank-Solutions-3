package rank;
import java.util.*;
public class Forming_A_Magic_Square 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int a[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<3;i++)
		{
			int s=a[i][0]+a[i][1]+a[i][2]+a[0][i]+a[1][i]+a[2][i];
			sum=sum+(Math.abs(30-s));
		}
		System.out.println(sum);
	}
}
