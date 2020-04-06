package Room;

public class SingleRoom extends TypeOfRoom {

    private int rooms;

    public SingleRoom(int rooms, String nameOfRooms) {
        super(rooms, nameOfRooms);
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
