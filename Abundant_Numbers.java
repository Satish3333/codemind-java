import java.util.Scanner;
class main
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        for(int i=1;i<n;i++){
            if (n%i==0)
            c+=i;
        }
        if (c>n)
        System.out.println("True");
        else
        System.out.println("False");
        
        
    }
}