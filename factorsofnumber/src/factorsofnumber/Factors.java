package factorsofnumber;
import java.util.Scanner;
public class Factors {
 public static void main(String[]args)
 {
	 factors();
 }
 public static void factors()
 {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the number: ");
	 int n = scan.nextInt();
	 for(int i=1;i<=n;i++)
	 {
		 if(n%i==0)
		 {
			 System.out.println("The factors are: " + i);
		 }
		 scan.close();
	 }
 }
}
