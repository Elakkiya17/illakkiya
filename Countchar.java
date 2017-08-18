import java.util.*;
public class Countchar {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char ch[]=s.toCharArray();
		int l=s.length();
		int c=0,n=0;
		for(int i=0;i<l;i++)
		{
			if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z')
			{
			  c++;	
			}
			if(ch[i]>='0' && ch[i]<='9')
			{
				n++;
			}
			
		}
    System.out.println(c);
    System.out.println(n);
	}
