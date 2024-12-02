package stringprogramms;
import java.util.*;
public class StringLength {
public static void main(String[]args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter First String");
	String s1 = new String(scan.nextLine());
	System.out.println("Enter second String");
	String s2= new String(scan.nextLine());
	if(s1.length()==s2.length())
	{
		System.out.println("Both Strings lengths are Equal");
	}
	else {
		System.out.println("String lengths are not Equal");
	}
	scan.close();
}
}
