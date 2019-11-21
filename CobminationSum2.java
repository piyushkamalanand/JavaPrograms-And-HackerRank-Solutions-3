package rank;
import java.util.*;
public class CobminationSum2 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		//HashMap<Integer,Integer> h=new HashMap();
		HashSet<Integer> hs=new HashSet();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			//h.put(i,a[i]);
			//hs.add(a[i]);
		}
		int k=sc.nextInt();
//		for(int i=0;i<n;i++)
//		{
//			if(hs.contains(k-a[i]))
//			{
//				System.out.println(a[i]+" "+(k-a[i]));
//			}
//			hs.add(a[i]);
//		}
		
		
		
	}
	public void check(int k,int n,HashSet<Integer> hs,int a[])
	{
		for(int i=0;i<n;i++)
		{
			if(hs.contains(k-a[i]))
			{
				System.out.println(a[i]+" "+(k-a[i]));
			}
			hs.add(a[i]);
		}
	}
}
