import java.util.Scanner;
class main{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int t=0;
        for(int i=a;i<=b;i++){
            if(i%c==0)
            t+=1;
        }
        System.out.print(t);
    }
}