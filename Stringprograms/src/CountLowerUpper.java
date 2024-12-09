package stringprogramms;
import java.util.*;
public class CountLowerUpper {
public static void main(String[]args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a String");
	String s1=scan.nextLine();
	int ucount=0;
	int lcount=0;
	for(int i=0;i<=s1.length()-1;i++)
	{
		char ch=s1.charAt(i);
		if(Character.isUpperCase(ch))
		{
			System.out.println(ch);
			ucount++;
		}
		else if(Character.isLowerCase(ch))
		{
			System.out.println(ch);
			lcount++;
		}
	}
	System.out.println(ucount + " Uppercase");
	System.out.println(lcount + " Lowercase");
	scan.close();
}
}
