package rank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Chef_And_Typing_Code_Chef 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(sc.readLine());
		//t=sc.nextInt();
		while(t-->0)
		{
			int n=Integer.parseInt(sc.readLine());
			String s[]=new String[n];
			float f[]=new float[n];
			for(int i=0;i<n;i++)
			{
				s[i]=sc.readLine();
			}
			float sum1=(float) 0.0;
			int c=0;
			for(int i=0;i<n;i++)
			{
				//int c=0;
				float sum=(float) 0.0;
				if(s[i].charAt(0)=='d' || s[i].charAt(0)=='f')
				{
					sum=(float) (sum+0.2);
					c=1;
				}
				else if(s[i].charAt(0)=='j' || s[i].charAt(0)=='k')
				{
					sum=(float) (sum+0.2);
					c=2;
				}
				for(int j=1;j<s[i].length();j++)
				{
					if((s[i].charAt(j)=='d' || s[i].charAt(j)=='f'))
					{
						if(c==1)
						sum=(float) (sum+0.4);
						else{
						sum=(float) (sum+0.2);
						c=1;}
					}
					else if((s[i].charAt(j)=='j' || s[i].charAt(j)=='k'))
					{
						if(c==2)
						sum=(float) (sum+0.4);
						else{
						sum=(float) (sum+0.2);
						c=2;}
					}
				}
				f[i]=sum;
				sum1=sum1+sum;
				//System.out.println("sum="+sum);
			}
			//System.out.println((int)(sum1*10));
			sum1=(int)(sum1*10);
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(f[i]==f[j])
					{
						//System.out.println("F[J]="+f[j]);
						//float m=f[i]/2;
						//System.out.println("f[j]="+f[j]);
						//System.out.println(f[i]/2+" sum ");
						sum1=sum1-(int)((f[i]/2)*10);
						break;
					}
				}
			}
			System.out.println((int)(sum1));
		}
	}
}
