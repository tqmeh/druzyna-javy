import javax.swing.*;
import java.awt.*;

public class Dodaj_Zleceniodawce extends JFrame {
JLabel lNazwaSkroconaZleceniodawcy,lZleceniodawca,lMiasto,lKodPocztowy,lUlica,lUkosnik,lNip;
JTextField tNazwaSkroconaZleceniodawcy,tMiasto,tKodPocztowy,tUlica,tNumerDomu,tNumerMieszkania,tNip,tKraj/*usunac kraj jak zrobi sie liste*/;
JButton bZapisz,bWyjscie;
JTextArea tZleceniodawca;
    JScrollPane scroll;
JPanel panel1,panel2,panel3;
    public Dodaj_Zleceniodawce()
    {
        setSize(400, 400);
        setLayout(new BorderLayout());
        setExtendedState(MAXIMIZED_BOTH);
        lNazwaSkroconaZleceniodawcy=new JLabel();
        lZleceniodawca=new JLabel();
        lMiasto=new JLabel();
        lKodPocztowy=new JLabel();
        lUlica=new JLabel();
        lUkosnik=new JLabel();
        lNip=new JLabel();
        tNazwaSkroconaZleceniodawcy=new JTextField();
        tMiasto=new JTextField();
        tKodPocztowy=new JTextField();
        tUlica=new JTextField();
        tNumerDomu=new JTextField();
        tNumerMieszkania=new JTextField();
        tNip=new JTextField();
        tKraj=new JTextField();
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

    bZapisz=new JButton("Zapisz");// przycisk bZapisz
    bZapisz.setPreferredSize(new Dimension(100,20));
    panel.add(bZapisz);
    bZapisz.addActionListener(e -> {
        String NazwaSkroconaZleceniodawcy=tNazwaSkroconaZleceniodawcy.getText().trim();
        String PelnaNazwaZleceniodawcy=tZleceniodawca.getText().trim();
        String Miasto=tMiasto.getText().trim();
        String KodPocztowy=tKodPocztowy.getText().trim();
        String Ulica=tUlica.getText().trim();
        String NumerDomu=tNumerDomu.getText().trim();
        String NumerMieszkania=tNumerMieszkania.getText().trim();
        String NIP=tNip.getText().trim();

        System.out.println(NazwaSkroconaZleceniodawcy);// do wyrzucenia po sprawdzeniu
        System.out.println(PelnaNazwaZleceniodawcy);
        System.out.println(Miasto);
        System.out.println(KodPocztowy);
        System.out.println(Ulica);
        System.out.println(NumerDomu);
        System.out.println(NumerMieszkania);
        System.out.println(NIP);

        if(NazwaSkroconaZleceniodawcy.isEmpty())
        {
            WyswietlKomunikatoBledzie("Nie wpisałes nazwy skroconej zleceniodawcy");
        }
        else if(PelnaNazwaZleceniodawcy.isEmpty())
        {
            WyswietlKomunikatoBledzie("Nie wpisales pelnej nazwy zleceniodawcy");
        }
        else if(Miasto.isEmpty())
        {
            WyswietlKomunikatoBledzie("Nie wpisales miasta");
        }
        else if(KodPocztowy.isEmpty())
        {
            WyswietlKomunikatoBledzie("Nie wpisales kodu pocztowego");
        }
        else if(Ulica.isEmpty())
        {
            WyswietlKomunikatoBledzie("Nie wpisales ulicy");
        }
        else if(NumerDomu.isEmpty())
        {
            WyswietlKomunikatoBledzie("Nie wpisales numeru domu");
        }

        if(!NazwaSkroconaZleceniodawcy.isEmpty()&&!PelnaNazwaZleceniodawcy.isEmpty()&&!Miasto.isEmpty()&&!KodPocztowy.isEmpty()&&!Ulica.isEmpty()&&!NumerDomu.isEmpty())
        {
            if(NIP.isEmpty())
            {

                int odpowiedz=JOptionPane.showConfirmDialog(null,"Czy zapisac zleceniodawce bez Nipu?","Potwierdzenie",JOptionPane.YES_NO_OPTION);
                if(odpowiedz==JOptionPane.YES_OPTION)
                {
                    System.out.println("zapisuje bez nipu");
                    dispose();
                }
                else
                {
                    JOptionPane.getRootFrame().dispose();

                }
            }
            System.out.println("Zapisuje zleceniodawce");
            dispose();
        }
    });

    bWyjscie=new JButton("Wyjscie"); // przycisk bWysjcie
    bWyjscie.setPreferredSize(new Dimension(100,20));
    panel.add(bWyjscie);

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
        panel.setLayout(null);

        WysweitlNapis(lNazwaSkroconaZleceniodawcy,"Nazwa skrócona zleceniodawcy",20,0,200,20,panel);
        WpiszTekst(tNazwaSkroconaZleceniodawcy,20,20,200,20,panel);
        WysweitlNapis(lZleceniodawca,"Pelna nazwa zleceniodawcy",20,50,200,20,panel);

        tZleceniodawca=new JTextArea();
        tZleceniodawca.setWrapStyleWord(true);
        tZleceniodawca.setLineWrap(true);
        tZleceniodawca.setCaretPosition(0);
        scroll=new JScrollPane(tZleceniodawca);//panel do wpisywania pelnej nazwy zleceniodawcy
        scroll.setBounds(20,80,200,100);
        panel.add(scroll);

        WysweitlNapis(lMiasto,"Miasto",20,240,100,20,panel);
        WpiszTekst(tMiasto,20,260,200,20,panel);
        WysweitlNapis(lKodPocztowy,"Kod pocztowy",20,290,80,20,panel);
        WpiszTekst(tKodPocztowy,110,290,110,20,panel);
        WysweitlNapis(lUlica,"Ulica",20,320,80,20,panel);
        WpiszTekst(tUlica,20,340,150,20,panel);
        WpiszTekst(tNumerDomu,180,340,20,20,panel);
        WysweitlNapis(lUkosnik,"/",205,340,5,20,panel);
        WpiszTekst(tNumerMieszkania,210,340,20,20,panel);
        WysweitlNapis(lNip,"NIP",400,20,40,20,panel);
        WpiszTekst(tKraj,430,20,20,20,panel);
        WpiszTekst(tNip,435,20,100,20,panel);


        return panel;


    }
    private void WyswietlKomunikatoBledzie(String Blad)
    {
        JOptionPane.showMessageDialog(
                null,
                Blad,
                "Błąd",
                JOptionPane.ERROR_MESSAGE
        );
    }
    public void WysweitlNapis(JLabel label,String napis,int a, int b,int c, int d, JPanel panel)
    {
        label.setText(napis);
        label.setBounds(a,b,c,d);
        panel.add(label);
    }
    public void WpiszTekst(JTextField text,int a,int b,int c,int d,JPanel panel)
    {

        text.setBounds(a,b,c,d);
        panel.add(text);
    }


}
