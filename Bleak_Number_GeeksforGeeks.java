package rank;
import java.util.*;
public class Bleak_Number_GeeksforGeeks 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int b=0;
			for(int i=2;i<n;i++)
			{
				int count=0;
				String s=Integer.toBinaryString(i);
				//int k=Integer.parseInt(s);
				for(int j=0;j<s.length();j++)
				{
					if(s.charAt(j)=='1')
					{
						count++;
					}
				}
				if(i+count == n)
				{
					System.out.println("0");
					break;
				}
				b++;
			}
			if(n-2 == b)
			{
				System.out.println("1");
			}
		}
	}
}
