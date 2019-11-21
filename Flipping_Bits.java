package rank;
import java.util.*;
public class Flipping_Bits 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-- >0)
		{
			long a=sc.nextLong();
			String s=Integer.toBinaryString((int)a);
			//String s3=Integer.toHexString((int)a);
			//System.out.println("s3"+s3);
			String s1="";
			StringBuilder ss=new StringBuilder(s);
			for(int i=0;i<32-s.length();i++)
			{
				s1=s1+'1';
			}
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='0')
				{
					ss.setCharAt(i, '1');
				}
				else
				{
					ss.setCharAt(i, '0');
				}
			}
			s1=s1+ss;
			//System.out.println(s1.length());
			long sum=0,k=0;
			for(int i=s1.length()-1;i>=0;i--)
			{
				if(Character.getNumericValue(s1.charAt(i))==1)
				{
					//System.out.println("ssss");
					sum=sum+(long)(Character.getNumericValue(s1.charAt(i))*(Math.pow(2, k)));
				}
				k++;
			}
			System.out.println(sum);
		}
	}
}
