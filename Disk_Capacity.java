import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        c=c*512;
        b=c*b;
        a=a*2*b;
        System.out.println(a);
    }
    
}