import java.util.*;
public class Single_digit 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the array:");
        int n= sc.nextInt();
        int result[]=new int[1];
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0,temp=0;

        for(int j=0;j<arr.length-1;j=j+2)
        {
                sum =sum+arr[j]+arr[j+1];
        } 
        int j=0;
        
        if(arr.length % 2==0 && j<=result.length)
        {
            result[j]=sum;
            System.out.println("The elment is:"+ result[j]);
            j++;
        }
        else
        {
            result[j]=sum+arr[arr.length-1];
            System.out.println("The elment is:"+ result[j]);
            j++;
        }
    }
}
