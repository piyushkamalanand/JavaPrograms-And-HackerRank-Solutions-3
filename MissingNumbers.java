package rank;
import java.util.*;
public class MissingNumbers 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> aa=new ArrayList<Integer>();
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		
		int b[]=new int[m];
		
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		int c=0;
		int k=0;
		for(int i=0;i<m;i++)
		{
			for(int j=k;j<n;j++)
			{
				if(b[i]==a[j])
				{
					c=1;
					k=j+1;
					break;
				}
			}
			if(c==0)
			{
				aa.add(b[i]);
				//System.out.print(b[i]+" ");
			}
			c=0;
		}
		//System.out.println(aa);
		for(int i=0;i<aa.size()-1;i++)
		{
			if(aa.get(i)==aa.get(i+1))
			{
				continue;
			}
			else
			{
				System.out.print(aa.get(i)+" ");
			}
		}
		System.out.print(aa.get(aa.size()-1));
	}
}
