import java.util.*;
public class ElementDeletion {
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
        System.out.println("Enter the element that you want to delete: ");
        int del=sc.nextInt();
        int brr[]=new int[size];
        for(int i=0; i<size; i++)
        {
            if(arr[i]==del)
            {
                brr[i-1]=arr
            }
        }
    }
}
