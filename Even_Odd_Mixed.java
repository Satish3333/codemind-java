import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r,c=0,a=0,b=0;
        while (n>0){
            r=n%10;
            n=n/10;
            if (r%2==0)
            a+=1;
            else
            b+=1;
        }
        if (b==0)
        System.out.print("Even");
        else if (a==0)
        System.out.print("Odd");
        else
        System.out.print("Mixed");

    }
}