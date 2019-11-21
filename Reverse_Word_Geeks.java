package rank;
import java.util.*;
public class Reverse_Word_Geeks 
{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    String s=sc.next();
		    String ss="";
		    String sss="";
		    for(int i=0;i<s.length();i++)
		    {
		        if(s.charAt(i)!='.')
		        {
		            sss=sss+s.charAt(i);
		            //ss=s.charAt(i)+ss;
		        }
		        else
		        {
		            sss=s.charAt(i)+sss;
		            ss=sss+ss;
		            sss="";
		        }
		        if(i==s.length()-1)
		        {
		            ss=sss+ss;
		        }
		    }
		    System.out.println(ss);
		}
	}
}
