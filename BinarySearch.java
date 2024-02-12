import java.util.*;
public class BinarySearch 
{

    public static void sort(int arr[])      //Sorting the array
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    //Binary Search Implementation

    public static int Search(int arr[], int num)
    {
        Scanner sc=new Scanner(System.in);
        // num=sc.nextInt();
        int high=arr.length-1;
        int low=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(num==arr[mid])
            {
                return mid;
            }

            else if(num<arr[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" elements for your Array: ");
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }

        //Displaying the Array

        System.out.println("Your Array is: ");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }

        //Sorting the Array
        int temp;
        for(int i=0; i<size; i++)
        {
            for(int j=0; j<size-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }  
        }

        System.out.println("Your sorted array is: ");
        sort(arr);

        System.out.println("Enter the number to be searched: ");
        int num=sc.nextInt();
        int result=Search(arr, num); 

        if(result==-1)
        {
            System.out.println("Element not found.");
        }
        else
        {
            System.out.println("Element found at index: "+result);
        }
        
    }
}
