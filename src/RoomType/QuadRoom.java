package RoomType;

import Keycard.KeycardStatus;
import static RoomType.PricePerRoom.PRICE_QuadRoom;
import Hotel.Status;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class QuadRoom extends BookedRoom{
    public static int number;
    public int countRooms = 0;
    public int maxrooms = 10;  
    public int total;
    public int days;

    private static int runningId = 1;
    private String keycardId;
    public LocalDate checkIn;
    public LocalDate checkOut;
    public int payedAmount;
    public KeycardStatus keycardStatus;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";


    public QuadRoom() {
    }

    public void checkInQuadRoom() {
        Scanner num = new Scanner(System.in);
        int maxroom;
        int countRooms;
        
        for (int total = 0; total < this.maxrooms; total++) {
            
            this.maxrooms =maxrooms;
            System.out.print(" Total : ");
            total = num.nextInt();

            if (total >= 1 && total <= 10) {
                System.out.println("Status : " + Status.BOOKED);
                maxroom = this.maxrooms - total;
                this.maxrooms = this.maxrooms - total;
                System.out.println(ANSI_YELLOW + "NOW!! Total of room is AVAILABLE = " + ANSI_RESET + maxroom );
                countRooms = this.countRooms + total;
                this.countRooms = this.countRooms + total;
                System.out.println(ANSI_YELLOW + "NOW!! Total of room is BOOKED = " + ANSI_RESET + countRooms);
                //System.out.println(this.countRooms);
                this.total = total;
                this.maxrooms = maxroom;
                this.countRooms = countRooms;
                return;

            } else if (total > 10) {
                System.out.println("You can't booked");
                return;
            }

        }
    }

    public void checkInForQuadRoom() {
        Scanner num = new Scanner(System.in);
        int day;
        System.out.print("How many days do u want: ");
        day = num.nextInt();
        days = days + day;
        System.out.println("---You have already booked for " + day + " Day---");
        this.keycardId = LocalDate.now() + " NO. " + runningId++;
        keycardStatus = keycardStatus.STAY;
        System.out.println("Keycard Status : " + keycardStatus);
        System.out.println("This is your keycard: " + Status.BOOKED + " on " + keycardId);
        this.checkIn = LocalDate.now();
        this.checkOut = this.checkIn.plusDays(day);
        System.out.println("You must pay and checkout in : " + this.checkOut);
    }

    public void calculateRoomDays() {
        int price;
        price = (days * PRICE_QuadRoom) * countRooms;
//        long days = ChronoUnit.DAYS.between(checkIn, checkIn);
        //ChronoUnit.DAYS.between(checkIn, checkOut);
        this.payedAmount = price;
        System.out.println("Price : " + price);
    }

    public void checkOut() {
        Scanner num = new Scanner(System.in);
        this.checkOut = this.checkIn.plusDays(days);
        System.out.println("Date of you checkout : " + this.checkOut);
        System.out.println("You must pay : " + this.payedAmount);
        do {
            System.out.println("Pay");
            System.out.print("Total you pay: ");
            int number;
            number = num.nextInt();
            System.out.println();

            if (number == this.payedAmount) {
                keycardStatus = keycardStatus.LEAVE;
                System.out.println("Keycard Status : " + keycardStatus);
                System.out.println(ANSI_GREEN + "-----You successfully paid, Thank You-----\n" + ANSI_RESET);
                maxrooms = maxrooms + this.countRooms;
                System.out.println("NOW!! Total of room is AVAILABLE = " + (maxrooms));
                return;
            } else if (number < this.payedAmount || number > this.payedAmount) {
                System.out.println(ANSI_RED + "----You will have to pay the specified amount----" + ANSI_RESET);
                System.out.println(ANSI_RED + "-----Please try again-----" + ANSI_RESET);
            }  
        } while (number < this.payedAmount || number > this.payedAmount);
    }
     public LocalDate checkOutTime(){
        return checkOut;
    }
}
