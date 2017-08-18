import java.util.*;
public class Numberofwords {

	public static void main(String[] args) 
	{
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      char ch[]=s.toCharArray();
      int c=1;
      for(int i=0;i<ch.length;i++)
      {
    	  if(ch[i]==' ')
    	  {
    		  c++;
    	  }
      }
     // int l=s.length();
      System.out.println(c);
	}

}
