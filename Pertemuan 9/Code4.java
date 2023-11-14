public class Code4
{
    static void f()
    {
        throw new RuntimeException("From f()");
    }
    static void g()
    { 
        f();
    }
    public static void main(String[] args)
    { 
        g();
    }
}