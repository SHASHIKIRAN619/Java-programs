import java.util.Scanner;
public class Factorsnum {
  public static void main(String[]args)
  {
    factor();
  }
    public static void factor()
{
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the number");
  int n =scan.nextInt();
  int fact=1;
  for(int i=1;i<=n;i++)
  {
    fact=fact*i;

  }
  System.out.println("The factorial of a number is: " +fact);
  
}
}
