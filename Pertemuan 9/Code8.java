// MENANGANI EXCEPTION DENGAN METODE OVERLOADED(Page 5-6)
public class Code8
{
    double method(int i) throws Exception
    {
        return i/0;
    }
    boolean method(boolean b)
    { 
        return !b;
    }
    static double method(int x, double y) throws Exception
    {
        return x + y;
    }
    static double method(double x, double y)
    { 
        return x + y - 3;
    }
    public static void main(String[] args)
    {
        Code8 mn = new Code8();
        try
        {
            System.out.println(method (10, 20.0));
            System.out.println(method (10.0, 20));
            System.out.println(method (10.0, 20.0));
            System.out.println(mn.method(10));
        }
        catch (Exception ex)
        {
            System.out.println("exception occure: "+ ex);
        }
    }
}