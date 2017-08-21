import java.util.*;
class Captialfirstlet
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String w[]=s.split(" ");
        String frc=" ";
        for(int i=0;i<w.length;i++)
        {
            int l=w[i].length();
            String fr=w[i].substring(0,1);
            String cap=fr.toUpperCase();
            String la=w[i].substring(1);
             frc=cap+la;
            System.out.print(frc+" ");
        }
    }
}
