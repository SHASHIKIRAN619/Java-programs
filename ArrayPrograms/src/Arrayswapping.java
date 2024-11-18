package array.progrsms;
import java.util.Scanner;
public class Arrayswapping {
 public static void main(String[]args)
 {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the Array Length");
	 int arr[] = new int[scan.nextInt()];
	 System.out.println("Enter the Array Elements: ");
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 arr[i]=scan.nextInt();
	 }
	 System.out.println("Enter an indexes to swap: ");
	 int x =scan.nextInt();
	 int y = scan.nextInt();
	 int help;
	 System.out.println("Before swapping:");
	 for(int a:arr)
	 {
		 System.out.print(a + " ");
	 }
	 help=arr[x];
	 arr[x]=arr[y];
	 arr[y]=help;
	 System.out.println();
	System.out.println("After swapping: ");
	for(int a : arr)
	{
		System.out.print(a + " ");
	}
 }
}
