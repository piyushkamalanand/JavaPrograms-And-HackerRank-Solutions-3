package rank;
import java.util.*;
public class Replace_Every_Element_With_Rightmost_Greatest_Geeks 
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
		for(int i=n-2;i>0;i--)
		{
			a[i]=a[i+1];
		}
		if(a[0]<a[1])
		{
			a[0]=a[1];
		}
		a[n-1]=-1;
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
