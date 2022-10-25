import java.util.Scanner;
class main
{
    public static int reverse(int n){
        int r,c=0;
        while (n>0){
            r=n%10;
            n=n/10;
            c=c+r;
        }
        return c;
        
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        while (a>9){
            a=reverse(a);
        }
        System.out.println(a);
    }
}