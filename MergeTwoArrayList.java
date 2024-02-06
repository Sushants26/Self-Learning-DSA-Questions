import java.util.*;
public class MergeTwoArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList arr1= new ArrayList();
        arr1.add(5);
        arr1.add(8);
        arr1.add(3);
        arr1.add(7);

        System.out.println(arr1);

        ArrayList arr2=new ArrayList();
        arr2.add(99);
        arr2.add(55);
        arr2.add(22);
        arr2.add(33);

        System.out.println(arr2);

        System.out.println("Combined ArrayList is: ");
        arr1.addAll(arr2);

        System.out.println(arr1);

        Collections.sort(arr1);
        System.out.println("Your sorted list is: "+arr1);
    }
}
