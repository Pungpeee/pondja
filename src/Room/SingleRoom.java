package Room;

import Hotel.PricePerRoom;
import Hotel.Status;

public class SingleRoom extends Hotel implements PricePerRoom {

   private String nameOfRooms;
    private Status statusRoom;

    public SingleRoom(String nameOfRooms, Status statusRoom) {
        super(nameOfRooms, statusRoom);
    }
    @Override
    public int numberOfRooms() {
       return numberOfRooms();
    }

    @Override
    public int emptyRoom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAvailable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
