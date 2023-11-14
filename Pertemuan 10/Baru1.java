class MyClass
{
    int height;
    MyClass()
    {
        System.outprintln("bricks");
        height = 0;
    }
    MyClass(int i)
    {
        System.out.prinln("Building new House that is "+i+" feet tall");
        height = i;
    }
    void info(String s)
    {
        System.out.println(s +": House is "+ height + " feet tall");
    }
}

public class Baru1
{
    public static void main(String[] args)
    {
        MyClass t = new MyClass (0);
        t.info();
        t.info("overloaded method");
        // Overloaded constructor:
        new MyClass();
    }
}