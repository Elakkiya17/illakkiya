import java.util.*;
public class Greateramong10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[10];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
