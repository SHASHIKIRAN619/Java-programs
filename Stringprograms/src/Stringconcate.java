package stringprogramms;
import java.util.Scanner;
public class Stringconcate {
public static void main(String[]args)
{
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter two Strings:");
	 String str1 = new String(scan.nextLine());
	 String str2 = new String(scan.nextLine());
	 Concat Concat = new Concat();
	  String res=Concat.concatstring(str1,str2);
	 if(res!=null)
	 {
		 System.out.println("Strings are concatinated: " + res);
	 }
	 else
	 {
		 System.out.println("Strings are not same to concatinate");
	 }
	 scan.close();
			
}
}
