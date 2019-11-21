package rank;
import java.util.*;
public class InsertK2Class 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String ss="";
		for(int i=0;i<s.length()-1;i++)
		{
			if(((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122) && ((int)s.charAt(i+1)>=97 && (int)s.charAt(i+1)<=122))
			{
				int k=((int)(s.charAt(i)-96)+(int)(s.charAt(i+1))-96)%26;
				//System.out.println(k);
				if(k==0)
				ss=ss+s.charAt(i)+0;
				else
				ss=ss+s.charAt(i)+(char)(k+96);
			}
			else
			{
				ss=ss+s.charAt(i);
			}
		}
		ss=ss+s.charAt(s.length()-1);
		System.out.println(ss);
	}
}