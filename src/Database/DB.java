package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DB {    //วณิศรา 62130500079

    public static void testDB(String fname, String sname, String tor, int amr,int day) {

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel", "hotel", "hotel");  
            Statement stm = con.createStatement();

            
            stm.executeUpdate("INSERT INTO hotel VALUES ('" + fname + "','" + sname + "' ,'" + tor + "'," + amr + "," + day +"  )");
            stm.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static void testSelectFromHotelTable() {

        try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel", "hotel", "hotel");
                Statement stmt = con.createStatement()) {
            ResultSet n_rs = stmt.executeQuery("SELECT * FROM hotel");
            while (n_rs.next()) {
                System.out.println(n_rs.getString("Name"));
                System.out.println(n_rs.getString("Surname"));
                System.out.println(n_rs.getString("TypeOfRoom"));
                System.out.println(n_rs.getInt("AmountRoom"));
                System.out.println(n_rs.getInt("day"));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
