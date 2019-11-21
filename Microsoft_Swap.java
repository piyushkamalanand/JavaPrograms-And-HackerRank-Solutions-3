package rank;
import java.util.*;
public class Microsoft_Swap 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int l=sc.nextInt();
		int h=sc.nextInt();
		int i=l-1;
		String ss="";
		while(i<h)
		{
			ss=ss+s.charAt(i);
			i++;
		}
		s=ss+s;
		i=0;
		String sf="";
		int k=h-l;
		l=l+k+1;
		h=h+k+1;
		while(i<s.length())
		{
			if(i<l-1)
			sf=sf+s.charAt(i);
			if(i>h-1)
				sf=sf+s.charAt(i);
			i++;
		}
		System.out.println(sf);
	}
}