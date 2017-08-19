import java.util.*;
public class Numericchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         int c=0;
         String str="0123456789";
         char ch[]=s.toCharArray();
         for(int i=0;i<s.length();i++)
         {
        	 if(ch[i]>='0'&& ch[i]<='9')
        	 {
        		 c++;
        	 }
         }
         System.out.println(c);
	}

}
