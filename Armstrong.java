
import java.util.*;
public class Armstrong {

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int num;
	  int c=0,s=0,r;
	  num=n;
	  while(num!=0)
	  {
		  num=num/10;
		  c++;
	  }
	  num=n;
	  while(num!=0)
	  {
		  r=num%10;
		  s=s+(int)Math.pow(r,c);
		  num=num/10;
	  }
	  if(n==s)
	  {
		  System.out.println(n);
	  }
	  else
	  {
		  System.out.println("not");
	  }
}
	
}
