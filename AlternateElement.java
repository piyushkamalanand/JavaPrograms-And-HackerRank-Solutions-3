package rank;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class AlternateElement 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]={1,4,7,2,3,4};
		Arrays.sort(a);
		for(int i=1;i<a.length;i+=2)
			System.out.print(a[i]+" ");
	}
}
