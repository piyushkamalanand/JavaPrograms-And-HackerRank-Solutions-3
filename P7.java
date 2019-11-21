package rank;
import java.io.*;
import java.util.*;
public class P7 implements Serializable
{ 
 int eid;
 String name;
 transient float sal;
 static Scanner sc= new Scanner(System.in);
 public P7() 
 {}
 public P7(int e,String n, float s) 
 {
  eid=e;
  name=n;
  sal=s;
 }
 static public P7 add()
 {
  P7 p;
  int e;
  String n;
  float s;
  System.out.println("Enter details: ");
  System.out.println("Name: ");
  n= sc.next();
  System.out.println("Employee ID: ");
  e=sc.nextInt();
  System.out.println("Salary(in lakhs): ");
  s=sc.nextFloat();
  p=new P7(e,n,s);
  return p;
  
 }
 static public void write(P7 p)
 {
  try
        {    
            FileOutputStream file = new FileOutputStream("C:/Users/HP/Desktop/State.txt",true); 
            AppendingObjectOutputStream out = new AppendingObjectOutputStream(file); 
              
            out.writeObject(p);  
            out.close(); 
            file.close(); 
            out.flush();
            file.flush();
            System.out.println("Serialized!"); 
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("EXCEPTION!!"+ex); 
        } 
  
 }
 
 static public void read()
 {
  int i=0;
  P7 p;
  try
        {    
            
            FileInputStream file = new FileInputStream("C:/Users/HP/Desktop/State.txt"); 
            AppendingObjectInputStream in = new AppendingObjectInputStream(file); 
               
           while(file.available()>0)
           {
  p = (P7)in.readObject();
         i=+1;
            System.out.println("Deserialised Object "+i); 
            System.out.println("EID: " + p.eid); 
            System.out.println("Name: " + p.name); 
            System.out.println("Salary: " + p.sal); 
  
           }
            in.close(); 
            file.close();
            
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException"+ex); 
        } 
 }
 
 public static void main(String args[]) 
 {
  while(true)
  {
   System.out.println("0. Exit");
   System.out.println("1. Write");
   System.out.println("2. Read");
   System.out.println("Enter your choice: ");
   int c=sc.nextInt();
   switch(c)
   {
   case 0:
    System.exit(0);
   case 1:
    P7 p= add();
    write(p);
    break;
   case 2:
    read();
    break;
   default:
    System.out.println("Invalid choice!");
    break;
   }
  }
 }
}
