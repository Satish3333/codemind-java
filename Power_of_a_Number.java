import java.util.Scanner;
import java.lang.Math;
class o
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        double b=s.nextDouble();
        double c=s.nextDouble();
        double d;
        d=Math.pow(a,b);
        System.out.printf("%.0f",d%c);
    }
}
