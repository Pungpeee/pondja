package DetailsOfBooked;

import java.util.NoSuchElementException;
import java.util.Objects;


public class BookedRoom {
    public final static int ROOM_RATE=20;
    private Room[] room;
    private int allBooked;
    
    public BookedRoom(int maxCapacity) {
        this.room = new Room[maxCapacity];
        createRoom();
    }
    
    private void createRoom(){
        for (int i = 0; i < room.length; i++) {
            room[i]=new Room(i+1+"A");
           
        }
    }
    
    public void entryPoint(RoomForHotel roomType){
//        //roomtype.assignKeycard();
//        int availableSpot=getAvailableParkingSpot();
//        if(availableSpot==-1){
//        //    vehicle.returnTicket(); 
//            System.out.println("no available parkingspot");
//        }
//        else{
//            vehicle.assignTicket();//
//            parkingSpots[availableSpot].assignVehicle(vehicle);
//            count++;
//        }       
    }
    public void exitPoint(RoomForHotel roomType){
//        Objects.requireNonNull(vehicle, "exit vehicle cannot be null");
//        int foundParkingSpotAt=searchVehicleInParkingSpot(vehicle);
//        if(foundParkingSpotAt==-1)
//            throw new NoSuchElementException();
//        vehicle.returnTicket();
//        parkingSpots[foundParkingSpotAt].removeVehicle();
//        count--;
    }
      
    public int searchRoomInHotel(RoomForHotel roomType){
//        Objects.requireNonNull(vehicle, "searning vehicle cannot be null");
//        for (int i = 0; i < parkingSpots.length; i++) {
//            if(parkingSpots[i].isFree()==false) {
//                    if((parkingSpots[i].getVehicle()).equals(vehicle))
//                         return i;
//            }
//        }
//        return -1;
//    }
//    public int getAvailableParkingSpot(){
//        for (int i = 0; i < parkingSpots.length; i++) {
//            if(parkingSpots[i].isFree())
//                return i;
//            
//        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder str=new StringBuilder("Parking Lot:\n");
        for (int i = 0; i < room.length; i++) {
              str.append(room[i]+"\n");
            
        }
        str.append("available parking spots: "+(room.length-allBooked));
        return str.toString();
    }
    
    
}

