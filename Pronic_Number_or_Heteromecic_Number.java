import java.util.Scanner;
class k
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int f=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if(i*j==n)
            f=1;
            break;
            }
        }
        if (f==1)
        System.out.println("YES");
        else
        System.out.println("NO");
        
    }
}