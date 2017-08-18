import java.util.*;
public class Armsbwn {

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int m=sc.nextInt();
	  int c=0,r,s=0;
	  for(int i=n;i<=m;i++)
	  {
		  int num1=i;
		 while(num1!=0)
		  {
			 
			  num1=num1/10;
			  c++;
		  }
		  num1=i;
		

		  while(num1!=0)
		  {
			r=num1%10;
			s=s+(int)Math.pow(r,c);
			num1=num1/10;
			 	 }
		  if(s==i)
		  {
			  System.out.println(s);
		  }
		  c=0;
		  s=0;
	  }
	}

}
