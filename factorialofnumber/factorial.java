package factorialofnumber;
import java.util.Scanner;
public class factorial {
public static void  factorialnumber()
{
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the Number to find the factorial: ");
	 int n=scan.nextInt();
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;	
	}
	System.out.println("The factorial of " +n+ " is " + fact);
	scan.close();
}
}
