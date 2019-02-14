import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<=(n-1);i++)
    {
      arr[i]=in.nextInt();
    }
    perfection(arr,n);
  }
  public static void perfection(int arr[],int n)
  {
    int x=arr[0]+arr[1]+arr[2];
    int y=arr[3]+arr[4]+arr[5];
    if(x==y)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
  }
    //Try your code here
  }
