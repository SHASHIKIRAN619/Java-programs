package array.progrsms;
public class Arrayreverse {
 public void printarray(int arr[])
 {
	 System.out.println("The Array contents in Forward direction: ");
	 for(int x :arr)
	 {
		 System.out.print(x + " ");
	 }
	 System.out.println();
	 System.out.println("The Array Elements in Reverse direction: ");
	 for(int i=arr.length-1;i>=0;i--)
	 {
		 System.out.print(arr[i] + " ");
	 }
 }
}
