import java.util.Scanner;
public class GCD {
public static void main(String[]args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number:");
	int m =scan.nextInt();
	int n=scan.nextInt();
	while(n!=0)
	{
		int rem=m%n;
		m=n;
		n=rem;
	}
	System.out.println("The Gcd is " + m);
}
}
