package array.progrsms;
import java.util.Scanner;
public class Arrayelement {
public static void main(String[]args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array length");
	 int arr[] = new int [scan.nextInt()];
	 System.out.println("Enter the Array Elements: ");
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 arr[i]=scan.nextInt();
	 }
	 System.out.println("The array contents are: ");
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 System.out.print(arr[i] + " ");
	 }
}
}
