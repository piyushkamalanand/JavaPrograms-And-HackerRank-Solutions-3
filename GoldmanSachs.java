package rank;
import java.util.*;
public class GoldmanSachs 
{
	public static void main(String args[])
	{
		Scanner  sc=new Scanner(System.in);
		int a[]=new int[10];
		int mul=1,count=0;
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]!=0)
			mul=mul*a[i];
			else
				count++;
		}
		if(count>1)
		{
			for(int i=0;i<5;i++)
				System.out.print("0 ");
		}
		else if(count==1)
		{
			for(int i=0;i<5;i++)
			{
				if(a[i]==0)
					System.out.print(mul+" ");
				else
					System.out.print("0 ");
			}
		}
		else
		{
			for(int i=0;i<5;i++)
				System.out.print(mul/a[i]+" ");
		}
	}
}
