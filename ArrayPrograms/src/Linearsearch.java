package array.progrsms;
import java.util.Scanner;
public class Linearsearch {
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
	 System.out.println("Enter the element to search: ");
	 int key=scan.nextInt();
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 if(arr[i]==key)
		 {
			 System.out.println("Key found at " + i);
			 return;
			
		 }
	 }
	 System.out.println("Key not found");
	 
}
}