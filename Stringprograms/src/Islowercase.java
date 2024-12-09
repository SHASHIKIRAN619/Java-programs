package stringprogramms;
import java.util.*;
public class Islowercase {
public static void main(String[]args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String s1 = scan.nextLine();
	for(int i=0;i<=s1.length()-1;i++)
	{
		char ch=s1.charAt(i);
		if(Character.isLowerCase(ch))
		{
			System.out.print(ch+" ");
		}
		scan.close();
	}
}
}
