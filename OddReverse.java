import java.util.*;
class OddReverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String w[]=s.split(" ");
        for(int i=0;i<w.length;i++)
        {
           if(i%2==0)
           {
               StringBuffer sb=new StringBuffer(w[i]);
               StringBuffer re=sb.reverse();
               System.out.print(re+" ");
           }
           if(i%2!=0)
           {
               System.out.print(w[i]+" ");
           }
        }
    }
}
