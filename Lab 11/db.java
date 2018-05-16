/*
 *  JDBC java.sql
 *      -  connectarea la o db
 *      - executarea sql
 *      - prelucrarea rezultatelor
 *  DriverManager
 *      - Driver 1 (Mysql)
 *      - Driver 2 (Sql server)
 *      - Driver 3 (PostGreSQL)
 *  Driver -> o ap instalata local, sub forma unuio .jar
 *      implementeaza protocolul de cmunicatie dintre ap_java si SGBD
 *      - se fol. socketuri
 *      - independenta ap_java de SGBD
 * 
 * Nucleul JDBC
 * 
 * 1. DriverManager -> gestioneaza drivere JDBC specifice SGBD
 * 2. interfata conection -> realizeaza connexiunea dintre ap_java si db
 *      - orice comanda se executa in contextul unei connexiuni
 * 3. Statement, PreparedStatement, CallableStatement -> folosite pt. executarea
 *  efective a unei comenzi SQL, sau pt apelul unor functii/proceduri stocate.
 * 4. ResultSet e o clasa care memoreaza rezultatul sub forma tabelara si prelucreaza
 * rezultatul.
 * 5. SQLException
 *      
 * Etapele
 * 
 * 1. (optional) -> se incarca in memorie driverul specific JDBC -> apelul metodei 
 * statice forName(String driver) din clasa Class ex. Class.forName("com.mysql.jdbc.Driver")
 * 2. realizarea conexiunii prin apelul metodei statice getConnection(String url) din
 * clasa DriverManager si returneaza un obiect de tip connection. URL-ul este de forma
 * jdbc://SGBD/identificator (adresa masinii gazda + nr port + numele bazei de date
 * (optional se specifica user si parola)) ex.
 *  Connection con = DriverManager.getConnection("jdbc://mysql://localhost:3003/Angajati", "user", "parola")
 * 3. se associaza connexinii un context prin care se efectueaza commenzi sql. (statement) 
 *    - Statement -> fol. pr interogari fara parametri
 *    - PreparedStatement -> fo. pt. interogari cu parametri
 *    - CallableStatement pt apel, functii si proceduri stocate.
 *     
 *     1. Statement, se asociaza contextul prin apelul metodei createStatement() pt ob conexiune
 *        Statement st = con.createStatement();
 *      -> orice comanda SQL este sub forma unui string, pt contextul Statement putem apela
 *          -> executeQuery(String SQL);
 *          -> executeUpdate(String SQL);
 *          String sql1 = "SELECT * FROM date WHERE salariu >= 3000";
 *          ResultSet res = st.executeQuery(sql1);
 *              -> se fol un cursor pt parcuregea pe linii
 *              -> se fol. metodede: next(), first(), last(), previous()
 *          Extragem infomatiole de pe coloane se realizeaza cu metoda 
 *          getTipData(String "NumeleColoanei" sau int nr de ordine cu indexarea de la 1);    
 *          while (res.next()) {
 *              System.out.println(res.getSring("Nume") + " " + res.getInt(3));
 *          }
 */

package javaapplication1;

import java.sql.*;

public class JavaApplication1 {

    public static void main(String[] args) {
        try {
       Connection conn = 
               DriverManager.getConnection("jdbc:derby://localhost:1527/AngajatiFirma", "root", "12345");
        Statement pst = conn.createStatement();
        String sq1 = "SELECT * FROM Angajati WHERE salariu >= 3000";
        ResultSet res = pst.executeQuery(sq1);
        while (res.next()) {
            System.out.println(res.getString("CNP")  + " " + res.getString(2) 
                    + " " + res.getInt("Varsta") + res.getDouble("Salariu"));
        }
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
       }
    }
}
