package sumofnatural;
import java.util.Scanner;
public class SumofNatural {
 public static void sum()
 {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the number to find the N natural numbers : ");
	 int n = scan.nextInt();
	 int sum=0;
	 for(int i=1;i<=n;i++)
	 {
		 sum=sum+i;
	 }
	 System.out.println("The sum of N natural numbers are : " + sum);
	 scan.close();
 }
}
