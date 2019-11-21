package rank;
import java.util.*;
public class GemStones 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		Set<String> s=new HashSet<String>();
		for(int i=0;i<n;i++)
		{
			String s1=sc.next();
			s.add(s1);
		}
	}
}
