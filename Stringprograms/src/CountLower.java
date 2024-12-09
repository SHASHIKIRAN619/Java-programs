package stringprogramms;
import java.util.*;
public class CountLower {
public static void main(String[]args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String s1 = scan.nextLine();
	int count=0;
	for(int i=0;i<=s1.length()-1;i++)
	{
		char ch=s1.charAt(i);
		if(Character.isLowerCase(ch))
		{
			System.out.println(ch);
			count++;
		}
	}
	System.out.println(count + " Lowercase");
	scan.close();
}
}
