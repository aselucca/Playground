import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int reverse=0;
      while(n != 0)
      {
          reverse = reverse * 10;
          reverse = reverse + n%10;
          n = n/10;
      }
      int sd=(reverse/10)%10;
      System.out.println(sd);// Type your code here
	}
}