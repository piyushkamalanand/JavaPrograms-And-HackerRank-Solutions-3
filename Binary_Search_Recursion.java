package rank;
import java.util.*;
import java.lang.*;
public class Binary_Search_Recursion 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter The Length Of The Array - ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int l=0,h=n-1,m=(l+h)/2;
		System.out.println(" Enter The Number To Be Searched - ");
		int s=sc.nextInt();
		binary(a,l,h,m,s);
	}
	public static void binary(int a[],int l,int h,int m,int s)
	{
		if(a[m]==s)
			System.out.println(" Search Successfull ");
		else if(l<h)
			System.out.println(" Search Unsuccessfull ");
		else if(a[m]>s)
		{
			h=m-1;
			m=(l+h)/2;
			binary(a,l,h,m,s);
		}
		else
		{
			l=m+1;
			m=(l+h)/2;
			binary(a,l,h,m,s);
		}
	}
}
