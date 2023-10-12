import javax.swing.*;


public class Logowanie extends JFrame {

JLabel lLogin,lHaslo;
JTextField tWpiszLogin;
JPasswordField tWpiszHaslo;
JButton bZaloguj,bRejestruj;
    public Logowanie()
    {
        setSize (400,200);
        setLayout(null);
        setTitle("Logowanie");


        lLogin=new JLabel("Login:");
        lLogin.setBounds(100,20,100,20);
        add(lLogin);

        lHaslo=new JLabel("Hasło:");
        lHaslo.setBounds(100,45,100,20);
        add(lHaslo);

        tWpiszLogin=new JTextField(" ");
        tWpiszLogin.setBounds(150,20,100,20);
        add(tWpiszLogin);

        tWpiszHaslo=new JPasswordField();
        tWpiszHaslo.setBounds(150,45,100,20);
        add(tWpiszHaslo);



        bZaloguj=new JButton("Zaloguj");// przycisk do logowania
        bZaloguj.setBounds(75,100,100,20);
        add(bZaloguj);
       bZaloguj.addActionListener(e ->{
           Glowna glowna=new Glowna();
           glowna.setVisible(true);
           dispose();
       });

        bRejestruj=new JButton("Rejestruj");// przycisk do nowej rejestracji uzytkownika
        bRejestruj.setBounds(175,100,100,20);
        add(bRejestruj);
       bRejestruj.addActionListener(e -> {
           Rejestruj rejestruj=new Rejestruj();
           rejestruj.setVisible(true);
       });


    }
}
