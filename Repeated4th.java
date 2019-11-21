package rank;
import java.util.*;
public class Repeated4th 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int a[]=new int[26];
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			a[s.charAt(i)-97]++;
			if(a[s.charAt(i)-97]==2)
			{
				count++;
			}
			if(count==4)
			{
				System.out.println(s.charAt(i));
				break;
			}
		}
		if(count!=4)
		{
			System.out.println(" No Characters! ");
		}
		sc.close();
	}
}
