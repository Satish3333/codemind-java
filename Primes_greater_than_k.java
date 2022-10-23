import java.util.Scanner;
class l
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
        int t=0;
        int [] l=new int[n];
        for(int i=0;i<n;i++){
            l[i]=s.nextInt();
        }
        int k=s.nextInt();
        for (int i=0;i<n;i++){
            if (l[i]>=k && prime(l[i])==1)
            t+=1;
        }
        System.out.println(t);
    }
}