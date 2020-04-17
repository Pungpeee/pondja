
package Room;

import Hotel.PricePerRoom;
import Hotel.Status;
import java.util.Objects;

public abstract class Hotel implements PricePerRoom {
    
    private int nameOfRooms;
    public final Status statusRoom;
    

    public Hotel(int nameOfRooms, Status statusRoom) {
        this.nameOfRooms = nameOfRooms;
        this.statusRoom = statusRoom;
        
    }

    public Status getStatusRoom() {
        return statusRoom;
    }
    
    
    @Override
    public String toString() {
        return "TypeOfRoom{" + "nameOfRooms=" + nameOfRooms + ", statusRoom=" + statusRoom + '}';
    }

    

    
    
    public abstract int numberOfRooms();
    public abstract int emptyRoom();
    public abstract boolean isAvailable();
}
