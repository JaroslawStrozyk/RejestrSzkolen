/* 
 * KONFIGURACJA ZAPISANA W SQLITE   
 */
package REJESTR;

import REJESTR.PLIK;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CONF {

    public static boolean MYSQL;
    public static String url;
    public static String user;
    public static String pass;
    public static String ip;
    public static String ipAddress;
    public static String ProgramPath = ""; //"C:\\Dropbox\\__PROGRAM_REJESTR_SZKOLEN\\";
    public static String firma_domyslna = "";

    public static String aktualnyRok = "";
    public static int blokadaRok = 0;

    public static ArrayList<String> firmy = new ArrayList();
    private static Connection conSqlite = null;

    public CONF(String s) {
        ProgramPath = s;
    }

    private static void ConSQLITE() {
        try {

            Class.forName("org.sqlite.JDBC");
            conSqlite = DriverManager.getConnection("jdbc:sqlite:CONF\\RejestrSzkolen.sqlite");
            //System.out.println("Połaczenie z bazą ustawione !!!");
            //conSqlite.close();
        } catch (Exception e) {
            System.out.println("PROBLEMY:\n" + e);
            //PLIK.doLogu("ALARM", s);
            conSqlite = null;
        }
    }

    ;
   
    public static Boolean TestPass(String u, String p) {
        ResultSet rs = null;
        PreparedStatement pst = null;
        Boolean isCorrect = false;

        ConSQLITE();

        String sql = "SELECT * FROM LOGIN WHERE USERNAME = \"" + u + "\" AND USERPASS = \"" + p + "\"";

        try {
            pst = conSqlite.prepareStatement(sql);

            rs = pst.executeQuery();
            if (rs.next()) {
                PLIK.doLogu("INFO ", u + ": zalogowany do programu...");
                isCorrect = true;

            } else {
                JOptionPane.showMessageDialog(null, "Nazwa użytkownika lub hasło nieprawidłowe");
                PLIK.doLogu("ALARM", "LOGOWANIE: Nazwa użytkownika lub hasło nieprawidłowe...");
            };
            pst.close();
            rs.close();
            conSqlite.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "CONF: " + e);
        }

        return isCorrect;
    }

    public static void CzytajCONF() {
        String urlc = "";
        String userc = "";
        String passc = "";
        String ipc = "";
        String sql;
        PreparedStatement st;
        ResultSet rs;

        try {
            ConSQLITE();
            sql = "SELECT * FROM BAZA";
            st = conSqlite.prepareStatement(sql);
            rs = st.executeQuery();

            rs.next();
            urlc = rs.getString("URL");
            userc = rs.getString("USER");
            passc = rs.getString("PASS");
            ipc = rs.getString("IP");

            st.close();
            rs.close();

        } catch (Exception e) {
            String s = "BŁĄD W Czytaj: " + e;
            //PLIK.doLogu("ALARM", s);
        }

        MYSQL = false;
        if (MYSQL) {
            url = urlc + "?useUnicode=true&characterEncoding=utf-8";
        } else {
            url = urlc;
        }
        user = userc;
        pass = passc;
        ipAddress = ipc;

        //Firmy
        try {
            sql = "SELECT * FROM FIRMA";
            st = conSqlite.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                firmy.add(rs.getString("NAZWA"));
            };

            st.close();
            rs.close();

        } catch (Exception e) {
            String s = "BŁĄD W Czytaj: " + e;
            //PLIK.doLogu("ALARM", s);
        }

        // Firma domyślna
        try {
            sql = "SELECT * FROM FIRMA WHERE DOMYSLNA=1";
            st = conSqlite.prepareStatement(sql);
            rs = st.executeQuery();

            rs.next();
            firma_domyslna = rs.getString("NAZWA");

            st.close();
            rs.close();

        } catch (Exception e) {
            String s = "BŁĄD W Czytaj: " + e;
            //PLIK.doLogu("ALARM", s);
        }

        // Domyślny rok
        try {
            sql = "SELECT * FROM PROGRAM";
            st = conSqlite.prepareStatement(sql);
            rs = st.executeQuery();

            rs.next();
            aktualnyRok = rs.getString("ROK");
            blokadaRok = rs.getInt("BLOKADA");
            st.close();
            rs.close();

        } catch (Exception e) {
            String s = "BŁĄD W Czytaj: " + e;
            //PLIK.doLogu("ALARM", s);
        }
    }

}
