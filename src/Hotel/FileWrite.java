package Hotel;

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

public class FileWrite {

    public static void fileWriter(String firstname, String surname, LocalDate checkOut) {

        try {
            FileWriter w = new FileWriter("Keycard.txt");
            PrintWriter p = new PrintWriter(w);
            p.println("Name: " + firstname + " Surname: " + surname);
            p.println("Your checkout :  " + checkOut);
            p.println("---This is your Keycard---" + "\t");
            p.println("---Please bring it to the hotel staff. ---");
            p.close();

        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
//     public static void fileWriter2(String firstname, String surname, LocalDate checkOut) {
//
//        try {
//            FileWriter w = new FileWriter("Keycard2.txt");
//            PrintWriter p = new PrintWriter(w);
//            p.println("Name: " + firstname + " Surname: " + surname);
//            p.println("Your checkout :  " + checkOut);
//            p.println("---This is your Keycard---" + "\t");
//            p.println("---Please bring it to the hotel staff. ---");
//            p.close();
//
//        } catch (IOException e) {
//            System.out.println("Error");
//            e.printStackTrace();
//        }
//    }
//    

    public static void FileReader() {
        try {
            FileReader r = new FileReader("keycard2.txt");
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
