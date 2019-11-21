package rank;
import java.util.*;
public class Geeks 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0)
		{
			String s=sc.next();
			char c[]=s.toCharArray();
			Arrays.sort(c);
			String s1=new String(c);
			//System.out.println(s1);
			int c1=0;
			for(int i=s1.length()-1;i>=0;i--)
			{
				if(Character.isUpperCase(s1.charAt(i)))
				{
					for(int j=s1.length()-1;j>=0;j--)
					{
						if(((char)((int)(s1.charAt(i))+32)) == s1.charAt(j))
						{
							System.out.println(s1.charAt(i));
							c1=1;
							break;
						}
					}
					if(c1==1)
					{
						break;
					}
				}
			}
			if(c1==0)
			{
				System.out.println("-1");
			}
		}
	}
}
