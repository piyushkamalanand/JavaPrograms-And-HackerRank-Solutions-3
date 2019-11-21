package rank;
import java.util.*;
public class CodeChef 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
		    	int n=sc.nextInt();
		    	int b=0,ni=0,by=0;
		        if(n%26==0)
		        {
		        	n=n-1;
		        }
		        if(n>0 && n<=2)
		        {
		            b++;

		        }
		        else if(n>2 && n<=10)
		        {
		            ni++;

		        }
		        else if(n>10 && n<=26)
		        {
		            by++;

		        }
		        else if(n>26)
		        {
		            double r=n/26;
		            int bb=(int)Math.pow(2,r);
		            n=n%26;
		            if(n>0 && n<=2)
			        {
			            b=b+bb;

			        }
			        else if(n>2 && n<=10)
			        {
			            ni=ni+bb;

			        }
			        else if(n>10 && n<=26)
			        {
			            by=by+bb;

			        }
		        }
		    System.out.println(b+" "+ni+" "+by);
		}
	}
}
