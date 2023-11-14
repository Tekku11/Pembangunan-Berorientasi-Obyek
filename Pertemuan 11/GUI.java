import javax.swing.*;
import java.awt.*;

class GUI extends JFrame
{
    Button cb1 = new Button("Pilih A");
    Button cb2 = new Button("Pilih B");

    GUI()
    {
        setTitle("Program GUI Pertamaku");
        setLocation(200, 100);
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void objek()
    {
        getContentPane().setLayout(new FlowLayout());
        getContentPane().setBackground(Color.YELLOW);
        cb1.setBackground(Color.MAGENTA);
        getContentPane().add(cb1);
        getContentPane().add(cb2);
        setVisible(true);
    }
    public static void main(String args[])
    {
        GUI ZZ = new GUI();
        ZZ.objek();
    }

}