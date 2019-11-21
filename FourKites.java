package rank;
import java.util.*;
import java.lang.*;
public class FourKites 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="";
		TreeSet<String> l=new TreeSet();
		for(int i=0;i<s.length();i++)
		{
			s1="";
			l.add(Character.toString(s.charAt(i)));
			s1=s1+s.charAt(i);
			for(int j=i+1;j<s.length();j++)
			{
				s1=s1+s.charAt(j);
				l.add(s1);
			}
		}
		System.out.println(new ArrayList<>(l).indexOf(s)+1);
	}
}
// eren