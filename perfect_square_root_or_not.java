import java.util.Scanner;
import java.lang.Math;
class k
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double n=s.nextDouble();
        double a=0.0;
        a=Math.pow(n,0.5);
        if(n%a==0)
        System.out.println("True");
        else
        System.out.println("False");
    }
}