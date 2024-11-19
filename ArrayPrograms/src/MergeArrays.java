package array.progrsms;
import java.util.Scanner;
public class MergeArrays {
 public static void main(String[]args)
 {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter an Array Length: ");
	 int arr1[] = new int[scan.nextInt()];
	 System.out.println("Enter the Array Elements: ");
	 for(int i=0;i<=arr1.length-1;i++)
	 {
		 arr1[i]=scan.nextInt();
	 }
	 System.out.println("Enter the 2nd Array Length: ");
	 int arr2[] = new int[scan.nextInt()];
	 System.out.println("Enter an Array Elements: ");
	 for(int i=0;i<=arr2.length-1;i++)
	 {
		 arr2[i]=scan.nextInt();
	 }
	 int arr3[] = new int[arr1.length + arr2.length];
	 int j=0;
	 for(int i=0;i<=arr1.length-1;i++)
	 {
		 arr3[j] = arr1[i];
		 j++;
	 }
	 for(int i=0;i<=arr2.length-1;i++)
	 {
		 arr3[j] = arr2[i];
		 j++;
	 }
	 System.out.println("The First Array Elements: ");
	 for (int x:arr1)
	 {
		 System.out.print(x + " ");
	 }
	 System.out.println();
	 
	 System.out.println("The Second Array Elements: ");
	 for(int y:arr2) {
		 System.out.print(y + " ");
	 }
	 System.out.println();
	 System.out.println("The Third Array Elements are");
	 for(int z:arr3)
	 {
		 System.out.print(z + " ");
	 }
	 scan.close();
 }
}
