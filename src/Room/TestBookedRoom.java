package Room;
import Hotel.Status;
import Room.Hotel;
import Room.BookedRoom;
import java.util.Scanner;

public class TestBookedRoom {
    public static void main(String[] args) {
        Hotel h = new SingleRoom(12,Status.AVAILABLE);
        
        System.out.println(h.isAvailable());
    }
       
}
