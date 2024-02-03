import java.util.*;
public class Dupli_Check
 {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int arr[]={1,1,6,9,2,3,9,3,5,7,7};

        Arrays.sort(arr);
        ArrayList<Integer> list =new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]);
        }
         for(int i=1;i<list.size();i++)
         {
            if(list.get(i)==list.get(i-1))
            {
                list.remove(i);
            }
        }
         int arr1[]=new int[list.size()];

         for(int i=0;i<list.size();i++)
         {
            arr1[i]=list.get(i);
            System.out.print(arr1[i]+ " ");
        }
    }   
}
