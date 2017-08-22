import java.util.*;
class AlphabetSequence
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       char ch[]={'A','B','C','D','E','F','G','H','I','J','K','L','M',
       'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
       int n=sc.nextInt();
       if(n>=1 && n<=26)
       {
        System.out.println(ch[n-1]);
       }
    }
}
