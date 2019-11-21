package rank;
import java.util.*;
public class Modified_Kaprekar_Number 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c=0;
		int i=sc.nextInt();
		int f=sc.nextInt();
		for(long j=i;j<=f;j++)
		{
			long s=(long)(j*j);
			//System.out.println("sq"+s);
			String ss=String.valueOf(s);
			int d=String.valueOf(j).length();
			String s1="0";
			for(int k=0;k<ss.length()-d;k++)
			{
				s1=s1+ss.charAt(k);
			}
			String s2="0";
			for(int k=ss.length()-d;k<ss.length();k++)
			{
				s2=s2+ss.charAt(k);
			}
			if(Integer.parseInt(s1)+Integer.parseInt(s2) == j)
			{
				System.out.print(j+" ");
				c=1;
			}
			s1="0";
			s2="0";
		}
		if(c==0)
		{
			System.out.println("INVALID RANGE");
		}
	}
}
//1 9 45 55 99 297 703 999 2223 2728 4950 5050 7272 7777 9999 17344 22222 77778 82656 95121 99999