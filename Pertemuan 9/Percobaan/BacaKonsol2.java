package Percobaan;
public class BacaKonsol2
{
    public static void main(String args[])
    {
        System.out.print("datal = ");
        int datal = InputKonsole.readInt();
        System.out.print("data2 = ");
        int data2 = InputKonsole.readInt();
        int data3 = datal + data2;
        System.out.println("datal + data2 = " + data3);
    }
}