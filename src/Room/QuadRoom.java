
package Room;

import Hotel.PricePerRoom;
import Hotel.Status;


public class QuadRoom extends TypeOfRoom implements PricePerRoom{

    private String nameOfRooms;

    public QuadRoom(String nameOfRooms, Status statusRoom) {
        super(nameOfRooms, statusRoom);
    }

    @Override
    public int numberOfRooms() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int emptyRoom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
