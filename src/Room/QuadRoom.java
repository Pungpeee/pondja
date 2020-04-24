package Room;

import Hotel.PricePerRoom;
import static Hotel.PricePerRoom.PRICE_QuadRoom;
import Hotel.Status;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class QuadRoom {
    public int countEmptyRooms = 0;
    public int maxrooms = 10;
    Scanner input = new Scanner(System.in);
    
    private static int runningId=1;
    private String keycardId;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private double payedAmount;
    private Status keycardStatus;

    public QuadRoom() {
    }

    public void checkInQuadRoom() {
        int maxrooms;
        int countEmptyRooms;
        for (int total = 0; total < this.maxrooms; total++) {
            System.out.print(" Total : ");
            total = input.nextInt();

            if (total >= 1 && total <= 10) {
                System.out.println("Status : " + Status.BOOKED);
                maxrooms = this.maxrooms - total;
                this.maxrooms = this.maxrooms - total;
                System.out.println("NOW!! Total of room is AVAILABLE = " + maxrooms);
                countEmptyRooms = this.countEmptyRooms + total;
                this.countEmptyRooms = this.countEmptyRooms + total;
                System.out.println("NOW!! Total of room is BOOKED = " + countEmptyRooms);
                return;
            } else if (total > 10) {
                System.out.println("You can't booked");
                return;
            }

        }

    }
     public void checkInForQuadRoom(){
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
    public long calculateRoomDays(){  
        
            long days = ChronoUnit.DAYS.between(checkIn, checkOut);
        System.out.println("Days: "+days);
        return days * PRICE_QuadRoom;
        }
}
