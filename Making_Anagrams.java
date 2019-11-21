package rank;
import java.util.*;
public class Making_Anagrams 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		StringBuilder ss=new StringBuilder(s2);
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==ss.charAt(j))
				{
					ss.setCharAt(j,'\0');
					count++;
					break;
				}
			}
		}
		int sum;
		sum=s1.length()-count;
		sum=sum+(s2.length()-count);
		System.out.println(sum);
	}
}
