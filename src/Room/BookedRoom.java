package Room;

import DetailsOfBooked.Keycard;
import java.util.Objects;


public class BookedRoom {

    private Room[] room;
    private int allBooked;

    public BookedRoom(int maxRoom) {
        this.room = new Room[maxRoom];

    }

    public int searchRoom(Keycard booked) {
        
        for (int i = 0; i < room.length; i++) {
            if(room[i].isAvailable() == false) {
                    if((room[i].getRoom()).equals(booked))
                         return i;
            }
        }
        return -1;
    }
       
             
        

}
