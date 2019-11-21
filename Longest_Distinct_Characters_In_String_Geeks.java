package rank;
import java.util.*;
public class Longest_Distinct_Characters_In_String_Geeks 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String s=sc.next();
			//StringBuilder ss=new StringBuilder("");
			int m=1;
			for(int i=0;i<s.length();i++)
			{
				String ss="";
				ss=ss+s.charAt(i);
				//ss=ss.append(s.charAt(i));
				for(int j=i+1;j<s.length();j++)
				{
					if(s.charAt(j)!=s.charAt(j-1))
					{
						int c=0,d=0;
						//ss=ss+s.charAt(j);
						for(int k=0;k<ss.length();k++)
						{
							d=1;
							if(s.charAt(j)!=ss.charAt(k))
							{
								c++;
							}
							else
							{
								c=-1;
								break;
							}
						}
						if(d==0)
						{
							ss=ss+s.charAt(j);
						}
						else if(c==ss.length())
						{
							ss=ss+s.charAt(j);
						}
						else if(c==-1)
						{
							break;
						}
					}
					else
					{
						break;
					}
					if(ss.length()>m)
					{
						m=ss.length();
					}
				}
			}
			System.out.println(m);
		}
	}
}
