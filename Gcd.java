import java.util.*;
public class Gcd 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int gcd;
		while(n!=m)
		{
			if(n>m)
				n=n-m;
			else
				m=m-n;
		
		}
		gcd=n;
		System.out.println(gcd);
		
	}	
	

}
