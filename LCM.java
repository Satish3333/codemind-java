import java.util.Scanner;
class k
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int x,i=2,t;
        if (a>=b){
            a=b;
            x=a;
            b=x;
            
        }
        t=b;
        while(b%a!=0){
            b=t*i;
            i+=1;
        }
        System.out.println(b);
    }
}