import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int [] l=new int[50];
        for(int i=0;i<n;i++){
            l[i]=s.nextInt();
        }
        int k=s.nextInt();
        int c=0;
        for(int i=1;i<n;i++){
            if (l[i]==k){
                c=1;
                break;
            }
        }
        if(c==1)
        System.out.println("True");
        else
        System.out.println("False");
    }
}