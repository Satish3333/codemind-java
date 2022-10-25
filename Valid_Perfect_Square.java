import java.util.Scanner;
import java.lang.Math;
class k
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double  n=s.nextDouble();
        double b;
        for(int i=0;i<n;i++){
            double a=s.nextDouble();
            b=Math.pow(a,0.5);
            if (a%b==0){
                System.out.println("True");
            }
            else
            System.out.println("False");
        }
    }
}