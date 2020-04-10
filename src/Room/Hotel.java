
package Room;

import Hotel.PricePerRoom;
import Hotel.Status;
import java.util.Objects;

public abstract class Hotel implements PricePerRoom {
    
    private String nameOfRooms;
    private Status statusRoom;
    

    public Hotel(String nameOfRooms, Status statusRoom) {
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
    @Override
    public boolean equals(Object obj) {
       
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hotel other = (Hotel) obj;
        if (!Objects.equals(this.nameOfRooms, other.nameOfRooms)) {
            return false;
        }
        return true;
    }
    

    
    
    public abstract int numberOfRooms();
    public abstract int emptyRoom();
    public abstract boolean isAvailable();
}
