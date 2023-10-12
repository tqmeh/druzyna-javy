import javax.swing.*;
import java.awt.*;

public class Dodawanie_Zlecenia extends JFrame {
    JPanel panel1, panel2, panel3, panel4;
    JLabel lZleceniodawca, lUrzadzenie, lModel, lNumerSeryjny, lDataPrzyjecia, lOpisUsterki,lWady,lUwagiSerwisanta;
    JButton bWyjscie, bZapisz,bCzysc;
    JTextArea aOpisUsterki,aWady,aUwagiSerwisanta;
    JTabbedPane zakladka1;
    JTextField tZleceniodawca,tUrzadzenia,tModel,tNumerSeryjny;
    JScrollPane scroll,scroll1,scrool2;

    JButton bDodajZleceniodawce;

    public Dodawanie_Zlecenia() {
        setSize(400, 400);
        setLayout(new BorderLayout());
        setExtendedState(MAXIMIZED_BOTH);

        panel1 = stworzPanel1();
        panel2 = stworzPanel2();
        panel3 = stworzPanel3();
        panel4 = stworzPanel4();

        zakladka1 = new JTabbedPane();
        zakladka1.addTab("Przyjęcie urządzenia", null, panel3);
        zakladka1.addTab("Widoczne wady urzadzenia", null, panel4);

        add(zakladka1, BorderLayout.CENTER);

    }

    private JPanel stworzPanel1() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        panel.setPreferredSize(new Dimension(100, 100));
        add(panel, BorderLayout.WEST);




        bZapisz=new JButton();
        bCzysc=new JButton();
        bWyjscie=new JButton();

        StworzPrzycisk(bZapisz,"Zapisz",100,20,panel);
        bZapisz.addActionListener(e -> {
            String zleceniodawca=tZleceniodawca.getText().trim();
            String urzadzenie=tUrzadzenia.getText().trim();
            String model=tModel.getText().trim();
            String numer=tNumerSeryjny.getText().trim();
            String usterka=aOpisUsterki.getText().trim();

           if(zleceniodawca.isEmpty())
            {
                WyswietlKomunikatoBledzie("Nie wpisales zleceniodawcy");
            }
           else if(urzadzenie.isEmpty())
            {
                WyswietlKomunikatoBledzie("Nie wybrales urzadzenia");
            }
           else if(model.isEmpty())
            {
                WyswietlKomunikatoBledzie("Nie wpisales modelu urzadzenia");
            }
            else if(numer.isEmpty())
            {
                WyswietlKomunikatoBledzie("Nie wpisales numeru serujnego urzadzenia");
            }
            else if(usterka.isEmpty())
            {
                WyswietlKomunikatoBledzie("Nie opisales ustarki urzadzenia");
            }
            if(!zleceniodawca.isEmpty()&&!urzadzenie.isEmpty()&&!model.isEmpty()&&!numer.isEmpty()&&!usterka.isEmpty())
            {
                System.out.println("Wszystko wpisales ");
                dispose();
            }
        });

        StworzPrzycisk(bCzysc,"Czyść",100,20,panel);
        bCzysc.addActionListener(e ->{
        tZleceniodawca.setText(" ");
        tUrzadzenia.setText(" ");
        tModel.setText(" ");
        tNumerSeryjny.setText(" ");
        aOpisUsterki.setText(" ");
        aWady.setText(" ");
        aUwagiSerwisanta.setText(" ");

        });
        StworzPrzycisk(bWyjscie,"Wyjdz",100,20,panel);






        return panel;
    }

    private JPanel stworzPanel2() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.blue);
        panel.setPreferredSize(new Dimension(100, 100));
        add(panel, BorderLayout.NORTH);

        return panel;
    }

    private JPanel stworzPanel3() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.ORANGE);
        panel.setLayout(null);

        lZleceniodawca=new JLabel();
        lUrzadzenie=new JLabel();
        lModel=new JLabel();
        lNumerSeryjny=new JLabel();
        lDataPrzyjecia=new JLabel();
        lOpisUsterki=new JLabel();
        tZleceniodawca=new JTextField();
        tUrzadzenia=new JTextField();
        tModel=new JTextField();
        tNumerSeryjny=new JTextField();

        WysweitlNapis(lZleceniodawca,"Zleceniodawca",50,50,100,20,panel);
        WysweitlNapis(lUrzadzenie,"Urzadzenie",50,80,100,20,panel);
        WysweitlNapis(lModel,"Model",50,110,100,20,panel);
        WysweitlNapis(lNumerSeryjny,"Numer Seryjny",50,140,100,20,panel);
        WysweitlNapis(lDataPrzyjecia,"Data przyjęcia",50,170,100,20,panel);
        WysweitlNapis(lOpisUsterki,"Opis usterki",50,250,100,20,panel);

        WpiszTekst(tZleceniodawca,150,50,150,20,panel);
        WpiszTekst(tUrzadzenia,150,80,150,20,panel);
        WpiszTekst(tModel,150,110,150,20,panel);
        WpiszTekst(tNumerSeryjny,150,140,150,20,panel);

        aOpisUsterki=new JTextArea();
        aOpisUsterki.setWrapStyleWord(true);
        aOpisUsterki.setLineWrap(true);
        aOpisUsterki.setCaretPosition(0);

        scroll=new JScrollPane(aOpisUsterki);
        scroll.setBounds(50,270,400,200);
        panel.add(scroll);

        bDodajZleceniodawce=new JButton();// przycisk dodaj zleceniodawce
        bDodajZleceniodawce.setBounds(310,50,20,20);
        bDodajZleceniodawce.addActionListener(e ->{
            Dodaj_Zleceniodawce dodajZleceniodawce=new Dodaj_Zleceniodawce();
            dodajZleceniodawce.setVisible(true);
        });
        panel.add(bDodajZleceniodawce);




        return panel;
    }

    private JPanel stworzPanel4() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);
        panel.setLayout(null);
        lWady=new JLabel("Zauważone wady urządzenia");
        lWady.setBounds(0,0,200,20);
        lWady.setForeground(Color.WHITE);
        panel.add(lWady);

        aWady=new JTextArea();
        aWady.setWrapStyleWord(true);
        aWady.setLineWrap(true);
        aWady.setCaretPosition(0);
        scroll1=new JScrollPane(aWady);
        scroll1.setBounds(0,20,400,200);
        panel.add(scroll1);

        lUwagiSerwisanta=new JLabel("Uwagi serwisanta");
        lUwagiSerwisanta.setBounds(800,0,200,20);
        lUwagiSerwisanta.setForeground(Color.WHITE);
        panel.add(lUwagiSerwisanta);

        aUwagiSerwisanta=new JTextArea();
        aUwagiSerwisanta.setWrapStyleWord(true);
        aUwagiSerwisanta.setLineWrap(true);
        aUwagiSerwisanta.setCaretPosition(0);
        scrool2=new JScrollPane(aUwagiSerwisanta);
        scrool2.setBounds(800,20,400,200);
        panel.add(scrool2);



        return panel;
    }

public void WysweitlNapis(JLabel label,String napis,int a,int b,int c,int d,JPanel panel)
{
    label.setText(napis);
    label.setBounds(a,b,c,d);
    label.setForeground(Color.WHITE);
    panel.add(label);

}
public void WpiszTekst(JTextField text,int a,int b, int c, int d,JPanel panel)
{
    text.setBounds(a,b,c,d);
    panel.add(text);
}

public void StworzPrzycisk(JButton button,String nazwa,int a,int b,JPanel panel)
{
    button.setPreferredSize(new Dimension(a,b));
    button.setText(nazwa);
    panel.add(button);
}
public  void WyswietlKomunikatoBledzie(String Blad)
{
    JOptionPane.showMessageDialog(
            null,
            Blad,
            "Błąd",
            JOptionPane.ERROR_MESSAGE
    );
}

}
