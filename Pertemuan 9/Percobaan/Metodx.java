public class Metodx
{
    public double luas_lingkaran(int diameter)
    {
        int jari2=diameter/2;
        double luas=Math.PI * Math.pow(jari2,2);
        return luas;
    }
    public void hitungLuas_lingkaran(int jari2)
    {
        double luas=Math.PI * Math.pow(jari2,2);
        System.out.println(luas);
    }
    public static void main(String[]args)
    {
        Metodx mt = new Metodx();
        mt.hitungLuas_lingkaran(10);
        System.out.print(mt.luas_lingkaran(20));
        System.exit(0);
    }
    
}
