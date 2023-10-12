import javax.swing.*;
import java.awt.*;

public class Dodaj_Zleceniodawce extends JFrame {

JPanel panel1,panel2,panel3;
    public Dodaj_Zleceniodawce()
    {
        setSize(400, 400);
        setLayout(new BorderLayout());
        setExtendedState(MAXIMIZED_BOTH);

        panel1=stworzPanel1();
        panel2=stworzPanel2();
        panel3=stworzPanel3();
    }
private JPanel stworzPanel1()
{
    JPanel panel=new JPanel();
    panel.setBackground(Color.RED);
    panel.setPreferredSize(new Dimension(100,100));
    add(panel,BorderLayout.WEST);

    return panel;
}

private JPanel stworzPanel2()
{
    JPanel panel=new JPanel();
    panel.setBackground(Color.BLACK);
    panel.setPreferredSize(new Dimension(100,100));
    add(panel, BorderLayout.NORTH);
    return panel;
}
private JPanel stworzPanel3()
    {
        JPanel panel=new JPanel();
        panel.setBackground(Color.ORANGE);
        add(panel, BorderLayout.CENTER);
        return panel;
    }

}
