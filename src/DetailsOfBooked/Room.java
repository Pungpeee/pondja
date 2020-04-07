package DetailsOfBooked;

public class Room {

    private String room;
    private boolean available;
    private RoomForHotel roomType;

    public Room(String room) {
        this.room = room;
        available = true;
    }

    public void assignRoom(RoomForHotel roomType) {
        this.roomType = roomType;
        this.available = false;

    }

    public boolean isAvailable() {
        return available;
    }

    public RoomForHotel getRoom() {
        return roomType;
    }

    public void removeRoom() {

        this.roomType = null;
        this.available = true;

    }

    @Override
    public String toString() {
        
        StringBuilder str=new StringBuilder();
        str.append("Room" + "KeycardId =" + room + ":" + "Available: " + available);
        if(available==false) 
            str.append(" "+roomType.toString()+'}');
        return str.toString();
    }
    
}
