import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int val = n;
	    for(int cr = 1; cr <= n; cr++)
	    {
            // Handle numbers for each row
	        for(int cc = val; cc >= 1; cc--)
	        {
	            System.out.print(cc);
	        }
	        val--;
	        System.out.println();
	    }
	}
}