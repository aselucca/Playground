import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int pd=1;
      for(int a=1;a<=n;++a)
      {
        pd=pd*a;
      }
       System.out.println(pd); // Type your code here
	}
}