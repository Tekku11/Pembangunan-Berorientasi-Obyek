// MENANGANI PENGECEKAN EXCEPTIONS (Page 6)
public class Code9
{
    public static void main(String args[])
    {
        try
        {
            throw new Exception("throwing an exception");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }   
}