import java.util.Scanner;
class Main 
{
    public static void left_rotate_even_elem(int arr_size, int arr[], int no_of_rotation)
    {
       int feei = 1;
       int leei;
       if(arr_size % 2 == 0)
       {
           leei = arr_size - 1;
       }
       else
       {
           leei = arr_size - 2;
       }
       for(int rotation = 1; rotation <= no_of_rotation; rotation++)
       {
           int temp = arr[feei];
           for(int index = 3; index < arr_size; index = index + 2)
           {
               arr[index - 2] = arr[index];
           }
           arr[leei] = temp;
       }
    }
    public static void right_rotate_odd_elem(int arr_size, int arr[], int no_of_rotation)
    {
       int foei = 0;
       int loei;
       if(arr_size % 2 == 1)
       {
          loei = arr_size - 1;
       }
       else
       {
          loei = arr_size - 2;
       }
       for(int rotation = 1; rotation <= no_of_rotation; rotation++)
       {
           int temp = arr[loei];
           for(int index = (loei - 2); index >= 0; index = index - 2)
            {
               arr[index + 2] = arr[index];
           }
           arr[foei] = temp;
       }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int index = 0; index <= (arr_size - 1); index++)
        {
            arr[index] = in.nextInt();
        }
        int no_of_rotation = in.nextInt();
        left_rotate_even_elem(arr_size, arr, no_of_rotation);
        right_rotate_odd_elem(arr_size, arr, no_of_rotation);
    
    for(int index = 0; index <= (arr_size - 1); index++)
        {
            System.out.print(arr[index]+" ");
        }
    }
}