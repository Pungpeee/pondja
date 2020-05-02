package RoomType;

import Keycard.KeycardStatus;
import static RoomType.SingleRoom.number;
import java.time.LocalDate;
import java.util.Scanner;

public abstract class BookedRoom implements PricePerRoom{
    
    private static int runningId = 1;
    private String keycardId;
    LocalDate checkIn;
    LocalDate checkOut;
    int payedAmount;
    KeycardStatus keycardStatus;


    public BookedRoom() {
    }   
    
    public abstract void checkOut();
    public abstract void calculateRoomDays();
    }


            
            
   
    

