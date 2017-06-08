import java.io.*;
import java.util.*;
class Posneg {
	public static void main (String[] args) 
	{
	  int n;
	  Scanner sc=new Scanner (System.in);
	  n=sc.nextInt();
	  if(n>0)
	  System.out.println("POSITIVE");
	  else if(n<0)
	  System.out.println("NEGATIVE");
	  else
	  System.out.println("ZERO");
	}
}
