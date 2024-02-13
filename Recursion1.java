import java.util.*;
public class Recursion1
 {

    public static int factorial(int num)
    {
    int result=0;
    
        if(num==0 || num==1)
        {
            return 1;
        }
        else
        {
            result= num * factorial(num-1);
        }
        return result;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want to know: ");
        int num=sc.nextInt();
        int result= factorial(num);
        System.out.println("The Factorial is: "+ result);
    }
}
