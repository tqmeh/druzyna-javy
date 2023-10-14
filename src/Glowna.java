import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;

public class Glowna extends JFrame {

    JPanel panel1,panel2;
    JButton bNowy;
    public Glowna()
    {
        setSize (400,200);

        setTitle("Logowanie");
        setExtendedState(MAXIMIZED_BOTH);

        panel1=new JPanel();
        panel2=new JPanel();

        bNowy=new JButton(Main.resourceBundle.getString("nowy")+":");
        bNowy.setPreferredSize(new Dimension(100,20));
        panel1.add(bNowy);
        bNowy.addActionListener(e ->{
            Dodawanie_Zlecenia dodawnie=new Dodawanie_Zlecenia();
            dodawnie.setVisible(true);
        });





        panel1.setBackground(Color.red);
        panel2.setBackground(Color.blue);
        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        add(panel1,BorderLayout.WEST);
        add(panel2,BorderLayout.NORTH);


    }
}
