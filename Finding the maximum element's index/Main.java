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
    maxindex(arr,n);
  }
  public static void maxindex(int arr[],int n)
  {
    int max=0;
    int index=0;
    max=arr[0];
    for(int i=0;i<n;i++)
    {
      if(max < arr[i])
      {
        max=arr[i];
        index=i;
      }
    }
    System.out.print(+index);
  }
    //Try your code here
  }
