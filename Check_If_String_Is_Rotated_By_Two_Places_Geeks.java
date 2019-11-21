package rank;
import java.util.*;
public class Check_If_String_Is_Rotated_By_Two_Places_Geeks 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String a=sc.next();
			String b=sc.next();
			String c1="",c2="";
			String c=Character.toString(b.charAt(0))+Character.toString(b.charAt(1));
			String d=Character.toString(b.charAt(a.length()-2))+Character.toString(b.charAt(a.length()-1));
			for(int i=2;i<a.length();i++)
			{
				c1=c1+b.charAt(i);
			}
			for(int i=0;i<a.length()-2;i++)
			{
				c2=c2+b.charAt(i);
			}
			c1=c1+c;
			c2=d+c2;
			//System.out.println(c1+" sss "+c2);
			if(c1.equals(a) || c2.equals(a))
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("0");
			}
		}
	}
}
