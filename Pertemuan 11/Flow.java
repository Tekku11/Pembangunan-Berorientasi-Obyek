import java.awt.*;
class Flow extends Frame
{
    public static void main(String args[])
    {
        Flow fld = new Flow();
        fld.setLayout(new FlowLayout());
        fld.add(new Button("ONE"));
        fld.add(new Button("TWO"));
        fld.add(new Button("THREE"));
        fld.setSize(300, 300);
        fld.setVisible(true);

    }
}