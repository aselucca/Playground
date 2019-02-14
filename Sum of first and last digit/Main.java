import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int ld=n%10;
      int fd=n;
      while(fd>=10)
      {
        fd=fd/10;
      }
      int sum=ld+fd;
      System.out.println(sum);// Type your code here
	}
}