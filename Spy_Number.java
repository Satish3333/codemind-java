import java.util.Scanner;
class k
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r,c=0,t=1;
        while(n!=0){
            r=n%10;
            n=n/10;
            c=c+r;
            t=t*r;
        }
        if (c==t)
        System.out.println("Spy Number");
        else
        System.out.println("Not Spy Number");
    }
}