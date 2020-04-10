package Room;

import DetailsOfBooked.Keycard;
import DetailsOfBooked.Keycard;
import Hotel.Status;

public class Room extends Hotel{

    private String nameOfRooms;
    private boolean available;
    private Keycard roomType;

    public Room(String nameOfRooms, Status statusRoom) {
        super(nameOfRooms, statusRoom);
    }

    

    public void assignRoom(Keycard roomType) {
        this.roomType = roomType;
        this.available = false;

    }

    public boolean isAvailable() {
        return available;
    }

    public int getRoom() {
        return emptyRoom();
    }

    public void removeRoom() {

        this.roomType = null;
        this.available = true;

    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();
        str.append("Room" + "KeycardId =" + nameOfRooms + ":" + "Available: " + available);
        if (available == false) {
            str.append(" " + roomType.toString() + '}');
        }
        return str.toString();
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
