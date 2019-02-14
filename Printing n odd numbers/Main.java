import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int a=1;a<=2*n;a=a+1)
      {
        if(a%2 != 0)
          System.out.println(a);
      }// Type your code here
	}
}