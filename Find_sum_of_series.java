import java.util.Scanner;
class main
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double  n=s.nextDouble();
        double c=0.0;
        for(double i=1;i<=n;++i){
            c=c+(1/i);
        }
        System.out.printf("%.2f",c);
    }
}