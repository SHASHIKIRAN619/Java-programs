package array.progrsms;
import java.util.Scanner;
public class Copyarray {
public static void main(String[]args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Array Element: ");
	int arr[] = new int[scan.nextInt()];
	System.out.println("Enter the Array Elements: ");
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
	}
	System.out.println("Array 1 contents are:");
	for(int x:arr)
	{
		System.out.print(x + " ");
	}
	System.out.println();
	System.out.println("Array 2 contents are: ");
	int arr1[] = new int[arr.length];
	for(int i=0;i<=arr.length-1;i++)
	{
		arr1[i]=arr[i];
	}
	for(int a : arr)
	{
		System.out.print(a + " ");
	}
	scan.close();
}
}
