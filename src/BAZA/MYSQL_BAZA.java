/*
 * http://www.youtube.com/watch?v=qMZ_MI1oJAc
 */
package BAZA;

/**
 * @author jaroslaw
 */
import REJESTR.PLIK;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class MYSQL_BAZA {

    public static Connection conn = null;

    // BAZA MYSQL
    public static void ConnectDb(boolean MYSQL, String url, String user, String pass) { //throws FileNotFoundException{
        if (MYSQL) {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, pass);

                PLIK.doLogu("INFO ", "[mysql] Połaczenie z bazą ustawione !!!");

            } catch (Exception e) {
                
                String s = "[mysql] PROBLEM Z POŁĄCZENIEM DO BD: " + e;
                System.out.println("PROBLEMY:\n" + e);

                JOptionPane.showMessageDialog(null, "Problemy:\n" + e);

                PLIK.doLogu("ALARM", s);
                conn = null;
            }

        } else {
            try {

                Class.forName("org.sqlite.JDBC");
                conn = DriverManager.getConnection(url); //"jdbc:sqlite:DANE\\RejestrSzkolen.db"
                
                PLIK.doLogu("INFO ", "[sqlite] Połaczenie z bazą ustawione !!!");
                
            } catch (Exception e) {
                
                String s = "[sqlite] PROBLEM Z POŁĄCZENIEM DO BD: " + e;
                System.out.println("PROBLEMY:\n" + e);

                JOptionPane.showMessageDialog(null, "Problemy:\n" + e);

                PLIK.doLogu("ALARM", s);
                conn = null;
            }
        }
    }

    ;
         
    public static int testPracownik() { // throws FileNotFoundException

        Integer licznik = 0;
        String sql = "SELECT COUNT(IDPRACOWNIK) AS LICZNIK FROM PRACOWNIK";
        if (conn != null) {
            try {
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                rs.next();
                licznik = rs.getInt(1);

                st.close();
                rs.close();

            } catch (Exception e) {
                String s = "BŁĄD W testPracownik: " + e;
                PLIK.doLogu("ALARM", s);
            }
        } else {
            String s = "BŁĄD W testPracownik - POŁĄCZENIE Z DB. ";
            PLIK.doLogu("ALARM", s);
        }

        return licznik;
    }

    public static void insertPracownik(String firma, String logo, String nazwisko, String imie, String urodzony, String km, String wydzial) throws FileNotFoundException {
        String sql = "INSERT INTO PRACOWNIK(FIRMA, LOGO, NAZWISKO, IMIE, URODZONY, KM, WYDZIAL) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, firma);
            st.setString(2, logo);
            st.setString(3, nazwisko);
            st.setString(4, imie);
            st.setString(5, urodzony);
            st.setString(6, km);
            st.setString(7, wydzial);
            st.execute();
            System.out.println("Rekord zapisany...");

        } catch (Exception e) {
            String s = "BŁĄD W insertPracownik - KOM. INSERT: " + e;
            PLIK.doLogu("ALARM", s);
        }

    }

    public static ResultSet upgradePracownik() throws FileNotFoundException {
        String sql = "SELECT IDPRACOWNIK AS 'Lp', FIRMA AS 'Firma', LOGO AS 'Plik logo', NAZWISKO AS 'Nazwisko', IMIE AS 'Imię', URODZONY AS 'Data urodzenia', KM, WYDZIAL AS 'Wydział/Stanowisko' FROM PRACOWNIK"; // WHERE FIRMA = "+s;
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            return rs;
        } catch (Exception e) {
            String s1 = "BŁĄD W upgradePracownik - KOM. SELECT: " + e;
            PLIK.doLogu("ALARM", s1);
            return null;
        }

    }

    public static ResultSet selectFirma(String s) throws FileNotFoundException {
        String sql = "SELECT IDPRACOWNIK AS 'Lp', FIRMA AS 'Firma', LOGO AS 'Plik logo', NAZWISKO AS 'Nazwisko', IMIE AS 'Imię', URODZONY AS 'Data urodzenia', KM, WYDZIAL AS 'Wydział/Stanowisko' FROM PRACOWNIK  WHERE FIRMA LIKE '%" + s + "%'";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            return rs;
        } catch (Exception e) {
            String s1 = "BŁĄD W selectFirma - KOM. SELECT: " + e;
            PLIK.doLogu("ALARM", s1);
            return null;
        }
    }

    public static ResultSet findData(String s) throws FileNotFoundException {
        String sql = "SELECT IDPRACOWNIK AS 'Lp', FIRMA AS 'Firma', LOGO AS 'Plik logo', "
                + "NAZWISKO AS 'Nazwisko', IMIE AS 'Imię', URODZONY AS 'Data urodzenia', KM, WYDZIAL AS 'Wydział/Stanowisko' "
                + "FROM PRACOWNIK  WHERE FIRMA LIKE '%" + s + "%' OR NAZWISKO LIKE '%" + s + "%' "
                + "OR  IMIE LIKE '%" + s + "%' OR URODZONY LIKE '%" + s + "%' OR WYDZIAL LIKE '%" + s + "%'";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            return rs;
        } catch (Exception e) {
            String s1 = "BŁĄD W findData: " + e;
            PLIK.doLogu("ALARM", s1);
            return null;
        }
    }

    public static void updatePracownik(String idpracownik, String firma, String logo, String nazwisko, String imie, String urodzony, String km, String wydzial) throws FileNotFoundException {
        String sql = "UPDATE PRACOWNIK SET FIRMA = ?, LOGO = ?, NAZWISKO = ?, IMIE = ?, URODZONY = ?, KM = ?, WYDZIAL = ? WHERE IDPRACOWNIK = ?";
        try {

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, firma);
            st.setString(2, logo);
            st.setString(3, nazwisko);
            st.setString(4, imie);
            st.setString(5, urodzony);
            st.setString(6, km);
            st.setString(7, wydzial);
            st.setString(8, idpracownik);
            st.executeUpdate();

        } catch (Exception e) {
            String s1 = "BŁĄD W updatePracownik - KOM. UPDATE: " + e;
            PLIK.doLogu("ALARM", s1);
        }

    }

    public static void deletePracownik(String idpracownik) throws FileNotFoundException {
        String sqlp = "DELETE FROM PRACOWNIK WHERE IDPRACOWNIK = ?";
        String sqlz = "DELETE FROM SZKOLENIE WHERE PRACOWNIKID = ?";
        try {
            PreparedStatement st = conn.prepareStatement(sqlp);
            st.setString(1, idpracownik);
            st.execute();
            PreparedStatement st1 = conn.prepareStatement(sqlz);
            st1.setString(1, idpracownik);
            st1.execute();
        } catch (Exception e) {
            String s1 = "BŁĄD W deletePracownik - KOM. DELETE: " + e;
            PLIK.doLogu("ALARM", s1);
        }

    }

    public static int testSzkolenie(String rok) { // throws FileNotFoundException

        Integer licznik = 0;
        String sql = "SELECT COUNT(IDSZKOLENIE) FROM SZKOLENIE WHERE DATASZKOLENIA LIKE '%" + rok + "%'"; // AS LICZNIK 
        if (conn != null) {
            try {
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                rs.next();
                licznik = rs.getInt(1);

                st.close();
                rs.close();

            } catch (Exception e) {
                String s = "BŁĄD W testSzkolenie: " + e;
                PLIK.doLogu("ALARM", s);
            }
        } else {
            String s = "BŁĄD W testSzkolenie - POŁĄCZENIE Z DB. ";
            PLIK.doLogu("ALARM", s);
        }

        return licznik;
    }

    public static ResultSet upgradeSzkolenie(String s) throws FileNotFoundException {
        String sql = "SELECT IDSZKOLENIE AS 'Lp', PRACOWNIKID AS 'IdPracownik', "
                + "DATASZKOLENIA AS 'Data szkolenia', RODZAJSZKOLENIA AS 'Rodzaj szkolenia', "
                + " ZASWIADCZENIE AS 'Zaświadczenie', PLIK "
                + " FROM SZKOLENIE WHERE PRACOWNIKID = " + s + " ORDER BY DATASZKOLENIA DESC";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            return rs;
        } catch (Exception e) {
            String s1 = "BŁĄD W upgradeSzkolenie: " + e;
            PLIK.doLogu("ALARM", s1);
            return null;
        }

    }

    public static void insertSzkolenie(String idpracownik, String dataszkolenia, String rodzajszkolenia, String zaswiadczenie, String plik) throws FileNotFoundException {
        String sql = "INSERT INTO SZKOLENIE(PRACOWNIKID, DATASZKOLENIA, RODZAJSZKOLENIA, ZASWIADCZENIE, PLIK) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, idpracownik);
            st.setString(2, dataszkolenia);
            st.setString(3, rodzajszkolenia);
            st.setString(4, zaswiadczenie);
            st.setString(5, plik);
            st.execute();
            System.out.println("Rekord zapisany...");

        } catch (Exception e) {
            String s1 = "BŁĄD W insertSzkolenie: " + e;
            PLIK.doLogu("ALARM", s1);
        }

    }

    public static void updateSzkolenie(String idszkolenia, String idpracownik, String dataszkolenia, String rodzajszkolenia, String zaswiadczenie, String plik) throws FileNotFoundException {
        String sql = "UPDATE SZKOLENIE SET PRACOWNIKID = ?, DATASZKOLENIA = ?, RODZAJSZKOLENIA = ?, ZASWIADCZENIE = ?, PLIK = ? WHERE IDSZKOLENIE = ?";
        try {

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, idpracownik);
            st.setString(2, dataszkolenia);
            st.setString(3, rodzajszkolenia);
            st.setString(4, zaswiadczenie);
            st.setString(5, plik);
            st.setString(6, idszkolenia);
            st.executeUpdate();

        } catch (Exception e) {
            String s1 = "BŁĄD W updateSzkolenie: " + e;
            PLIK.doLogu("ALARM", s1);
        }

    }

    public static void deleteSzkolenie(String idszkolenie) throws FileNotFoundException {
        String sql = "DELETE FROM SZKOLENIE WHERE IDSZKOLENIE = ?";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, idszkolenie);
            st.execute();

        } catch (Exception e) {
            String s1 = "BŁĄD W deleteSzkolenie: " + e;
            PLIK.doLogu("ALARM", s1);
        }

    }

    public static ResultSet selectWzory(String s) throws FileNotFoundException {
        String sql = "SELECT * FROM WZORY WHERE FIRMA LIKE '%" + s + "%'";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            return rs;
        } catch (Exception e) {
            String s1 = "BŁĄD W selectWzory: " + e;
            PLIK.doLogu("ALARM", s1);
            return null;
        }
    }

    public static String podajWzor(String data) throws FileNotFoundException {
        String sql = "SELECT PLIK FROM SZKOLENIE WHERE DATASZKOLENIA = '" + data + "'";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            rs.next();
            return rs.getString("PLIK");
        } catch (Exception e) {
            String s1 = "BŁĄD W podajWzor: " + e;
            PLIK.doLogu("ALARM", s1);
            return null;
        }
    }

    public static ResultSet widokWzory() {
        String sql = "SELECT DISTINCT SYMBOL AS 'Symbol', OPIS AS 'Opis zaświadczeń' FROM WZORY ORDER BY SYMBOL ASC";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            return rs;
        } catch (Exception e) {
            String s1 = "BŁĄD W widokWzory: " + e;
            PLIK.doLogu("ALARM", s1);
            return null;
        }
    }
}
