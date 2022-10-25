import java.util.Scanner;
class k
{
    public static int fac(int n){
        int c=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
            c+=i;
        }
        return c;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(fac(a)==b)
        System.out.println("Amicable");
        else
        System.out.println("Not Amicable");
        
    }
}