package Room;

import Hotel.PricePerRoom;
import Hotel.Status;

public class SuiteRoom extends Hotel implements PricePerRoom{

    private String nameOfRooms;
     private Status statusRoom;

    public SuiteRoom(String nameOfRooms, Status statusRoom) {
        super(nameOfRooms, statusRoom);
    }

    @Override
    public int numberOfRooms() {
        int[] rooms = new int[]{401, 402, 403, 404, 405, 406, 407, 408, 409, 410};
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("names[" + i + "] = " + rooms[i]);
        }
        return rooms.length;
    }
    

    @Override
    public int emptyRoom() {
        
    }

    @Override
    public boolean isAvailable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
