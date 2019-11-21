package rank;
import java.util.*;
public class Absolute_Permutation 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[n];
			int j=1;
			int count =0,c=0;
			ArrayList<Integer> aa=new ArrayList<Integer>();
			ArrayList<Integer> ab=new ArrayList<Integer>();
			for(int i=0;i<n;i++)
			{
				ab.add(j);
				j++;
			}
			for(int i=1;i<=n;i++)
			{
				for(int l=0;l<ab.size();l++)
				{
					if(Math.abs(i-ab.get(l))==k)
					{
						aa.add(ab.get(l));
						ab.remove(ab.get(l));
						count++;
						c=1;
						break;
					}
				}
				//System.out.println(ab+" "+ab.size());
				if(c==0)
				{
					System.out.print("-1");
					break;
				}
				c=0;
			}
			if(count==n)
			{
				for(int i=0;i<aa.size();i++)
				{
					System.out.print(aa.get(i)+" ");
				}
			}
			System.out.println();
		}
	}
}
