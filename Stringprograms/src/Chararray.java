package stringprogramms;
import java.util.Scanner;
public class Chararray {
 public static void main(String[]args)
 {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the array length:");
	 char arr[]= new char[scan.nextInt()];
	 System.out.println("Enter the char elements");
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 arr[i]=scan.next().charAt(0);
	 }
	 System.out.println("The char elements are: ");
	 for(char x : arr)
	 {
		 System.out.print(x + " ");
	 }
	 System.out.println();
	 
	char arr1[]= new char[arr.length];
	for(int i=0;i<=arr.length-1;i++)
	{
		arr1[i]=arr[i];
	}
	System.out.print("Second char elemnts are");
	System.out.println();
	for(char x : arr1)
	{
		System.out.print(x + " ");
	}
	char arr2[]= new char[arr1.length];
	int j = arr2.length-1;
	for(int i=0;i<=arr.length-1;i++)
	{
		arr2[j]=arr1[i];
		j--;
	}
	System.out.println();
	System.out.println("3rd char elements:");
	for(char x:arr2)
	{
		System.out.print(x + " ");
	}
 }
}
