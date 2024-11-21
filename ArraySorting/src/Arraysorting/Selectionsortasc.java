package Arraysorting;
import java.util.Scanner;
public class Selectionsortasc {
 public static void main(String[]args)
 {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter an Array Element: ");
	 int arr[] = new int[scan.nextInt()];
	 System.out.println("Enter an Array Elements: ");
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 arr[i]=scan.nextInt();
	 }
	 System.out.println("Array Elements before sorting");
	 for(int x:arr)
	 {
		 System.out.println(x + " ");
	 }
	 selectionmethod selection = new selectionmethod();
	 selection.sort(arr);
	 System.out.println("Array Elements after sorting");
	 for(int x:arr)
	 {
		 System.out.println(x + " ");
		 scan.close();
	 }
			
 }
}
 