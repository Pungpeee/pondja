package Room;

import Hotel.PricePerRoom;
import Hotel.Status;

public class QuadRoom extends Hotel implements PricePerRoom {

    private String nameOfRooms;
    private Status statusRoom;

    public QuadRoom(String nameOfRooms, Status statusRoom) {
        super(nameOfRooms, statusRoom);
    }

    @Override
    public int numberOfRooms() {
        int[] rooms = new int[]{301, 302, 303, 304, 305, 306, 307, 308, 309, 310};
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("names[" + i + "] = " + rooms[i]);
        }
        return rooms.length;
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
