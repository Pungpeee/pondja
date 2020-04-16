
package Room;

import DetailsOfBooked.Keycard;

public class Room {
    private String nameOfRooms;
    private boolean available;
    private Keycard roomType;

    public Room(String nameOfRooms) {
        this.nameOfRooms = nameOfRooms;
        available = true;
    }  
    

    public void assignRoom(Keycard roomType) {
        this.roomType = roomType;
        this.available = false;

    }

    public boolean isAvailable() {
        return available;
    }

    public Keycard getRoom(){
        return roomType;
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
}
