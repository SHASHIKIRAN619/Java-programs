package stringprogramms;
import java.util.*;
public class IsdigitString {
public static void main(String[]args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String s1 = scan.nextLine();
	String s2 = " ";
	String s3=" ";
	for(int i=0;i<=s1.length()-1;i++)
	{
		char ch=s1.charAt(i);
		if(Character.isLetter(ch))
		{
			s2 = s2 + ch;
		}
		else if(Character.isDigit(ch))
		{
			s3 = s3 + ch;
		}
	}
	System.out.println(s2 + " is a letters");
	System.out.println(s3 + " is a Digits");
	scan.close();
}
}
