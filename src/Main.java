import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static Locale locale_pl_PL = new Locale("pl", "PL");
    public static Locale locale_en_UK = new Locale("en", "UK");
    public static ResourceBundle resourceBundle = ResourceBundle.getBundle("bundle", Main.locale_pl_PL);

    public static void main(String[] args)
    {
        Logowanie logowanie=new Logowanie();
        logowanie.setVisible(true);
        logowanie.setResizable(false);
    }
}