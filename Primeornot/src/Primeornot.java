import java.util.Scanner;
public class Primeornot {
public static void main(String[]args)
{
	prime();
}
public static void prime()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number to find its prime or not: ");
	int n = scan.nextInt();
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			System.out.println("Its not a prime number");
			return;
		}
	scan.close();	
	}
	 System.out.println("Its a prime number");
	 
	  

}
}
