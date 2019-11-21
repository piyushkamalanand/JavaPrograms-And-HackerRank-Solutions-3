package rank;
import java.util.*;
public class Closest_Numbers 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int tmp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					tmp=a[j];
					a[j]=a[i];
					a[i]=tmp;
				}
			}
		}
		ArrayList<Integer> al=new ArrayList<Integer>();
		int min=a[1]-a[0];
		al.add(min);
		for(int i=1;i<n-1;i++)
		{
			int m=a[i+1]-a[i];
			if(m<min)
			{
				min=m;
			}
			al.add(m);
		}
		System.out.println("MIn"+min);
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			if(min==al.get(i))
			{
				System.out.print(a[i]+" "+a[i+1]+" ");
			}
		}
	}
}
