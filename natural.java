import java.io.*;
import java.util.*;
class natural {
	public static void main (String[] args) {
	    int n;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    int sum=0;
		for(int i=1;i<=n;i++)
        {
           sum=sum+i ;
        }
        System.out.println(sum);
	}
}
