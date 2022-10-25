import java.util.Scanner;
class k
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0,b=1,c=0,f=0;
        while(c<n){
            c=a+b;
            if(c==n)
            {
            f=1;
            break;
            }
            else
            {
            a=b;
            b=c;
            }
        }
        if(n==0 || f==1)
        System.out.println("True");
        else
        System.out.println("False");
        
    }
}