package rank;

import java.util.*;

import java.lang.*;
public class Rough
{
  public static void main(String args[])
  {
	  TreeSet<String> t=new TreeSet<String>();
	  t.add(new String("A"));
	  t.add(("z"));
	  System.out.println(t.contains(t.add(new String("A1")))+" "+t);
    /*Scanner sc=new Scanner (System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      String s1=sc.next();
      String s2=sc.next();
      ArrayList<Character> a=new ArrayList();
      for(int i=0;i<s2.length();i++)
        a.add(s2.charAt(i));
      for(int i=0;i<s1.length();i++)
      {
        int fr=Collections.frequency(a,s1.charAt(i));
        if(fr>0)
        {
          for(int j=0;j<fr;j++)
            System.out.print(s1.charAt(i));
        }
      }
      System.out.println();
    }*/
  }
}