package REJESTR;

import OKNA.DOknoLogowanie;
import BAZA.MYSQL_BAZA;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;
//import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MAIN {

    public static String NazwaProgramu = "Rejestr szkoleń";
    public static String WersjaProgramu = "02.50";
    public static String DataKompilacji = "21.07.2015r.";
    private static int licznik = 1; // co ile sekund odczyt pracowników (podtrzymanie połaczenia)
    public static int wpisyPracownik = 0; //ilosc pracowników w bazie danych
    public static int wpisySzkolenie = 0; //ilość zaswiadczeń w bazie danych

    public static String PamiecData = "";

    public static String Programsciezka = "";
    public static Boolean testSieci = false;

    private static String[] bledy = {
        "Problem z połączeniem z bazą danych...",
        "Start programu",
        "Test sieci dla adresu: ",
        "BŁĄD TESTU SIECI DLA ADRESU ",
        "Okno główne problem w procedurze WindowOpened",
        "Problem przy kasowaniu danych",
        "Problem z szkoleniami przy kasowaniu danych",
        "Problem przy wyborze wiersza i selekcji szkoleń",
        "Problem przy obłudze ComboBox ",
        "Problem z wyszukiwaniem",
        "Problem przy wyszukiwaniu z szkoleniami"
    };

    public static String Bledy(int i) {
        return bledy[i];
    };
    
    public static void main(String[] args) throws FileNotFoundException {

        Programsciezka = ustalSciezke();
        
        PLIK.doLogu("INFO ", MAIN.Bledy(1));
        CONF conf = new CONF(Programsciezka);
        conf.CzytajCONF();

        DOknoLogowanie lo = new DOknoLogowanie(null, false);
        lo.setVisible(true);

    }

    public static void TestLicznik() { // throws FileNotFoundException 
        licznik = licznik - 1;

        if (licznik == 0) {
            licznik = 5;

            wpisyPracownik = MYSQL_BAZA.testPracownik();
            wpisySzkolenie = MYSQL_BAZA.testSzkolenie(CONF.aktualnyRok);
        }
    }

    private static void testLAN() {
        Socket socket = null;
        testSieci = false;
        try {
            socket = new Socket(CONF.ipAddress, 80);
            testSieci = true;
            if (socket != null) {
                socket.close();
            };
            String s = CONF.ipAddress + " prawidłowy.";
            PLIK.doLogu("INFO ", MAIN.Bledy(2) + s);
        } catch (IOException e) {
            PLIK.doLogu("ALARM", MAIN.Bledy(3) + CONF.ipAddress + " [" + e + "]");
        };
    };

    private static String ustalSciezke(){
        String path = "";
        try {
            path = new File(".").getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
        }
        return path;
    }
}
