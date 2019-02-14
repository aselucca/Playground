import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in  = new Scanner(System.in);
	    int n = in.nextInt();
	    for(int cr = 1; cr <= n; ++cr)
	    {
	        for(int space = 1; space <=  n - cr; space++)
	        {
	            System.out.print(" ");
	        }
	        for(int cc = 1; cc <= (2 * cr - 1); ++cc)
	        {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
}