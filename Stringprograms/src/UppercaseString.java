package stringprogramms;
import java.util.*;
public class UppercaseString {
public static void main(String[]args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a String");
	String s1 =scan.nextLine();
	String s2="";
	for(int i=0;i<=s1.length()-1;i++)
	{
		char ch=s1.charAt(i);
		if(Character.isUpperCase(ch))
		{
			s2=s2+ch;
		}
	}
	System.out.println(s2);
	scan.close();
}
}
