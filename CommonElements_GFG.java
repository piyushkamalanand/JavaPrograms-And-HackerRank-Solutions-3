package rank;
import java.util.*;
import java.lang.*;
import java.io.*;
class CommonElements_GFG
 {
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t-->0)
	     {
	         int n1=sc.nextInt();
	         int n2=sc.nextInt();
	         int n3=sc.nextInt();
	         ArrayList<Integer> l=new ArrayList<Integer>();
	         ArrayList<Integer> l1=new ArrayList<Integer>();
	         for(int i=0;i<n1;i++)
	         {
	             l.add(sc.nextInt());
	             l1.add(l.get(i));
	         }
	         for(int i=0;i<n2;i++)
	         {
	              l1.add(sc.nextInt());
	         }
	         for(int i=0;i<n3;i++)
	         {
	               l1.add(sc.nextInt());
	         }
	         int c=0;
	         for(int i=0;i<n1;i++)
	         {
	             if(Collections.frequency(l1,l.get(i))==3)
	             {
	                 c=1;
	                 System.out.print(l.get(i));
	             }
	         }
	         if(c==0)
	         System.out.println("-1");
	         else
	         System.out.println();
	     }
	 }
}