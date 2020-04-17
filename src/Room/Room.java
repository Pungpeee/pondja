
package Room;

import DetailsOfBooked.Keycard;
import Hotel.Status;

public class Room {
   
    protected Status statusRoom;
    private Keycard roomType;

    public Room(Status statusRoom) {
        this.statusRoom = statusRoom;
    }

    public Status getStatusRoom() {
        return statusRoom;
    }

    @Override
    public String toString() {
        return "Room{" + "statusRoom=" + statusRoom + ", roomType=" + roomType + '}';
    }
    
 
}
