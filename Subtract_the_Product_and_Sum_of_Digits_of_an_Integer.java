import java.util.Scanner;
class k
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r,c=0,d=1;
        while (n!=0){
            r=n%10;
            n=n/10;
            c=c+r;
            d=d*r;
        }
        System.out.println(d-c);
    }
    
}