import javax.swing.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class Logowanie extends JFrame{
    JLabel lLogin,lHaslo,lJezyki;
JTextField tWpiszLogin;
JPasswordField tWpiszHaslo;
JButton bZaloguj,bRejestruj, bPolski, bAngielski;
JComboBox cJezyki;
String[] jezyki={"Polski","Angielski"};
ImageIcon flagaPL, flagaUK;

    public Logowanie()
    {
        setSize (400,300);
        setLayout(null);
        setTitle("Logowanie");

        lJezyki=new JLabel(Main.resourceBundle.getString("jezyk")+":");
        lJezyki.setBounds(120,20,100,20);
        add(lJezyki);

        bPolski=new JButton("Polski");
        bPolski.setBounds(160,20,80,20);
        add(bPolski);
        bPolski.addActionListener(e -> {
            ResourceBundle.clearCache();
            Locale.setDefault(Main.locale_pl_PL);
            Main.resourceBundle = ResourceBundle.getBundle("bundle", Main.locale_pl_PL);
            invalidate();
            validate();
            repaint();
            setVisible(true);
            System.out.println("Polski");
            System.out.println("Resource bundle po naciśnięciu Polski: "+Main.resourceBundle.getLocale() );
        });

        bAngielski=new JButton("Angielski");
        bAngielski.setBounds(250,20,100,20);
        add(bAngielski);
        bAngielski.addActionListener(e->{
            ResourceBundle.clearCache();
            Locale.setDefault(Main.locale_en_UK);
            Main.resourceBundle = ResourceBundle.getBundle("bundle", Main.locale_en_UK);
            invalidate();
            validate();
            repaint();
            setVisible(true);
            System.out.println("Angielski");
            System.out.println("Resource bundle po naciśnięciu Angielski: "+Main.resourceBundle.getLocale());
        });

        /*
        cJezyki=new JComboBox(jezyki);
        cJezyki.setBounds(250,20,100,20);
        add(cJezyki);
        cJezyki.addActionListener(e -> {
            String jezykiValue = (String)cJezyki.getSelectedItem();
            if(jezykiValue=="Polski"){ //TO-FINISH WRITING THIS!!!!
                ResourceBundle.clearCache();
                Locale.setDefault(locale_pl_PL);
                resourceBundle = ResourceBundle.getBundle("bundle", locale_pl_PL);
            } else {
                ResourceBundle.clearCache();
                Locale.setDefault(locale_en_UK);
            }
            System.out.println(jezykiValue);
        });
        */

        lLogin=new JLabel(Main.resourceBundle.getString("login")+":");
        lLogin.setBounds(100,60,100,20);
        add(lLogin);

        lHaslo=new JLabel(Main.resourceBundle.getString("haslo")+":");
        lHaslo.setBounds(80,85,100,20);
        add(lHaslo);

        tWpiszLogin=new JTextField(" ");
        tWpiszLogin.setBounds(150,60,100,20);
        add(tWpiszLogin);

        tWpiszHaslo=new JPasswordField();
        tWpiszHaslo.setBounds(150,85,100,20);
        add(tWpiszHaslo);



        bZaloguj=new JButton(Main.resourceBundle.getString("zaloguj"));// przycisk do logowania
        bZaloguj.setBounds(75,150,100,20);
        add(bZaloguj);
       bZaloguj.addActionListener(e ->{
           Glowna glowna=new Glowna();
           glowna.setVisible(true);
           dispose();
       });

        bRejestruj=new JButton(Main.resourceBundle.getString("rejestruj"));// przycisk do nowej rejestracji uzytkownika
        bRejestruj.setBounds(175,150,100,20);
        add(bRejestruj);
       bRejestruj.addActionListener(e -> {
           Rejestruj rejestruj=new Rejestruj();
           rejestruj.setVisible(true);
       });


    }
}
