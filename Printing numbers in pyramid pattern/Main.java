import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int val = 1;
	    for(int cr = 1; cr <= n; cr++)
	    {
            // Handle space for each row
	        for(int space = 1; space <= (n - cr); space++){
	            System.out.print(" ");
	        }
            // Handle numbers for each row
	        for(int cc = 1; cc <= cr; cc++)
	        {
	            System.out.print(val + " ");
	            val++;
	        }
	        System.out.println();
	    }
	}
}