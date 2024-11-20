package Arraysorting;
import java.util.Scanner;
public class Arraysorting {
 public static void main(String[]args)
 {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the Array length: ");
	 int arr[] = new int[scan.nextInt()];
	 System.out.println("Enter the Array Elements: ");
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 arr[i]=scan.nextInt();
	 }
	 System.out.println("The Array Elements before Sorting");
	 for(int x:arr)
	 {
		 System.out.print(x + " ");
	 }
	 scan.close();
	 System.out.println();
	 Bubblesort Bubble = new Bubblesort();
	 Bubble.sort(arr);
	 System.out.println("The Array Elements After sorting:");
	 for(int x:arr)
	 {
		 System.out.print(x + " ");
	 }
 }
}
