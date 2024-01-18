import java.util.*;
public class Find_Peak_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int max=0;
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("The peak element is: "+max);
    }
}
