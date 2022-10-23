import java.util.Scanner;
class main{
    public static int pal(int n){
        int r,c=0,t;
        t=n;
        while (n!=0){
            r=n%10;
            n=n/10;
            c=c*10+r;
        }
        if(c==t)
        return 1;
        else
        return 0;
    }
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int c=0;
        
        int [] l=new int[a];
        for(int i=0;i<a;i++){
            l[i]=s.nextInt();
        }
        for(int i=0;i<a;i++){
            if (pal(l[i])==1)
            c+=1;
        }
    System.out.println(c);
    }
}