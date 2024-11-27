package stringprogramms;
import java.util.Scanner;
public class Lengthchecker {
public static void main(String[]args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two Strings");
	String str1 = new String(scan.nextLine());
	String str2 = new String(scan.nextLine());
	if(str1.length()==str2.length())
	{
		System.out.println("Strings are of same length");
	}
	else
	{
		System.out.println("Strings are of different length");
	}
	scan.close();
}
}