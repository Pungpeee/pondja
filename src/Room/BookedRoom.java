package Room;

import Hotel.PricePerRoom;
import Room.SingleRoom;
import java.util.NoSuchElementException;
import java.util.Objects;
import Room.Room;
import java.util.Scanner;
import Hotel.Status;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class BookedRoom implements PricePerRoom {

    private Room[] rooms;
    private int booked;
    private SingleRoom singleRoom;
    private DoubleRoom doubleRoom;
    private QuadRoom quadRoom;
    private SuiteRoom suiteRoom;
    Scanner input = new Scanner(System.in);
    
    private static int runningId=1;
    private String keycardId;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private double payedAmount;
    private Status keycardStatus;

  
     public void checkInForSingleRoom(){
        this.keycardId = LocalDate.now()+"-"+runningId++;
        LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
        //this.checkIn = LocalDateTime.of(2020, Month.FEBRUARY, 28, 16, 10);
        keycardStatus = keycardStatus.BOOKED;
    }
    public void checkInForDoubleRoom(){
        this.keycardId = LocalDate.now()+"-"+runningId++;
        LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
        //this.checkIn = LocalDateTime.of(2020, Month.FEBRUARY, 28, 16, 10);
        keycardStatus = keycardStatus.BOOKED;
    }
    public void checkInForQuadRoom(){
        this.keycardId = LocalDate.now()+"-"+runningId++;
        LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
        //this.checkIn = LocalDateTime.of(2020, Month.FEBRUARY, 28, 16, 10);
        keycardStatus = keycardStatus.BOOKED;
    }
    public void checkInForSuiteRoom(){
        this.keycardId = LocalDate.now()+"-"+runningId++;
        LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
        //this.checkIn = LocalDateTime.of(2020, Month.FEBRUARY, 28, 16, 10);
        keycardStatus = keycardStatus.BOOKED;
    }
     
    
    public void checkOut(){
        this.checkOut = LocalDateTime.now();
        this.payedAmount = calculateRoomDays();
        //System.out.println("Pay Amount:" +this.payedAmount);
        keycardStatus = keycardStatus.AVAILABLE;
        System.out.println(toString());
        
    }
    private long calculateRoomDays(){  
        
            long days = ChronoUnit.DAYS.between(checkIn, checkOut);
        System.out.println("Days: "+days);
        return days * PRICE_SingleRoom;
        }
        
    }
    
    
    


//    public boolean isCheck() {
//        int type;
//        if (type == rooms[i].getFirstname()) {
//            System.out.println("This club has this ID already");
//            return false;
//        }
//    }

    


