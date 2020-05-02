package Hotel;

import RoomType.PricePerRoom;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import Hotel.Guest;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileWrite implements PricePerRoom {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    

    public static void fileWriter(String firstname, String surname, LocalDate checkOut, String tof) {

        try {
            FileWriter w = new FileWriter("Keycard.txt");
            PrintWriter p = new PrintWriter(w);
            p.println("Name: " + firstname + " Surname: " + surname);
            p.println("Type of room : " + tof);
            p.println("Your checkout :  " + checkOut);
            p.println("---This is your Keycard---" + "\t");
            p.println("---Please bring it to the hotel staff. ---");
            p.close();

        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public static void fileWriter2(String firstname, String surname, LocalDate checkOut, int payedAmount, int countRooms, String tof,int days) {

        try {
            FileWriter w = new FileWriter("Receipt.txt");
            PrintWriter p = new PrintWriter(w);
            p.println(ANSI_CYAN + "-----RECEIPT-----\n" + ANSI_RESET);
            p.println("Name: " + firstname + " Surname: " + surname);
            p.println("Your checkout date :  " + checkOut);
            p.println(ANSI_CYAN + "-----Detail-----\n" + ANSI_RESET);
            p.println("Type of room : " + tof);
            String a = new String("Single Room");
            String b = new String("Double Room");
            String c = new String("Quad Room");
            String d = new String("Suite Room");
            if (a.equalsIgnoreCase(tof)) {
                p.println("Price : " + PRICE_SingleRoom + "/room");
            } else if (b.equalsIgnoreCase(tof)) {
                p.println("Price : " + PRICE_DoubleRoom + "/room");
            } else if (c.equalsIgnoreCase(tof)) {
                p.println("Price : " + PRICE_QuadRoom + "/room");
            } else if (d.equalsIgnoreCase(tof)) {
                p.println("Price : " + PRICE_SuiteRoom + "/room");
            }
            p.println("The number of rooms you have reserved : " + countRooms);
            p.println("Number of days booked : "+days);
            p.println(ANSI_GREEN + "Total amount paid : " + payedAmount+" Baht" + ANSI_RESET);

            p.close();

        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public static void FileReader() {
        try {
            FileReader r = new FileReader("Receipt.txt");
            BufferedReader br = new BufferedReader(r);
            String str;
            str = br.readLine();
            while (str != null) {
                System.out.println(str);
                str = br.readLine();
            }
            br.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
