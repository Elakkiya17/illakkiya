import java.io.*;
import java.util.*;
class Paalindrome
{
	public static void main (String[] args) 
	{
	    int r,n,sum=0;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    int temp=n;
	   while(n!=0)
	   {
	       r=n%10;
	       sum=(sum*10)+r;
	       n=n/10;
	   }
	   if(temp==sum)
	    System.out.println("palindrome");
		
	}
}
