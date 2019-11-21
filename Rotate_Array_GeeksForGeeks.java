package rank;
import java.util.*;
public class Rotate_Array_GeeksForGeeks 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int d=sc.nextInt();
			String s="";
			for(int i=0;i<d;i++)
			{
				s=s+a[i]+" ";
			}
			for(int i=d;i<n;i++)
			{
				a[i-d]=a[i];
			}
			for(int i=0;i<n-d;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.print(s);
		}
	}
}
