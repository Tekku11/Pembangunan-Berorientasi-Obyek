public class SegiEmpat
{
    public void segiempat(int panjang, int lebar)
    {
        double luas;
        double keliling;
        luas = panjang*lebar;
        System.out.println("-------------------------------");
        System.out.println("Panjang Segi Empat\t= "+panjang);
        System.out.println("Lebar Segi Empat\t= "+lebar);
        System.out.println("Luas Segi Empat\t\t= "+luas);
    }
    public static void main(String args[])
    {
        SegiEmpat se = new SegiEmpat();
        se.segiempat (10,5);
    }
}
