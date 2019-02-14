import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      for(int cr=1;cr<=n;cr++)
      {
        for(int cc=1;cc<=cr;cc++)
        {
          System.out.print(cr);
        }
        System.out.print("\n");
    }
}
}