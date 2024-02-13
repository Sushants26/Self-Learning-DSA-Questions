import java.util.*;
public class FibonacciRecursion {

    public static int fibonacci(int num)
    {
        int result=0;
        if(num<=1)
        {
            return num;
        }
        else
        {
            result= fibonacci(num-1)+fibonacci(num-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int result= fibonacci(num);
        System.out.println("Your result is: "+result);
    }
}
