package Room;

import Hotel.PricePerRoom;
import Hotel.Status;
import Room.BookedRoom;
import java.util.Scanner;

public class SingleRoom {
    protected int countEmptyRooms = 0;
    protected int maxrooms = 10;
    private Room[] rooms;
    Scanner input = new Scanner(System.in);

    public SingleRoom() {

    }

    public void checkInSingleRoom() {
        int total;
        int maxrooms;
        int countEmptyRooms;
        System.out.println("");
        System.out.print(" Total : ");
        total = input.nextInt();
        System.out.println(Status.BOOKED);
        if (total >= 1 && total <= 10) {
            maxrooms = this.maxrooms - total;
            System.out.println("NOW!! Total of room is AVAILABLE = " + maxrooms);
            countEmptyRooms = this.countEmptyRooms + total;
            System.out.println("NOW!! Total of room is BOOKED = " + countEmptyRooms);
        } else if (total > 10) {
            System.out.print("You can't booked");
        }
    }

//    public int numberOfRooms() {
//        BookedRoom bk = new BookedRoom();
//        int i = bk.input.nextInt();
//            if(i >= 1 && i < 10){        
//                System.out.println("NOW!! Total of room is AVAILABLE =" + maxrooms--);
//            }
//            
//        return 0;
//
//    }
//
//
//    public int isAvailable() {
//        BookedRoom bk = new BookedRoom();
//        int i = bk.input.nextInt();
//            if(i >= 1 && i < 10){       
//                System.out.println("NOW!! Total of room is BOOKED =" + countEmptyRooms++);
//            }
//            
//        return 0;
//
//    }
}
