package stringprogramms;
import java.util.Scanner;
public class Unicidestring {
 public static void main(String[]args)
 {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter a String");
	 String str1= scan.nextLine();
	 Checkunicode check =new Checkunicode();
	 check.unicode(str1);
	 scan.close();
 }
}
