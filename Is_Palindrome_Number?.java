import java.util.Scanner;
class main
{
  public static void main(String args[])
  {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int r,c=0,t;
      t=n;
      while (n!=0){
          r=n%10;
          n=n/10;
          c=(c*10)+r;
      }
      if (c==t)
      System.out.println(2);
      else
      System.out.println(1);
      
  }

}