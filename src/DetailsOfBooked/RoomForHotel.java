package DetailsOfBooked;

import Hotel.Status;
import Room.TypeOfRoom;


public class RoomForHotel extends TypeOfRoom{
    private RoomPrice keycardT;

    public RoomForHotel(String nameOfRooms, Status statusRoom) {
        super(nameOfRooms, statusRoom);
    }

    public void assignKeycard() {
        //this.keycardT=new RoomPrice();
        this.keycardT.checkInHotel();
    }

    public void returnKeycard() {
        this.keycardT.checkOutHotel();
    }

    @Override
    public int numberOfRooms() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int emptyRoom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "RoomForHotel{" + "keycardT=" + keycardT + '}';
    }

    @Override
    public boolean isAvailable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
