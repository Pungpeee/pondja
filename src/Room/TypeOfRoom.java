
package Room;

import Hotel.PricePerRoom;
import Hotel.Status;

public abstract class TypeOfRoom implements PricePerRoom {
    
    private String nameOfRooms;
    private Status statusRoom;
    

    public TypeOfRoom(String nameOfRooms, Status statusRoom) {
        this.nameOfRooms = nameOfRooms;
        this.statusRoom = statusRoom;
        
    }

    public String getNameOfRooms() {
        return nameOfRooms;
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
