import java.util.*;
public class BiggestElement2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" elements: ");
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Your elements are: ");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Your array is sorted now and looks like this: ");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //Method 1 to find the biggest element
         int big=0;
         for(int i=0; i<size-1; i++)
         {
             if(arr[i]>arr[i+1])
             {
                 big=arr[i];
             }
             else{
                 big=arr[i+1];
             }
         }
         System.out.println("Biggest element is: "+big);
//////////////////////////////////////////////
        
        
        //Method 2 to find biggest element
        // int big=arr[0];
        // for(int i=0; i<size; i++)
        // {
        //     if(arr[i]>big)
        //     {
        //         big=arr[i];
        //     }
        // }
        // System.out.println("Biggest element is: "+ big);
    }
}
