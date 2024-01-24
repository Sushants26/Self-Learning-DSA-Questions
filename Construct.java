class Demo1
{
    int a,b;

    public Demo1()
    {
        System.out.println("Parent class constructor");
    }
    public Demo1(int x, int y)
    {
        System.out.println("Parameterized parent class constructor");
        a=x;
        b=y;
    }
}
class Demo2 extends Demo1
{
    int m,n;
    public Demo2()
    {
        super();
        System.out.println("Child class constructor");
    }

    public Demo2(int x, int y)
    {
        System.out.println("Parametirzed child class constructor");
        m=x;
        n=y;
    }
}

public class Construct
{
    public static void main(String[] args) {
        Demo2 d=new Demo2();
    }
}