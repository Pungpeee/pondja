package Room;

import Room.SingleRoom;
import java.util.NoSuchElementException;
import java.util.Objects;


public class BookedRoom {

    private Room[] rooms;
    private int allBooked;

    public BookedRoom() {
    }
    
    public void setName() {
        System.out.println("");
        System.out.print("Name : ");
    }
    
    public void setTypeOfRoom() {
        System.out.println("");
        System.out.print("What do you want type of room? : ");
        if()
    }
    
    public void setTotalOfRoom() {
        System.out.println("");
        System.out.print("How .... : ");
    }
    
    public void checkInSingleRoom(SingleRoom booked){
        int availableRoom = booked.emptyRoom();
        if(availableRoom <= 0){
            System.out.println("Don't have room is Available");
        }else{
            booked.emptyRoom();
        } 
    }
    
    public void checkInDoubleRoom(DoubleRoom booked){
        int availableRoom = booked.emptyRoom();
        if(availableRoom <= 0){
            System.out.println("Don't have room is Available");
        }else{
            booked.emptyRoom();
        } 
    }
    
    public void checkInQuadRoom(QuadRoom booked){
        int availableRoom = booked.emptyRoom();
        if(availableRoom <= 0){
            System.out.println("Don't have room is Available");
        }else{
            booked.emptyRoom();
        } 
    }
    
    public void checkInSuiteRoom(SuiteRoom booked){
        int availableRoom = booked.emptyRoom();
        if(availableRoom <= 0){
            System.out.println("Don't have room is Available");
        }else{
            booked.emptyRoom();
        } 
    }

//    public BookedRoom(int maxRoom) {
//        this.rooms = new Room[maxRoom];
//
//    }
//    
//    public void checkPoint(Keycard booked){
//        int availableRoom = getAvailableRoom();
//        if(availableRoom <= 0){
//            System.out.println("Don't have room is Available");
//        }else{
//            booked.assignKeycard();
//            rooms[availableRoom].assignRoom(booked);
//            allBooked++;
//        }
//    }
//    
//    public void outPoint(Keycard booked){
//        Objects.requireNonNull(booked, "Out of room can not be null");
//        int findRoomAvailable = searchRoom(booked);
//        if(findRoomAvailable == -1)
//            throw new NoSuchElementException();
//          booked.returnKeycard();
//          rooms[findRoomAvailable].removeRoom();
//          allBooked--;
//    }
//
//    public int searchRoom(Keycard booked) {
//        Objects.requireNonNull(booked, "searching room cannot be null");
//        for (int i = 0; i < rooms.length; i++) {
//            if(rooms[i].isAvailable()==false){
//                if((rooms[i].getRoom()).equals(booked))
//                    return i;
//            }
//        }
//        return -1;
//    }
//
//    private int getAvailableRoom() {
//        for (int i = 0; i < rooms.length; i++) {
//            if(rooms[i].isAvailable())
//                return i;
//            }
//        return -1;
//    }

    @Override
    public String toString() {
        return "BookedRoom{" + "rooms=" + rooms + ", allBooked=" + allBooked + '}';
    }   
        

}
