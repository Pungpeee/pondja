package Room;

import Hotel.PricePerRoom;
import static Hotel.PricePerRoom.PRICE_DoubleRoom;
import Hotel.Status;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class DoubleRoom {

    public int countRooms = 0;
    public int maxrooms = 10;
    Scanner input = new Scanner(System.in);
    public int total;

    private static int runningId = 1;
    private String keycardId;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private double payedAmount;
    private Status keycardStatus;

    public DoubleRoom() {
    }
    
    public int getTotal() {
       
        return countRooms;
    }
    
    public void checkInDoubleRoom() {
        int maxroom;
        int countRooms;
        for (int total = 0; total < this.maxrooms; total++) {
            System.out.print(" Total : ");
            total = input.nextInt();

            if (total >= 1 && total <= 10) {
                System.out.println("Status : " + Status.BOOKED);
                maxroom = this.maxrooms - total;
                this.maxrooms = this.maxrooms - total;
                System.out.println("NOW!! Total of room is AVAILABLE = " + maxroom);
                countRooms = this.countRooms + total;
                this.countRooms = this.countRooms + total;
                System.out.println("NOW!! Total of room is BOOKED = " + countRooms);
               
                return;
                
            } else if (total > 10) {
                System.out.println("You can't booked");
                return;
            }

        }
    }

    public void checkInForDoubleRoom() {
        this.keycardId = LocalDate.now() + "-" + runningId++;
        LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
        //this.checkIn = LocalDateTime.of(2020, Month.FEBRUARY, 28, 16, 10);
        keycardStatus = keycardStatus.BOOKED;
    }

    public void checkOut() {
        this.checkOut = LocalDateTime.now();
        this.payedAmount = calculateRoomDays();
        //System.out.println("Pay Amount:" +this.payedAmount);
        keycardStatus = keycardStatus.AVAILABLE;
        System.out.println(toString());

    }

    public long calculateRoomDays() {

        long days = ChronoUnit.DAYS.between(checkIn, checkOut);
        System.out.println("Days: " + days);
        return days * PRICE_DoubleRoom;
    }
}
