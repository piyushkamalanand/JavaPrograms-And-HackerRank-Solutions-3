package rank;
import java.util.*;
public class Jim_and_the_Orders 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][2];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		if(n==1)
		{
			System.out.println("1");
		}else{
		int b[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			int sum=0;
			sum=a[i][0]+a[i][1];
			b[i][0]=(i+1);
			b[i][1]=sum;
		}
		Arrays.sort(b, new Comparator <int []>(){
			public int compare(final int[] entry1,final int[] entry2)
			{
				if(entry1[1]>entry2[1] || entry1[1]==entry2[1])
				{
					return 1;
				}
				else
				{
					return -1;
				}
			}
		});
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i][0]+" ");
			//System.out.println();
		}}
	}
}
