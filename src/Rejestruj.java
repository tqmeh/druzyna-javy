import javax.swing.*;


public class Rejestruj extends JFrame {

    JLabel lLogin,lMail,lPowtorzMail,lHaslo,lPowtorzhaslo;
    JTextField tLogin,tMail,tPowtorzMail;
    JPasswordField pHaslo,pPowtorzHaslo;
    JButton bRejestruj,bWyjdz;
    public Rejestruj()
    {
        setSize(400,220);
        setLayout(null);
        setTitle("Rejestracja");

        lLogin=new JLabel("Wpisz Login");
        lLogin.setBounds(75,20,100,20);
        add(lLogin);

        tLogin=new JTextField(" ");
        tLogin.setBounds(175,20,100,20);
        add(tLogin);


        lHaslo=new JLabel("Wpisz hasło");
        lHaslo.setBounds(75,45,100,20);
        add(lHaslo);

        pHaslo=new JPasswordField();
        pHaslo.setBounds(175,45,100,20);
        add(pHaslo);

        lPowtorzhaslo=new JLabel("Powtórz hasło");
        lPowtorzhaslo.setBounds(75,70,100,20);
        add(lPowtorzhaslo);

        pPowtorzHaslo=new JPasswordField();
        pPowtorzHaslo.setBounds(175,70,100,20);
        add(pPowtorzHaslo);

        lMail=new JLabel("Wpisz mail");
        lMail.setBounds(75,95,100,20);
        add(lMail);

        tMail=new JTextField();
        tMail.setBounds(175,95,100,20);
        add(tMail);


        lPowtorzMail=new JLabel("Powtórz mail");
        lPowtorzMail.setBounds(75,120,100,20);
        add(lPowtorzMail);

        tPowtorzMail=new JTextField();
        tPowtorzMail.setBounds(175,120,100,20);
        add(tPowtorzMail);

        bRejestruj=new JButton("Rejestruj");//przycisk rejestruj jeszcze do oprogramowania
        bRejestruj.setBounds(100,150,100,20);
        add(bRejestruj);

        bWyjdz=new JButton("Wyjdź");//przycisk wyjdz
        bWyjdz.setBounds(200,150,100,20);
        add(bWyjdz);
        bWyjdz.addActionListener(e -> dispose());//actionlistener


    }
}
