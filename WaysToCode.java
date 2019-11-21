package rank;
import java.util.*;
public class WaysToCode {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		WaysToCode w=new WaysToCode();
		String A=sc.next();
		System.out.println(w.numDecodings(A));
	}
    public int numDecodings(String A) 
    {
        int count=1;
        String s="";
        for(int i=0;i<A.length()-1;i++)
        {
        	s=s+A.charAt(i)+A.charAt(i+1);
        	if(Integer.parseInt(s)<=26)
        	{
        		count++;
        	}
        	s="";
        }
        return count;
    }
}

