package rank;
import java.util.*;
class Chef 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-- >0)
	{
	int p1,p2,k;
	p1=sc.nextInt();
	p2=sc.nextInt();k=sc.nextInt();
	if(((p1+p2)/k)%2==0)
	{
	System.out.println("CHEF");
	}
	else
	System.out.println("COOK");
	}
	}
}
