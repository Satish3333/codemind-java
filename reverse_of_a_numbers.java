import java.util.Scanner;
class k
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r,c=0;
        while(n!=0){
            r=n%10;
            n=n/10;
            c=c*10+r;
        }
        System.out.println(c);
    }
}