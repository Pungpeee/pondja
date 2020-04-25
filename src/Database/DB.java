package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DB {

    public static void testDB(String fname, String sname, String tor, int amr) {

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/hotel", "hotel", "hotel");
            Statement stm = con.createStatement();

            //stm.executeUpdate("INSERT INTO hotel (firstname,surname) VALUES ('" + fname + "','" + sname + "')");
            stm.executeUpdate("INSERT INTO hotel VALUES ('" + fname + "','" + sname + "' ,'" + tor + "'," + amr + " )");
            stm.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static void testSelectFromHotelTable() {

        try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel", "hotel", "123");
                Statement stmt = con.createStatement()) {
            ResultSet n_rs = stmt.executeQuery("SELECT * FROM hotel");
            while (n_rs.next()) {
                System.out.println(n_rs.getString("Name") + "\t");
                System.out.println(n_rs.getString("Surname"));
                System.out.println(n_rs.getString("TypeOfRoom"));
                System.out.println(n_rs.getString("AmountRoom"));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
//        for (int j = 0; j < i; j++) {s
//            System.out.println(names[j]);
//        }
    }
}
