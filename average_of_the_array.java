import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double n=s.nextDouble();
        double [] l=new double[50];
        double c=0.0;
        for(int i=0;i<n;i++){
            l[i]=s.nextDouble();
            c+=l[i];
        }
        System.out.printf("%.2f",(c/n));
        
    }
}