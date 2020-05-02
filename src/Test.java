
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

    public static void main(String[] args) {
        Guest g = new Guest();
        SingleRoom sr = new SingleRoom();
        DoubleRoom dr = new DoubleRoom();
        QuadRoom qr = new QuadRoom();
        SuiteRoom se = new SuiteRoom();
        FileWrite fw = new FileWrite();

        Scanner num = new Scanner(System.in);
        Scanner sec = new Scanner(System.in);

        System.out.println("--------------------<< Booked Room >>----------------------");

        do {
            System.out.println("");
            System.out.println("--------------Choose menu do you want-----------------");
            System.out.println("1. Booked Single Room : Total " + sr.maxrooms + " rooms");
            System.out.println("2. Booked Double Room : Total " + dr.maxrooms + " rooms");
            System.out.println("3. Booked Quad Room : Total " + qr.maxrooms + " rooms");
            System.out.println("4. Booked Suite Room : Total " + se.maxrooms + " rooms");
            System.out.println("5. Check Out");
            System.out.println("6. EXIT");
            System.out.print("You choose : ");

            try {
                int number;
                number = num.nextInt();

                if (number == 1) {

                    System.out.println("    ");
                    System.out.println("---Single Room---");
                    g.setFirstname();
                    g.setSurname();
                    sr.checkInSingleRoom();
                    sr.checkInForSingleRoom();
                    sr.calculateRoomDays();
                    fileWriter(g.getFirstname(), g.getSurname(), sr.checkOutTime(), "Single Room");

                } else if (number == 2) {
                    System.out.println("    ");
                    System.out.println("---Double Room---");
                    g.setFirstname();
                    g.setSurname();
                    dr.checkInDoubleRoom();
                    dr.checkInForDoubleRoom();
                    dr.calculateRoomDays();
                    fileWriter(g.getFirstname(), g.getSurname(), dr.checkOutTime(), "Double Room");

                } else if (number == 3) {
                    System.out.println("    ");
                    System.out.println("---Quad Room---");
                    g.setFirstname();
                    g.setSurname();
                    qr.checkInQuadRoom();
                    qr.checkInForQuadRoom();
                    qr.calculateRoomDays();
                    fileWriter(g.getFirstname(), g.getSurname(), qr.checkOutTime(), "Quad Room");

                } else if (number == 4) {
                    System.out.println("    ");
                    System.out.println("---Suite Room---");
                    g.setFirstname();
                    g.setSurname();
                    se.checkInSuiteRoom();
                    se.checkInForSuiteRoom();
                    se.calculateRoomDays();
                    fileWriter(g.getFirstname(), g.getSurname(), se.checkOutTime(), "Suite Room");

                } else if (number == 5) {
                    do {
                        System.out.println("--------Check Out--------");
                        System.out.println("1. CheckOut Single Room");
                        System.out.println("2. CheckOut Double Room");
                        System.out.println("3. CheckOut Quad Room");
                        System.out.println("4. CheckOut Suite Room");
                        System.out.print("Select your room type : ");
                        try{
                            int select;
                            select = sec.nextInt();
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
                                System.out.println("---Please try again---");
                            }        
                        }catch(Exception e){
                            System.out.println("---Please choose the number that match to the room you want check out---");
                        }
                                
                         
                    } while (number > 0 && number < 5);
                    

                } else if (number == 6) {

                    System.out.println("---Thank you---");

                    return;

                } else {
                    System.out.println("---Please try again---");
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
                System.out.println("    ");
                System.out.println("Please insert number only.");
                System.out.println("    ");
                System.out.println("-----Please try again-----");
                num.nextLine();
            }

        } while (number != 7);
    }

}
