
public class Fibonnaciapp {
  public void series(int n)
  {
	  int fib1=0;
	  int fib2=1;
	  if(n==1)
	  {
		  System.out.print(fib1);
	  }
	  else if(n==2){
		  System.out.println(fib1 + " " + fib2);
	  }
	  else
	  {
		  System.out.println(fib1 + " " + fib2);
		  for(int i=3;i<=n;i++)
		  {
			  int nextno=fib1+fib2;
			  System.out.print(nextno + " ");
			  fib1=fib2;
			  fib2=nextno;
		  }
	  }
  }
}
