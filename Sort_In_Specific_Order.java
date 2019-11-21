package rank;
import java.util.*;
public class Sort_In_Specific_Order 
{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0)
		{
		    int n=sc.nextInt();
		    int n1,n2;
		    if(n%2==0)
		    {
		        n1=n/2;
		        n2=n/2;
		    }
		    else
		    {
		        n1=(n/2)+1;
		        n2=n-n1;
		    }
		    int b[]=new int[n1];
		    int c[]=new int[n2];
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int j=0,k=0;
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]%2!=0)
		        {
		            b[j]=a[i];
		            j++;
		        }
		        else
		        {
		            c[k]=a[i];
		            k++;
		        }
		    }
		    Arrays.sort(c);
		    int tmp=0;
		    for(int i=0;i<n1;i++)
		    {
		        for(int l=i+1;l<n1;l++)
		        {
		            if(b[i]<b[l])
		            {
		                tmp=b[l];
		                b[l]=b[i];
		                b[i]=tmp;
		            }
		        }
		    }
		    for(int i=0;i<n1;i++)
		    {
		        System.out.print(b[i]+" ");
		    }
		    for(int i=0;i<n2;i++)
		    {
		        System.out.print(c[i]+" ");
		    }
		    System.out.println();
		}
	}
}
