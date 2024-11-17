package array.progrsms;
import java.util.Scanner;
public class Arrayelement2 {
 public static void main(String[]args)
 {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the Array Length: ");
	 int arr[] = new int [scan.nextInt()];
	 System.out.println("Enter the Array Elements: ");
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 arr[i]=scan.nextInt();
	 }
	 System.out.println("The Array contents are: ");
	 for(int x:arr)
	 {
		 System.out.print((x+5) + " ");
	 }
   scan.close();
 }
}
