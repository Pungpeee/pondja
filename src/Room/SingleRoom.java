package Room;

import Hotel.PricePerRoom;
import static Hotel.PricePerRoom.PRICE_SingleRoom;
import Hotel.Status;
import Room.BookedRoom;
import java.time.LocalDate;

import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class SingleRoom {

    public int countEmptyRooms = 0;
    public int maxrooms = 10;
    Scanner input = new Scanner(System.in);
    
    private static int runningId = 1;
    private String keycardId;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private double payedAmount;
    private Status keycardStatus;

    public SingleRoom() {

    }

    public void checkInSingleRoom() {
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

    public void checkInForSingleRoom(int days) {
        System.out.println("How many days do u want: ");
        days = input.nextInt();
         this.keycardId = LocalDate.now() + "-" + runningId++;
         keycardStatus = keycardStatus.BOOKED;
         System.out.println("This is your keycard: "+Status.BOOKED );
        //this.checkIn = LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
        //this.checkIn = LocalDate.of(2020, Month.APRIL, 24);
        this.checkIn = LocalDate.now();
        
    }
    public void checkOut(){
        this.checkOut = LocalDate.now();
        this.payedAmount = calculateRoomDays();
        //System.out.println("Pay Amount:" +this.payedAmount);
        keycardStatus = keycardStatus.AVAILABLE;
        System.out.println(toString());
        
    }
 public long calculateRoomDays(){  
        
            long days = ChronoUnit.DAYS.between(checkIn, checkIn);
    //ChronoUnit.DAYS.between(checkIn, checkOut);
        System.out.println("Days: "+days);
        return days * PRICE_SingleRoom;
        }

    @Override
    public String toString() {
        return "SingleRoom{" + "countEmptyRooms=" + countEmptyRooms + ", maxrooms=" + maxrooms + ", input=" + input + ", keycardId=" + keycardId + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", payedAmount=" + payedAmount + ", keycardStatus=" + keycardStatus + '}';
    }
        
    }


