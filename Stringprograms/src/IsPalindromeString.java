package stringprogramms;
import java.util.*;
public class IsPalindromeString {
public static void main(String[]args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String s1=scan.nextLine();
	String rev="";
	for(int i=0;i<=s1.length()-1;i++)
	{ 
		char ch=s1.charAt(i);
		rev = ch + rev;
	}
	if(s1.equalsIgnoreCase(rev))
	{
		System.out.println("It is a Palindrome");
	}
	else
	{
		System.out.println("It is not a palindrome");
	}
	scan.close();
}
}
