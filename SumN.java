import java.io.*;
import java.util.*;
class SumN {
	public static void main (String[] args) {
	    int N;
	    Scanner sc=new Scanner(System.in);
	    N=sc.nextInt();
	    int sum=0;
		for(int i=1;i<=N;i++)
        {
           sum=sum+i ;
        }
        System.out.println(sum);
	}
}
