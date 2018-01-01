import java.io.*;
import java.util.*;
class Integerrev {
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    String s=Integer.toString(n);
	    StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
	}
}
