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
    public String toString() {
        return super.toString()+ keycardT.toString();
    }
}
