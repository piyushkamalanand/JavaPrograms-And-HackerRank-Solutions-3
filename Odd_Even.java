package rank;
import java.util.*;
public class Odd_Even 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i=0;
		while(i<n)
		{
			a[i]=sc.nextInt();
			i++;
		}
		for(int j=0;j<n;j++)
		{
			if(j%2==0){
				if(a[j]%2==0)
					continue;
				else
				{
					for(int k=j+1;k<n;k++)
					{
						int tmp=0;
						if(a[k]%2==0)
						{
							tmp=a[j];
							a[j]=a[k];
							a[k]=tmp;
							break;
						}
					}
				}}
			else
			{
				if(a[j]%2!=0)
					continue;
				else
				{
					for(int k=j+1;k<n;k++)
					{
						int tmp=0;
						if(a[k]%2!=0)
						{
							tmp=a[j];
							a[j]=a[k];
							a[k]=tmp;
							break;
						}
					}
				}
			}
		}
		i=0;
		while(i<n)
		{
			System.out.print(a[i]+" ");
			i++;
		}
	}
}/*
Input : arr[] = {10, 9, 7, 18, 13, 19, 4, 20, 21, 14}
Output : 10 9 18 7 20 19 4 13 14 21*/