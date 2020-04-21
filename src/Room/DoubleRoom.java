package Room;

import Hotel.PricePerRoom;
import Hotel.Status;
import java.util.Scanner;

public class DoubleRoom {
    protected int countEmptyRooms = 0;
    protected int maxrooms = 10;
    private Room[] rooms;
    Scanner input = new Scanner(System.in);

    public DoubleRoom() {
    }

    public void checkInDoubleRoom() {
        int maxrooms;
        int countEmptyRooms;
        int[] rooms = new int[10];

        for (int total = 0; total < rooms.length; total++) {
            System.out.print(" Total : ");
            total = input.nextInt(); 
            
        
            if (total >= 1 && total <= 10) {
                System.out.println("Status : " + Status.BOOKED);
                maxrooms = this.maxrooms - total;
                System.out.println("NOW!! Total of room is AVAILABLE = " + maxrooms);
                countEmptyRooms = this.countEmptyRooms + total;
                System.out.println("NOW!! Total of room is BOOKED = " + countEmptyRooms);
            } else if (total > 10) {
                System.out.println("You can't booked");
            }return ;
        }

    }
}
