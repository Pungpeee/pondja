
import static Database.DB.testDB;
import Hotel.Guest;
import Room.BookedRoom;
import Room.DoubleRoom;
import Room.QuadRoom;
import Room.SingleRoom;
import Room.SuiteRoom;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    private static int number;

    public static void main(String[] args) {
        BookedRoom bk = new BookedRoom();
        Guest g = new Guest();
        SingleRoom sr = new SingleRoom();
        DoubleRoom dr = new DoubleRoom();
        QuadRoom qr = new QuadRoom();
        SuiteRoom se = new SuiteRoom();
        Scanner num = new Scanner(System.in);

        System.out.println("--------------------<< Booked Room >>----------------------");
        g.setFirstname();
        g.setSurname();
        testDB(g.getFirstname(), g.getSurname());
        do {
            System.out.println("");
            System.out.println("Choose type of room you want");
            System.out.println("1. Single Room : Total " + sr.maxrooms + " rooms");
            System.out.println("2. Double Room : Total " + dr.maxrooms + " rooms");
            System.out.println("3. Quad Room : Total " + qr.maxrooms + " rooms");
            System.out.println("4. Suite Room : Total " + se.maxrooms + " rooms");
            System.out.println("5. EXIT");
            System.out.print("You choose : ");

            try {
                int number;
                number = num.nextInt();

//                switch(number){
//                    case 1:
//                        testDB(g.getFirstname(), g.getSurname(), "Single Room", 2);
//                        break;
//                    case 2:
//                        testDB(g.getFirstname(), g.getSurname(), "Double Room", 3);
//                        break;
//                    case 3:
//                        testDB(g.getFirstname(), g.getSurname(), "Quad Room", 4);
//                        break;
//                    case 4:
//                        testDB(g.getFirstname(), g.getSurname(), "Suite Room", 5);
//                        break;
//                }
                if (number == 1) {
                    System.out.println("Single Room");
                    sr.checkInSingleRoom();
//                    sr.checkInForSingleRoom(1);
//                    sr.checkOut();
//                    sr.calculateRoomDays();

                } else if (number == 2) {
                    System.out.println("Double Room");
                    dr.checkInDoubleRoom();

                } else if (number == 3) {
                    System.out.println("Quad Room");
                    qr.checkInQuadRoom();

                } else if (number == 4) {
                    System.out.println("Suite Room");
                    se.checkInSuiteRoom();

                } else if (number == 5) {
                    System.out.println("Thank you");
                    return;

                } else {
                    System.out.println("Please try again");

                }

            } catch (InputMismatchException p) {
                System.out.println("Please insert number only.");
                System.out.println("    ");
                System.out.println("-----Please try again-----");
                num.nextLine();
            }

        } while (number != 6);
    }

}
