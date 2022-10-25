import java.util.Scanner;
class k
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a,r,c=0;
        a=n*n;
        while (a!=0){
            r=a%10;
            a=a/10;
            c=c+r;
        }
        if(c==n)
        System.out.println("Neon Number");
        else
        System.out.println("Not Neon Number");
        
    }
}