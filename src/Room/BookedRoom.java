package Room;

import DetailsOfBooked.Keycard;
import java.util.NoSuchElementException;
import java.util.Objects;


public class BookedRoom {

    private Room[] rooms;
    private int allBooked;

    public BookedRoom(int maxRoom) {
        this.rooms = new Room[maxRoom];

    }
    
    public void checkPoint(Keycard booked){
        int availableRoom = getAvailableRoom();
        if(availableRoom <= 0){
            System.out.println("Don't have room is Available");
        }else{
            booked.assignKeycard();
            rooms[availableRoom].assignRoom(booked);
            allBooked++;
        }
    }
    
    public void outPoint(Keycard booked){
        Objects.requireNonNull(booked, "Out of room can not be null");
        int findRoomAvailable = searchRoom(booked);
        if(findRoomAvailable == -1)
            throw new NoSuchElementException();
          booked.returnKeycard();
          rooms[findRoomAvailable].removeRoom();
          allBooked--;
    }

    public int searchRoom(Keycard booked) {
        Objects.requireNonNull(booked, "searching room cannot be null");
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i].isAvailable()==false){
                if((rooms[i].getRoom()).equals(booked))
                    return i;
            }
        }
        return -1;
    }

    private int getAvailableRoom() {
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i].isAvailable())
                return i;
            }
        return -1;
    }

    @Override
    public String toString() {
        return "BookedRoom{" + "rooms=" + rooms + ", allBooked=" + allBooked + '}';
    }   
        

}
