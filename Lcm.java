import java.util.*;
public class Lcm {

	public static void main(String[] args)
	{
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int n1=n;
      int m1=m;
      while(n!=m)
      {
    	  if(n>m)
    	  {
    		  n=n-m;
    	  }
    	  else
    	  {
    		  m=m-n;
    	  }
      }
      int g=n;
      int l=(n1*m1)/g;
      System.out.println(l);
	}

}
