import java.util.Scanner;
class k
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int x,t=0;
        if(a>b){
            a=b;
            x=b;
            a=x;
        }
        for(int i=1;i<=b;++i){
            if(a%i==0 && b%i==0)
            t=i;
        }
        System.out.println(t);
    }
}