import java.util.Scanner;
import java.lang.Math;
class main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int  p=s.nextInt();
        int  r=s.nextInt();
        int  t=s.nextInt();
        int a=(p*t*r)/100;
        System.out.println(a);
    }
}