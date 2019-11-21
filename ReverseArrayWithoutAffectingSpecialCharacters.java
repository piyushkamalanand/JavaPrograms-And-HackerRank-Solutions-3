package rank;
import java.util.*;
public class ReverseArrayWithoutAffectingSpecialCharacters 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ss="";
		String c="";
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z'))
			{
				c=c+s.charAt(i);
			}
			else
			{
				ss=ss+i;
			}
		}
		System.out.println(c+"\n"+ss);
		StringBuilder b=new StringBuilder(c);
		b.reverse();
		String f="";
		int k=0;
		int m=0;
		for(int i=0;i<s.length();i++)
		{
			if(k<ss.length() && i==Character.getNumericValue(ss.charAt(k))){
			
				f=f+s.charAt(Character.getNumericValue(ss.charAt(k)));
				k++;
			}
			else
			{
				if(m<b.length())
				f=f+b.charAt(m);
				m++;
			}
		}
		System.out.println(f);
	}
}
