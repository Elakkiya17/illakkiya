import java.util.*;
public class Fibanocci {

	public static void main(String[] args) 
	{
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=1,b=-1,c;
      for(int i=0;i<n;i++)
      {
    	c=a+b;
    	b=a;
    	a=c;
    	System.out.println(c);
      }
      
	}

}
