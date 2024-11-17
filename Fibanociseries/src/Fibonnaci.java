import java.util.Scanner;
public class Fibonnaci {
public static void main(String[]args)
{
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n = scan.nextInt();
	Fibonnaciapp fibo = new Fibonnaciapp();
	fibo.series(n);
	scan.close();
}
}
