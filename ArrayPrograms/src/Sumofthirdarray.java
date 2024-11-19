package array.progrsms;
import java.util.Scanner;
public class Sumofthirdarray {
 public static void main(String[]args)
 {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the Array Length: ");
	 int arr1[] = new int[scan.nextInt()];
	 System.out.println("Enter the Array Elements: ");
	 for(int i=0;i<=arr1.length-1;i++)
	 {
		 arr1[i]=scan.nextInt();
	 }
	 System.out.println("Enter 2nd Array Length: ");
	 int arr2[] = new int[scan.nextInt()];
	 System.out.println("Enter the second Array Elements");
	 for(int i=0;i<=arr2.length-1;i++)
	 {
		 arr2[i]=scan.nextInt();
	 }
	 int arr3[] = new int[arr1.length];
	 
	 for(int i=0;i<=arr3.length-1;i++)
	 {
		 arr3[i]=arr1[i]+arr2[i];
		 
	 }
	 System.out.println("The sum of 1st and 2nd Array is: ");
	 for(int x:arr3)
	 {
		 System.out.print(x + " ");
	 }
	 
	 
 }
}
