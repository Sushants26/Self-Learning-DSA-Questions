import java.util.Scanner;

public class Pow {
    public static double myPow(double x, int n) {
        return Math.pow(x, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double x = sc.nextDouble();

        System.out.println("Enter the power: ");
        int n = sc.nextInt();

        double result = myPow(x, n);

        System.out.println("Result: " + result);
    }
}
