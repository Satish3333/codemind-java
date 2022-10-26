import java.util.Scanner;
class main
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        for(int i=1;i<=m;i++){
            if (i%2==1)
            System.out.println(n+ " x "+ i+ " = "+ (n*i));
            
        }
        
      
        
    }
}