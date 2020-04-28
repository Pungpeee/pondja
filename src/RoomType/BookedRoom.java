package RoomType;

import DetailsOfBooked.KeycardStatus;
import Hotel.PricePerRoom;
import static RoomType.SingleRoom.number;
import java.time.LocalDate;
import java.util.Scanner;

public abstract class BookedRoom implements PricePerRoom{
//    public static int number;
//    public int countRooms = 0;
//    public int maxrooms = 10;  
//    public int total;
//    int days;
    
    private static int runningId = 1;
    private String keycardId;
    LocalDate checkIn;
    LocalDate checkOut;
    int payedAmount;
    KeycardStatus keycardStatus;


    public BookedRoom() {
    }

    public BookedRoom(String keycardId, LocalDate checkIn, LocalDate checkOut, int payedAmount, KeycardStatus keycardStatus) {
        this.keycardId = keycardId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.payedAmount = payedAmount;
        this.keycardStatus = keycardStatus;
    }

   
    
    public abstract void checkOut();
    public abstract void calculateRoomDays();
    }


            
            
   
    

