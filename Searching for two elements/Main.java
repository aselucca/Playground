import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      int as=in.nextInt();
      int arr[]=new int[as];
      for(int i=0;i<=as-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int se1=in.nextInt();
      int se2=in.nextInt();
      int e1_i=-1;
      int e2_i=-1;
      for(int i=0;i<=as-1;i++)
      {
        if(se1==arr[i])
        {
          e1_i=i;
        }
        if(se2==arr[i])
        {
          e2_i=i;
        }
      }
      System.out.println(e1_i);
      System.out.println(e2_i);
    }
}