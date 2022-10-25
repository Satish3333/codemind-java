import java.util.Scanner;
class main
{
    public static int pp(int x){
        int p=1;
        for(int i=1;i<=x;i++){
            p=p*i;
        }
        return p;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t,a;
        for( int i=0;i<n;i++){
            a=s.nextInt();
            t=pp(a);
            System.out.println(t);
        }
        
    }
}