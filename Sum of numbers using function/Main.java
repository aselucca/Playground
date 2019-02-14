import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int add=0;
      for(int m=0;m<=n;m++)
      {
        add=add+m;
      }
      System.out.println(add);
	}
}