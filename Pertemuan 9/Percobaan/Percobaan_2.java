package Percobaan;
public class Percobaan_2
{
    public void sigma(int n)
    {
        int count = 0;
        for(int i=0; i<=n; i++)
        {
            count = i*2;
            if(i == n)
            {
                System.out.print(i+"x + "+count);
            }
        }
    }
    public static void main(String args[])
    {
        Percobaan_2 si = new Percobaan_2();
        si.sigma(3);
    
    }
}