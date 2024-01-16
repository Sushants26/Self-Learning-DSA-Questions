import java.util.*;
public class BiggestElement {
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
        
                System.out.println(arr[size-1]);
            
        
    }
}
