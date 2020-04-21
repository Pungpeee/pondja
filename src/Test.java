
import Hotel.Guest;
import Room.BookedRoom;
import Room.DoubleRoom;
import Room.QuadRoom;
import Room.SingleRoom;
import Room.SuiteRoom;
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
        do {
            System.out.println("");
            System.out.println("Choose type of room you want");
            System.out.println("1. Single Room : Total "  +  "rooms");
            System.out.println("2. Double Room : Total 10 rooms");
            System.out.println("3. Quad Room : Total 10 rooms");
            System.out.println("4. Suite Room : Total 10 rooms");
            System.out.println("5. EXIT");
            System.out.print("You choose : ");

            number = num.nextInt();

            if (number == 1) {
                System.out.println("Single Room");
                sr.checkInSingleRoom();
                System.out.println("Thank you");

            } else if (number == 2) {
                System.out.println("Double Room");
                dr.checkInDoubleRoom();
                System.out.println("Thank you");

            } else if (number == 3) {
                System.out.println("Quad Room");
                qr.checkInQuadRoom();
                System.out.println("Thank you");


            } else if (number == 4) {
                System.out.println("Suite Room");
                se.checkInSuiteRoom();
                System.out.println("Thank you");


            } else if (number == 5) {
                System.out.println("Thank you");
                return;

            } else {
                System.out.println("Please try again");
            }
        } while (number != 6);

    }

}
