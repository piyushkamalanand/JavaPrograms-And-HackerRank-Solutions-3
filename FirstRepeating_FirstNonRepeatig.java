package rank;
import java.util.*;
public class FirstRepeating_FirstNonRepeatig 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[123];
		int e1=0;
		String s=sc.nextLine();
		//StringBuffer s=new StringBuffer(ss);
		for(int i=0;i<s.length();i++)
		{
			a[s.charAt(i)]++;
			if(a[s.charAt(i)]==2 && e1==0)
			{
				System.out.println("1st Repeating Character - "+s.charAt(i));
				e1=1;
			}
		}
		for(int i=0;i<s.length();i++)
		{
			if(a[s.charAt(i)]==1)
			{
				System.out.println("1st Non-Repeating Character - "+s.charAt(i));
				break;
			}
		}
	}
}
