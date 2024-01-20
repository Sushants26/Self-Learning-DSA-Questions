import java.util.*;
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num1=sc.nextInt();
        int num2=0;
        int digit;
        while(num1!=0)
        {
                digit=num1%10;
                num2=num2*10+digit;
                num1/=10;
        }
        System.out.println("Reversed number is: "+num2);
    }
   
}
