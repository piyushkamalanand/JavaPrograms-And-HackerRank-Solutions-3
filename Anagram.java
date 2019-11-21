package rank;
import java.util.*;
public class Anagram 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0)
        {
            String ss=sc.next();
            StringBuilder s=new StringBuilder(ss);
            int c=0;
            if(s.length()%2!=0)
            {
                System.out.println("-1");
            }
            else
            {
                for(int i=0;i<s.length()/2;i++)
                {
                    for(int j=(s.length()/2);j<s.length();j++)
                    {
                        if(s.charAt(i)==s.charAt(j))
                        {
                            s.setCharAt(j,'0');
                            c++;
                            break;
                        }
                    }
                    //System.out.println(s);
                }
                System.out.println((s.length()/2-c));
            }
        }
	}
}
