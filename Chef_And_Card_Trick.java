package rank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Chef_And_Card_Trick 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
			long n=Long.parseLong(br.readLine());
			int a[]=new int[(int) n];
			for(long i=0;i<n;i++)
			{
				a[(int) i]=Integer.parseInt(br.readLine());
				System.out.println(a[(int)i]);
			}
			int min=a[0];
			long k=0;
			for(long i=1;i<n;i++)
			{
				if(a[(int)i]<min)
				{
					min=a[(int)i];
					k=i;
				}
			}
			int c=0;
			for(long i=k;i<n-1;i++)
			{
				if(a[(int)i]>a[(int)(i+1)])
				{
					System.out.println("NO");
					c=1;
					break;
				}
			}
			if(c==0)
			{
				for(long i=0;i<k-1;i++)
				{
					if(a[(int)i]>a[(int)(i+1)])
					{
						System.out.println("NO");
						c=1;
						break;
					}
				}
			}
			if(c==0)
			{
				System.out.println("YES");
			}
		}
	}
}
