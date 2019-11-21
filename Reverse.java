package rank;
import java.util.*;
public class Reverse 
{
	public static void main(String args[])
	{
		int n=122;
		reverse(n);
	}
	public static void reverse(int n)
	{
		if(n!=0)
		{
			int r=n%10;
			n=n/10;
			System.out.print(r);
			reverse(n);
		}
		else
		{
			return;
		}
	}
}
