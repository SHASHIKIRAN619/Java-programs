package stringprogramms;
import java.util.*;
public class ReverseeString {
public static void main(String[]args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a String");
	String s1=scan.nextLine();
	String rev="";
	for(int i=0;i<=s1.length()-1;i++)
	{
		char ch=s1.charAt(i);
		rev = ch + rev;
	}
	System.out.print(rev);
	scan.close();
}
}
