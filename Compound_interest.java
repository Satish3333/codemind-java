import java.util.Scanner;
import java.lang.Math;
class main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double p=s.nextDouble();
        double r=s.nextDouble();
        double t=s.nextDouble();
        double a=0.0;
        a=p*(Math.pow((1+r/100),t));
        System.out.printf("%.2f",a);
    }
}