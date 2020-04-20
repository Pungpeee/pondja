
import Hotel.Guest;
import Room.BookedRoom;
import Room.SingleRoom;
import java.util.Scanner;

public class Test {

    private static int number;

    public static void main(String[] args) {
        BookedRoom bk = new BookedRoom();
        Guest g = new Guest();
        SingleRoom sr = new SingleRoom();
        Scanner num = new Scanner(System.in);

//        do {
            System.out.println("--------------------<< Main Menu >>----------------------");
            System.out.println("Booked Room");
            System.out.print(g.getFirstname() + g.getSurname());
                g.setFirstname();
                g.setSurname();
            
            System.out.println("Choose type of room you want");
            System.out.println("1. Single Room");
            System.out.println("2. Double Room");
            System.out.println("3. Quad Room");
            System.out.println("4. Suite Room");
            System.out.print("You choose : ");

            number = num.nextInt();
            
            System.out.println("Enter Your Menu(1-4) : ");
            if (number == 1) {
                System.out.println("Single Room");
                sr.checkInSingleRoom();
                
//                sr.isAvailable();
//                sr.numberOfRooms();

            } else if (number == 2) {
                System.out.println("Double Room");
                bk.checkInDoubleRoom();

            } else if (number == 3) {
                System.out.println("Quad Room");
                bk.checkInQuadRoom();

            } else if (number == 4){
                System.out.println("Suite Room");
                bk.checkInSuiteRoom();
            }else{
                System.out.println("Please try again");
            }while (number != 5);

    }
}
