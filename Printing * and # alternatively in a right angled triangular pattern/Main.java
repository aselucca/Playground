import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int m=0;
      for(int cr=1;cr<=n;cr++)
      {
        for(int cc=1;cc<=cr;cc++)
        {
          if(m==0)
          {
            System.out.print("*");
            m=1;
          }
          else
          {
            System.out.print("#");
              m=0;
          }
        }
        System.out.print("\n");
      }
  		// Type your code here
    }
}