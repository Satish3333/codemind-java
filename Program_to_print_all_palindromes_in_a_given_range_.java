import java.util.Scanner;
class main
{
    public static int pali(int n){
        int r,c=0,t;
        t=n;
        while (n>0){
            r=n%10;
            n=n/10;
            c=c*10+r;
        }
        if (c==t)
        return 1;
        else
        return 0;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=a;i<b;i++){
            if (pali(i)==1)
            System.out.print(i+" ");
        }
    }
}