package DetailsOfBooked;

import Room.RoomPrice;
import Hotel.Status;
import Room.Hotel;


public class Keycard extends Hotel{
    private RoomPrice keycardT;

    public Keycard(String nameOfRooms, Status statusRoom) {
        super(nameOfRooms, statusRoom);
    }

    public void assignKeycard() {
        this.keycardT=new RoomPrice();
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
