import java.util.*;
class Poweroftwo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n!=1)
        {
            while(n%2==0)
            {
               n=n/2; 
            }
            if(n==1)
             System.out.print("yes");
             else
            System.out.print("no");

            
        }
        
    }
}
