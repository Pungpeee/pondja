import static Database.DB.testDB;
import Hotel.BookedRoom;
import Hotel.Guest;
import RoomType.CheckOut;
import RoomType.DoubleRoom;
import RoomType.QuadRoom;
import RoomType.SingleRoom;
import RoomType.SuiteRoom;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    private static int number;

    public static void main(String[] args) {
        Guest g = new Guest();
        CheckOut ch = new CheckOut();
        SingleRoom sr = new SingleRoom();
        DoubleRoom dr = new DoubleRoom();
        QuadRoom qr = new QuadRoom();
        SuiteRoom se = new SuiteRoom();
//        BookedRoom br = new SingleRoom();
        Scanner num = new Scanner(System.in);

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
                    System.out.println("Single Room");
//                    g.setFirstname();
//                    g.setSurname();
                    sr.checkInSingleRoom();
                    sr.checkInForSingleRoom();
                    sr.calculateRoomDays();
//                    br.checkOut();
                    
                    
                } else if (number == 2) {
                    System.out.println("Double Room");
                    g.setFirstname();
                    g.setSurname();
                    dr.checkInDoubleRoom();
//                    sr.checkInForSingleRoom(1);
//                    sr.checkOut();
//                    sr.calculateRoomDays();
                    
                } else if (number == 3) {
                    System.out.println("Quad Room");
                    g.setFirstname();
                    g.setSurname();
                    qr.checkInQuadRoom();
//                    sr.checkInForSingleRoom(1);
//                    sr.checkOut();
//                    sr.calculateRoomDays();
                    
                } else if (number == 4) {
                    System.out.println("Suite Room");
                    g.setFirstname();
                    g.setSurname();
                    se.checkInSuiteRoom();
//                    sr.checkInForSingleRoom(1);
//                    sr.checkOut();
//                    sr.calculateRoomDays();
                    
                } else if (number == 5) {
                    sr.checkOut();

                } else if (number == 6){
                    System.out.println("Thank you");
                    return;

                } else {
                    System.out.println("Please try again");
                }
                switch (number) {
                    case 1:
                        testDB(g.getFirstname(), g.getSurname(), "Single Room", sr.countRooms);
                        break;
                    case 2:
                        testDB(g.getFirstname(), g.getSurname(), "Double Room", dr.countRooms);
                        break;
                    case 3:
                        testDB(g.getFirstname(), g.getSurname(), "Quad Room", qr.countRooms);
                        break;
                    case 4:
                        testDB(g.getFirstname(), g.getSurname(), "Suite Room", se.countRooms);
                        break;
                }
            } catch (InputMismatchException p) {
                System.out.println("Please insert number only.");
                System.out.println("    ");
                System.out.println("-----Please try again-----");
                num.nextLine();
            }

        } while (number != 7);
    }
}
