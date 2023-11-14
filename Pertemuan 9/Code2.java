class Animal extends Exception
{}
class Mammel extends Animal
{}
public class Code2
{
    public static void main(String[] args)
    {
        try
        {
            throw new Mammel();
        }
        catch(Mammel m)
        {
            System.err.println("It is mammel");
        }
        catch(Animal a)
        {
            System.err.println("It is animal");
        }
    }


}