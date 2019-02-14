import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int b = in.nextInt();
	    int e = in.nextInt();
	    System.out.print(pon(b, e));
	}
	public static int pon(int b, int e)
	{
	    int power = 1;
	    while(e >= 1)
	    {
	        power = power * b;
	        e--;
	    }
	    return power;
	}
}