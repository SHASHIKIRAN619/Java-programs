package array.progrsms;
import java.util.Scanner;
public class Arraypositive {
 public static void main(String[]args)
 {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Emter the Array Length: ");
	 int arr[] = new int[scan.nextInt()];
	 System.out.println("Enter the Array Elements are: ");
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 arr[i]=scan.nextInt();
	 }
	 System.out.println("The Array contents are: ");
	 for(int x:arr)
	 {
		 if(x>0)
		 {
			 System.out.print(x + " ");
		 }
	 }
	 scan.close();
 }
}
