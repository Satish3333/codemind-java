import java.util.Scanner;
class main
{
    public static int prime(int a){
        int c=0;
        for(int i=1;i<=a;i++){
            if (a%i==0)
            c+=1;
        }
        if (c==2)
        return 1;
        else
        return 0;
    }
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] l=new int[n];
        for(int i=0;i<n;i++){
            l[i]=s.nextInt();
        }
        int d=0;
        for (int i=0;i<n;i++){
            if (prime(l[i])==1)
            d+=1;
        }
        System.out.println(d);
    }
}