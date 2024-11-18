package array.progrsms;
import java.util.Scanner;
public class Sumofarray {
 public static void main(String[]args)
 {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the Array Length: ");
	 int arr[] = new int[scan.nextInt()];
	 System.out.println("Enter the Array Elements: ");
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 arr[i]=scan.nextInt();
	 }
	 scan.close();
	 System.out.println("The Array Elements are: ");
	 int sum=0;
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 sum=sum+arr[i];
	 }
	 for(int x:arr)
	 {
		 System.out.print(x + " ");
	 }
	 System.out.println();
	 System.out.print("The sum  of the Array is :"+ sum );
 }
}
