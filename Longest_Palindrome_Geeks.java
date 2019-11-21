package rank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Longest_Palindrome_Geeks 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(sc.readLine());
		while(t-->0)
		{
			StringBuffer s=new StringBuffer(sc.readLine());
			StringBuffer f=new StringBuffer();
			int max=0,c=0;
			StringBuffer ss=new StringBuffer();
			for(int i=0;i<s.length();i++)
			{
				ss=ss.append(s.charAt(i));
				for(int j=i+1;j<s.length();j++)
				{
					ss=ss.append(s.charAt(j));
					StringBuffer r=new StringBuffer(ss.reverse());
					System.out.println("BEfore  "+ss+"  "+ss.reverse());
					//StringBuilder sb=new StringBuilder(ss);
					//System.out.println(ss+" "+sb.reverse());
					if(ss.toString().equals(r.toString())==true)
					{
						if(ss.length()>max)
						{
							max=ss.length();
							f=ss;
							c=1;
							//System.out.println(f);
						}
					}
				}
				ss=new StringBuffer();
				//System.out.println("After"+ss);
			}
			if(c==0)
			{
				System.out.println(s.charAt(0));
			}
			else{
			System.out.println("Final "+f);}
		}
	}
}
