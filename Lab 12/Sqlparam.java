package javaapplication1;

import java.sql.*;
import java.util.Scanner;

public class Sqlparam {

    public static void main(String[] args) {
        Connection conn;
        PreparedStatement pst;
        String sql = "SELECT * FROM APP.ANGAJATI WHERE varsta > ? AND salariu > ?";
        try {
            conn =
                    DriverManager.getConnection("jdbc:derby://localhost:1527/e", "wqe", "1234567");
            pst = conn.prepareStatement(sql);

            Scanner in = new Scanner(System.in);
            System.out.print("Varsta = ");
            int varsta = in.nextInt();

            System.out.print("Salariu = ");
            double salariu = in.nextDouble();

            pst.setInt(1, varsta);
            pst.setDouble(2, salariu);
            
            ResultSet res = pst.executeQuery();
            while(res.next()) {
                String cnp = res.getString("CNP");
                int varsta2 = res.getInt("VARSTA");
                String nume = res.getString("NUME");
                double salariu2 = res.getDouble(4);
                System.out.println(cnp + " " + nume + " " + varsta2 + " " + salariu2);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }


    }
}
