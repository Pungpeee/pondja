
import static Database.DB.testDB;

import Hotel.FileWrite;
import static Hotel.FileWrite.fileWriter;
import static Hotel.FileWrite.fileWriter2;
import RoomType.BookedRoom;
import Hotel.Guest;
import RoomType.DoubleRoom;
import RoomType.QuadRoom;
import RoomType.Room;
import RoomType.SingleRoom;
import RoomType.SuiteRoom;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    private static int number;
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) {
        Guest g = new Guest();
        SingleRoom sr = new SingleRoom();
        DoubleRoom dr = new DoubleRoom();
        QuadRoom qr = new QuadRoom();
        SuiteRoom se = new SuiteRoom();
        FileWrite fw = new FileWrite();

        Scanner num = new Scanner(System.in);

        System.out.println("--------------------<< Booked Room >>----------------------");

        do {
            System.out.println("");
            System.out.println("--------------Choose menu do you want-----------------");
            System.out.println(ANSI_CYAN + "1. Booked Single Room : Total " + sr.maxrooms + " rooms" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "2. Booked Double Room : Total " + dr.maxrooms + " rooms" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "3. Booked Quad Room : Total " + qr.maxrooms + " rooms" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "4. Booked Suite Room : Total " + se.maxrooms + " rooms" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "5. Check Out" + ANSI_RESET);
            System.out.println(ANSI_RED + "6. EXIT" + ANSI_RESET);
            System.out.print(ANSI_YELLOW + "You choose : " + ANSI_RESET);

            try {
                int number;
                number = num.nextInt();

                if (number == 1) {

                    System.out.println("    ");
                    System.out.println(ANSI_CYAN + "---Single Room---" + ANSI_RESET);
                    g.setFirstname();
                    g.setSurname();
                    sr.checkInSingleRoom();
                    sr.checkInForSingleRoom();
                    sr.calculateRoomDays();
                    fileWriter(g.getFirstname(), g.getSurname(), sr.checkOutTime(), "Single Room");

                } else if (number == 2) {
                    System.out.println("    ");
                    System.out.println(ANSI_CYAN + "---Double Room---" + ANSI_RESET);
                    g.setFirstname();
                    g.setSurname();
                    dr.checkInDoubleRoom();
                    dr.checkInForDoubleRoom();
                    dr.calculateRoomDays();
                    fileWriter(g.getFirstname(), g.getSurname(), dr.checkOutTime(), "Double Room");

                } else if (number == 3) {
                    System.out.println("    ");
                    System.out.println(ANSI_CYAN + "---Quad Room---" + ANSI_RESET);
                    g.setFirstname();
                    g.setSurname();
                    qr.checkInQuadRoom();
                    qr.checkInForQuadRoom();
                    qr.calculateRoomDays();
                    fileWriter(g.getFirstname(), g.getSurname(), qr.checkOutTime(), "Quad Room");

                } else if (number == 4) {
                    System.out.println("    ");
                    System.out.println(ANSI_CYAN + "---Suite Room---" + ANSI_RESET);
                    g.setFirstname();
                    g.setSurname();
                    se.checkInSuiteRoom();
                    se.checkInForSuiteRoom();
                    se.calculateRoomDays();
                    fileWriter(g.getFirstname(), g.getSurname(), se.checkOutTime(), "Suite Room");

                } else if (number == 5) {
                    do {
                        System.out.println("--------Check Out--------");
                        System.out.println(ANSI_CYAN + "1. CheckOut Single Room : " + sr.maxrooms + " rooms" + ANSI_RESET);
                        System.out.println(ANSI_CYAN + "2. CheckOut Double Room : " + dr.maxrooms + " rooms" + ANSI_RESET);
                        System.out.println(ANSI_CYAN + "3. CheckOut Quad Room : " +  qr.maxrooms + " rooms" + ANSI_RESET);
                        System.out.println(ANSI_CYAN + "4. CheckOut Suite Room : " + se.maxrooms + " rooms" + ANSI_RESET);
                        System.out.print(ANSI_YELLOW + "Select your room type : " + ANSI_RESET);
                        try{
                            int select;
                            select = num.nextInt();
                            if (select == 1) {
                                sr.checkOut();
                                fileWriter2(g.getFirstname(), g.getSurname(), sr.checkOutTime(), sr.payedAmount, sr.countRooms, "Single Room", sr.days);
                                fw.FileReader();

                            } else if (select == 2) {
                                dr.checkOut();
                                fileWriter2(g.getFirstname(), g.getSurname(), dr.checkOutTime(), dr.payedAmount, dr.countRooms, "Double Room", dr.days);
                                fw.FileReader();

                            } else if (select == 3) {
                                qr.checkOut();
                                fileWriter2(g.getFirstname(), g.getSurname(), qr.checkOutTime(), qr.payedAmount, qr.countRooms, "Quad Room", qr.days);
                                fw.FileReader();

                            } else if (select == 4) {
                                se.checkOut();
                                fileWriter2(g.getFirstname(), g.getSurname(), se.checkOutTime(), se.payedAmount, se.countRooms, "Suite Room", se.days);
                                fw.FileReader();
                            } else {
                                System.out.println(ANSI_RED + "---Please choose the number that match to the room you want check out---" + ANSI_RESET);
                                
                            }        
                        }catch(Exception e){
                                System.out.println(ANSI_RED + "---Please try again---" + ANSI_RESET);
                                num.nextLine();
                        }
                                
                         
                    } while (number > 0 && number < 5);
                    

                } else if (number == 6) {
                    System.out.println(ANSI_GREEN + "-----Thank you-----" + ANSI_RESET);

                    return;

                } else {
                    System.out.println(ANSI_RED + "---Please try again---" + ANSI_RESET);
                }
                
                switch (number) {
                    case 1:
                        testDB(g.getFirstname(), g.getSurname(), "Single Room", sr.countRooms, sr.days);
                        break;
                    case 2:
                        testDB(g.getFirstname(), g.getSurname(), "Double Room", dr.countRooms, dr.days);
                        break;
                    case 3:
                        testDB(g.getFirstname(), g.getSurname(), "Quad Room", qr.countRooms, qr.days);
                        break;
                    case 4:
                        testDB(g.getFirstname(), g.getSurname(), "Suite Room", se.countRooms, se.days);
                        break;

                }
            } catch (InputMismatchException p) {
                System.out.println(ANSI_RED + "----Please insert number only----" + ANSI_RESET);
                System.out.println(ANSI_RED + "-----Please try again-----" + ANSI_RESET);
                num.nextLine();
            }

        } while (number != 7);
    }

}
