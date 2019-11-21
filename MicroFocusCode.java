package rank;
import java.util.*;
public class MicroFocusCode 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		try{
		System.out.println(Encryptor.getEncryptedName(s));
	}catch(Exception e)
		{
		System.out.println("Try Something Else");
		}
		}
}
class Validator
{
	public boolean validate(String name)
	{
		if(name.length()>2)
		return true;
		else
			return false;
	}
}
class Encryptor
{
	public static String getEncryptedName(String name) throws IllegalEncryptedException
	{
		Validator v=new Validator();
		String s="abc";
		if(v.validate(name)==true)
		return s;
		else
			throw new IllegalEncryptedException();
	}
}