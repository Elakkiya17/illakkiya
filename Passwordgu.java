import java.util.*;
class Passwordgu
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        int sum=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<l;i++)
        {
           sum=sum+(int)ch[i];  
        }
        int a=sum/l;
        char c=(char)a;
        System.out.println(c);
    }
}
