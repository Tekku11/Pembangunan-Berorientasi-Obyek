import javax.swing.*;
import java.awt.*;
class Null extends JFrame
{
    Checkbox unta = new Checkbox("nama kamu siapa");
    Checkbox kuda = new Checkbox("nama kamu anton");
    Checkbox kuda2 = new Checkbox("nama kamu wong");
    CheckboxGroup checkboxGroup = new CheckboxGroup();
    Null()
    {
        super("PROGRAM MENGHITUNG ZAKAT");
        setLocation(200, 100);
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void objek()
    {
        getContentPane().setLayout(null);
        getContentPane().add(unta);
        getContentPane().add(kuda);
        getContentPane().add(kuda2);
        unta.setBounds(30, 90, 150, 20);
        kuda.setBounds(30, 120, 150, 20);
        kuda2.setBounds(30, 150,150, 20);
        setVisible(true);
    }
    public static void main(String args[])
    {
        Null ZZ = new Null();
        ZZ.objek();
    }
}