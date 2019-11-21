package rank;
import java.util.*;
public class Aptitude 
{
	public static void main(String args[])
	{
		Aptitude a=new Aptitude();
		a.numbers(1);
		Scanner sc=new Scanner (System.in);
		String s="";
		long sum=1;
		for(int i=1;i<=47;i++)
		{
			sum=i*i*i;
			s=s+sum;
			sum=1;
		}
		System.out.println(s);
		System.out.println(s.charAt(199));
	}
	int k=1;
	void numbers(int n)
	{
		if(n<=1000)
		{
			System.out.println(n+" "+(n+1)+" "+k+" ");
			k++;
			numbers(n+2);
		}
	}
}
