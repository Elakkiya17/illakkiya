import java.util.Scanner;

public class Even {

	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int m=sc.nextInt();
		  for(int i=n;i<=m;i++)
		  {
			  if(n%2==0)
			  {
				  System.out.println(n);
			  }
			  n++;
		  }
	}
}
