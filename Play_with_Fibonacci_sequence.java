import java.util.Scanner;
class main
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0,b=1,c;
        System.out.print(a+" "+b);
        for(int i=2;i<=n-1;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
        
    }
}