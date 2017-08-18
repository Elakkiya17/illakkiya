import java.util.*;
public class Sum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=15,m=45;
		int s=0,c=0;
		for(int i=1;i<=n;i++)
		{
			s=s+i;
		}
		System.out.println(s);
        for(int i=n;i<=45;i++)
        {
        	if(i%2!=0)
        	{
        		c=c+i;
        	}
        }
        //System.out.println(s);
        System.out.println(c);
	}

}
