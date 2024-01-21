import java.util.Scanner;
public class IgnoreCase {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name1="Sushant";
        String name2="Singh";
        String name3="Sushant";
        String name4="singh";
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        System.out.println(name2.equalsIgnoreCase(name4));
    }
}
