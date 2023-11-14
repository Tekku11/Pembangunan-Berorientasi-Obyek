public class Fungsi_2 // Program yang menggunakan fungsi method
{
    public static void test(int data) //Fungsi atau method (test)
    {
        int nilai=1;
        if(data==0 || data==1)
        {
            nilai=1;
        }
        else
        {
            for(int i=1; i<=data; i++)
            {
                nilai*=i;
            }
        }
        System.out.println(data+"! = "+nilai);
    }
    public static void main(String args[])
    {
        Fungsi_2 f5 = new Fungsi_2();
        f5.test(4);
        f5.test(5);
    }
}
        