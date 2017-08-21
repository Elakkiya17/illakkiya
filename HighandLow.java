import java.util.*;
class HighandLow
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];int m=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int l=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>m)
            {
                m=a[i];
            }
           if(a[i]<=l)
            {
                l=a[i];
                
            }
        }
        System.out.println(m+","+l);
    }
}
