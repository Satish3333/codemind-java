import java.util.Scanner;
class k
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int c=0;
        for(int i=1;i<a;i++){
            if (a%i==0){
                c=c+i;
            }
        }
        if (c==a)
        System.out.println("True");
        else
        System.out.println("False");
    }
}