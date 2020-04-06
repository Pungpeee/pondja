
package Room;

public abstract class TypeOfRoom {
    private int rooms;
    private String nameOfRooms;

    public TypeOfRoom(int rooms, String nameOfRooms) {
        this.rooms = rooms;
        this.nameOfRooms = nameOfRooms;
    }

    public int getRooms() {
        return rooms;
    }

    public String getNameOfRooms() {
        return nameOfRooms;
    }

    @Override
    public String toString() {
        return "TypeOfRoom{" + "rooms=" + rooms + ", nameOfRooms=" + nameOfRooms + '}';
    }
    
    public abstract int numberOfRooms();
    public abstract int emptyRoom();
}
