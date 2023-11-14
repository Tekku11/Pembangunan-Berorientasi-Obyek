import java.awt.*;
class Border extends Frame
{
    public static void main(String args[])
    {
        Border bld = new Border();
        bld.setLayout(new BorderLayout(10, 50));
        bld.add(new Button("NORTH"), BorderLayout.NORTH);
        bld.add(new Button("SOUTH"), BorderLayout.SOUTH);
        bld.add(new Button("EAST"), BorderLayout.EAST);
        bld.add(new Button("WEST"), BorderLayout.WEST);
        bld.add(new Button("CENTER"), BorderLayout.CENTER);
        bld.setSize(500, 500);
        bld.setVisible(true);

    }
}