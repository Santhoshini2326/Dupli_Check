import java.util.*;
public class Insertion_Sort 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the array:");
        int n=sc.nextInt();

        int arr[]=new int[n];
        int temp=0;

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
         for (int i = 1; i < n; ++i) 
         {
            int num = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > num) 
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = num;
        }
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println("The array is "+arr[i]);
        }
    }    
}
