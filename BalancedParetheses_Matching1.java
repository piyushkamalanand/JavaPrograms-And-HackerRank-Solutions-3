package rank;
import java.util.*;
public class BalancedParetheses_Matching1 
{
	public static void main(String args[])
	{
		BalancedParetheses_Matching1 b=new BalancedParetheses_Matching1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number Of String - ");
		int n=sc.nextInt();
		String s[]=new String[n];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		String ss[]=new String[n];
		ss=b.CheckParentheses1(s);
		for(int i=0;i<n;i++)
		{	
			System.out.println(ss[i]);
		}
	}
	public String[] CheckParentheses1(String s[])throws EmptyStackException
	{   
	    String ss[]=new String[s.length];
	    for(int i=0;i<s.length;i++)
	    {
	    	Stack<Character> st=new Stack();
	    	for(int j=0;j<s[i].length();j++)
	    	{
	    		if(s[i].charAt(j)=='{' || s[i].charAt(j)=='[' || s[i].charAt(j)=='(')
				{
					st.push(s[i].charAt(j));
				}
				if(st.isEmpty())
				{
					ss[i]="NO";
				}
				switch(s[i].charAt(j))
				{
				case ')':
				{
					if(st.peek()=='{' || st.peek()=='[')
					{
						ss[i]="NO";
					}
					st.pop();
					break;
				}
				case '}':
				{
					if(st.peek()=='(' || st.peek()=='[')
					{
						ss[i]="NO";
					}
					st.pop();
					break;
				}
				case ']':
				{
					if(st.peek()=='(' || st.peek()=='{')
					{
						ss[i]="NO";
					}
					st.pop();
					break;
				}
				}
				ss[i]=(st.isEmpty())?"YES":"NO";
	    	}
	    }
	    return ss;
	}
}