package stringprogramms;
import java.util.Scanner;
public class Countuppercase {
public static void main(String[]args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter String: ");
	String s1 = scan.nextLine();
	int count=0;
	for(int i=0;i<=s1.length()-1;i++)
	{
		char ch=s1.charAt(i);
		if(Character.isUpperCase(ch))
		{
			System.out.println(ch + " ");
			count++;
		}
	}
	System.out.println(count + "Upper");
	scan.close();
}
}
