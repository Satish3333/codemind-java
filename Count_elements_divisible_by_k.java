import java.util.Scanner;
class main
{
  public static void main(String args[])
  {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int m=s.nextInt();
      int c=0;
      int [] l=new int[n];
      for (int i=0;i<n;i++){
          l[i]=s.nextInt();
      }
      for (int i=0;i<n;i++){
          if (l[i]%m==0)
          c+=1;
      }
      System.out.println(c);
      
      
  }

}