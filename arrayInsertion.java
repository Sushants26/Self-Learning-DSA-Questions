import java.util.*;
public class arrayInsertion {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt(); 
        int arr[]=new int[size];
        System.out.println("Enter "+size+" elements: ");

        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("List of elements are: ");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("Enter the index where you want to insert new element: ");
        int newIndex=sc.nextInt();
        System.out.println("Enter the new value to be inserted: ");
        int p=sc.nextInt();
        int arr1[]=new int[size+1];
        for(int i=0; i<size+1; i++)
        {
            if(i<newIndex)
            {
                arr1[i]=arr[i];
            }
            else if(i==newIndex)
            {
                arr1[i]=p;
            }
            else
            {
                arr1[i]=arr[i-1];
            }
        }
            System.out.println("The new Array is: ");
            for(int i=0; i<size+1; i++)
            {
                System.out.print(arr1[i]+" ");
            }
        }
    }

