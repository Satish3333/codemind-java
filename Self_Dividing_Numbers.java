import java.util.Scanner;
class k
{
    public static int rev(int n){
        int r;
        int t;
        t=n;
        while (n!=0){
            r=n%10;
            n=n/10;
            if (r==0 || t%r!=0)
            return 0;
        }
        return 1;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        for(int i=x;i<=y;i++){
            if (rev(i)==1)
            System.out.print(i+" ");
        }
        
    }
}