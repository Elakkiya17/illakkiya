import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  //int m=n%2;
		  int flag=0;
		  if(n==1)
		  {
			  System.out.println("not a prime");
		  }
		  if(n>1)
		  {
			  for(int i=2;i<n;i++)
			  {
				  if(n%i==0)
				  {
					  flag=1;
					  break;
				  }
			  }
			  
		  }
		  if(flag==0)
		  {
			  System.out.println("prime");
		  }
		  else
		  {
			  System.out.println("not a prime");
		  }

	}

}
