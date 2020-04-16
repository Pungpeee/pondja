package Room;

import Hotel.PricePerRoom;
import Hotel.Status;

public class SingleRoom extends Hotel implements PricePerRoom {

    private int nameOfRooms;
    //private Status statusRoom;
    private Hotel[] rooms ;
    private int countEmptyRooms;

    public SingleRoom(int nameOfRooms, Status statusRoom) {
        super(nameOfRooms, statusRoom);
        this.nameOfRooms = nameOfRooms;
    }

   

    public int numberOfRooms() {
//        int[] rooms = new int[]{01, 02, 03, 04, 05, 06, 07, 08, 09, 10};
//        for (int i = 0; i < rooms.length; i++) {
//            System.out.println("names[" + i + "] = " + rooms[i]);
//        }
//        return rooms.length;
        return rooms.length;
    }

    public int emptyRoom() {
        return countEmptyRooms;
    }

    public boolean isAvailable() {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getStatusRoom() == Status.AVAILABLE) {
                countEmptyRooms++;
            }
            return true;
        }
        return false;

    }

}
