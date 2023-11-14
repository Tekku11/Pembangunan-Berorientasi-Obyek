// MEMBUAT USER DEFINED EXCEPTION # Page 10

class WrongInputException extends Exception
{
    WrongInputException(String s)
    {
        super(s);
    }
}
class Input
{
    void method() throws WrongInputException
    {
        throw new WrongInputException("Wrong input");
    }
}
class Code14
{
    public static void main(String[] args)
    {
        try
        {
            new Input().method();
        }
        catch(WrongInputException wie)
        {
            System.out.println(wie.getMessage());
        }
    }
}