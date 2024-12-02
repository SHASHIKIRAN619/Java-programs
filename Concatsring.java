package stringprogramms;
import java.util.Scanner;
public class Concatsring {
public static void main(String[]args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter First String");
	String s1 = new String(scan.nextLine());
	System.out.println("Enter second String");
	String s2= new String(scan.nextLine());
	if(s1.equalsIgnoreCase(s2))
	{
		System.out.println(s1 + " " + s2);
		 
	}
	else
	{
		System.out.println("String values are not Equal");
	}
	scan.close();
}
}
