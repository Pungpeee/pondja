package Hotel;

import DetailsOfBooked.KeycardStatus;
import java.time.LocalDate;
import java.util.Scanner;

public abstract class BookedRoom implements PricePerRoom{
    public static int number;
    public int countRooms = 0;
    public int maxrooms = 10;  
    public int total;

    public static int runningId = 1;
    public String keycardId;
    public LocalDate checkIn;
    public LocalDate checkOut;
    public int payedAmount;
    public KeycardStatus keycardStatus;
    public int days;

    public BookedRoom() {
    }
    
    
    public BookedRoom(int total, String keycardId, LocalDate checkIn, LocalDate checkOut, int payedAmount, KeycardStatus keycardStatus, int days) {
        this.total = total;
        this.keycardId = keycardId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.payedAmount = payedAmount;
        this.keycardStatus = keycardStatus;
        this.days = days;
    }
    
    public abstract void checkInSingleRoom();
    public abstract void checkInForSingleRoom();
    public abstract void calculateRoomDays();
    public abstract void checkOut();
}
