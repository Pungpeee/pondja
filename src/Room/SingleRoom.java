package Room;

import Hotel.PricePerRoom;
import Hotel.Status;

public class SingleRoom extends Hotel implements PricePerRoom {

    private int countEmptyRooms;
    protected final int maxrooms = 10;
    private Room[] rooms;
    
    
    

    public SingleRoom(int nameOfRooms, Status statusRoom, int countEmptyRooms, Room[] rooms) {
        super(nameOfRooms, statusRoom);
        this.countEmptyRooms = countEmptyRooms;
        this.rooms = rooms;
       
        
    }

    @Override
    public int numberOfRooms() {
        
        for(int i = 0 ;i < maxrooms;i++){
            return maxrooms;
        }
       return -1;
       
    }

    @Override
    public int emptyRoom() {
        return countEmptyRooms;
    }

    @Override
    public boolean isAvailable() {
       int[] rooms = new int[maxrooms]; 
       for (int i = 0; i < maxrooms; i++) {
            if (rooms[i].getStatusRoom() == Status.AVAILABLE) {
                countEmptyRooms++;
            
            }
            return true;
        }
        return false;

    }
        

}





