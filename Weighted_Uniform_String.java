package rank;
import java.lang.reflect.Array;
import java.util.*;
public class Weighted_Uniform_String 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		long n=sc.nextLong();
		long a[]=new long[(int) n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayList<Long> al=new ArrayList<Long>();
		long count = 0,k=0,m=0;
		for(char c='a';c<='z';c++)
		{
			for(long i=k;i<s.length();i++)
			{
				if(c==s.charAt((int) i))
				{
					count++;
					for(int j=0;j<n;j++)
					{
						if(count==a[j])
						{
							m=1;
							System.out.println("Yes");
							break;
						}
					}
					if(1==1)
					al.add((count*((int)c-96)));
				}
				else
				{
					k=i;
					break;
				}
			}
			count=0;
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		long n1=al.size();
		int z=0;
		for(int i=0;i<n;i++)
		{
			long l=0,h=n1-1,m1=(l+h)/2;
			while(l<=h)
			{
				if(a[(int) i]==al.get((int) m))
				{
					System.out.println("YES");
					z=1;
					break;
				}
				else if(a[i]>al.get((int) m))
				{
					l=m+1;
				}
				else if(a[i]<al.get((int) m))
				{
					h=m-1;
				}
				m=(l+h)/2;
			}
			if(z==0)
			{
				System.out.println("NO");
			}
			z=0;
		}
	}
}
