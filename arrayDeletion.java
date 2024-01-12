import java.util.*;
class arrayDeletion
{
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
        System.out.println("The elements of your Array are: ");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the index of the element that you want to delete: ");
        int index=sc.nextInt();
        int brr[]=new int[size-1];
        for(int i=0; i<size; i++)
        {
            if(i<index)
            {
                brr[i]=arr[i];
            }
            else if(i==index)
            {
                continue;
            }
            else
            {
                brr[i-1]=arr[i];
            }
        }
        System.out.println("Your new array is: ");
        for(int i=0; i<size-1; i++)
        {
            System.out.print(brr[i]+" ");
        }
    }
}