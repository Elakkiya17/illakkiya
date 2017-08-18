import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int m=sc.nextInt();
		 int flag=0,i;
		 
		  for( i=n;i<=m;i++)
		 {
			 for(int j=2;j<i;j++)
				 {
					 if(i%j==0)
					 {
						flag=1;
						break;
					 }
					 else
					 {
						flag=0; 
				     }
		          }
			 if(flag==0)
			 {
				 System.out.println(i);
			 }
		}
			

	}
	
}
