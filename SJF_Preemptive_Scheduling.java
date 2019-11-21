package rank;
import java.util.*;
public class SJF_Preemptive_Scheduling 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter The Number Of Processes - ");
		int n=sc.nextInt();
		int a[][]=new int[n][2];
		for(int i=0;i<n;i++)
		{
			System.out.println(" Enter The Arrival Time & Burst Time - ");
			a[i][0]=sc.nextInt();
			//System.out.println(" Enter The Burst Time - ");
			a[i][1]=sc.nextInt();
		}
		System.out.println(" PROCESS  A.T\t B.T");
		for(int i=0;i<n;i++)
		{
			System.out.print("   P"+(i+1));
			System.out.println("  \t  "+a[i][0]+"  \t "+a[i][1]);
		}
		Arrays.sort(a, new Comparator <int[]>(){
			public int compare(final int[] e1 ,final int[] e2)
			{
				if(e1[0] > e2[0])
					return 1;
				else
					return -1;
			}
		});
		ArrayList <Integer>l=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			int k=a[i][0]+1;
			a[i][i]=a[i][i]-1;
			for(int j=i+1;j<n;j++)
			{
				if(k==a[j][0])
				{
					l.add(a[j][0]);
				}
			}
		}
	}
}
