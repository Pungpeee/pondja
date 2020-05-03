package RoomType;

import Keycard.KeycardStatus;
import static RoomType.PricePerRoom.PRICE_SingleRoom;
import Hotel.Status;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
import Hotel.FileWrite;
import static RoomType.QuadRoom.ANSI_RESET;
import static RoomType.QuadRoom.ANSI_YELLOW;
import static RoomType.SuiteRoom.ANSI_RED;
import static RoomType.SuiteRoom.ANSI_RESET;

public class SingleRoom extends BookedRoom {

    private int number;
    private int countRooms = 0;
    private int maxrooms = 10;
    private int total;
    private int days;

    private static int runningId = 1;
    private String keycardId;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int payedAmount;
    private KeycardStatus keycardStatus;
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public SingleRoom() {
    }

    public void checkInSingleRoom() {                       //ญานิกา 62130500020
        Scanner num = new Scanner(System.in);
        int maxroom;
        int countRooms;

        for (int total = 0; total < this.maxrooms; total++) {
            this.maxrooms = maxrooms;
            System.out.print(" Total : ");
            total = num.nextInt();

            if (total >= 1 && total <= 10) {
                  System.out.println("Status : " + Status.BOOKED);
                maxroom = this.maxrooms - total;
                this.maxrooms = this.maxrooms - total;
                System.out.println(ANSI_YELLOW + "NOW!! Total of room is AVAILABLE = " + ANSI_RESET + maxroom);
                countRooms = this.countRooms + total;
                this.countRooms = this.countRooms + total;
                System.out.println(ANSI_YELLOW + "NOW!! Total of room is BOOKED = " + ANSI_RESET + countRooms);
                this.total = total;
                this.maxrooms = maxroom;
                this.countRooms = countRooms;
                checkInForSingleRoom();
                
                
                return;
         

            } else if (total > 10) {
                System.out.println(ANSI_RED + "----You can't booked.----" + ANSI_RESET);
                
            }
          }
        
    }

    public void checkInForSingleRoom() {      //วณิศรา 62130500079
        Scanner num = new Scanner(System.in);
        int day;
        System.out.println("    ");
        System.out.print("How many days do you want: ");
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

    public void calculateRoomDays() {               //วรัทยา 62130500083
        int price;
        price = (days * PRICE_SingleRoom) * countRooms;
        this.payedAmount = price;
        System.out.println("Price : " + price);
    }

    @Override
    public void checkOut() {                        //ญานิกา 62130500020
        Scanner num = new Scanner(System.in);
        this.checkOut = this.checkIn.plusDays(days);
        System.out.println("Date of you checkout : " + this.checkOut);
        System.out.println("You must pay : " + this.payedAmount);
        do {
            System.out.println("---Payment---");
            System.out.print(ANSI_YELLOW + "Total you pay = " + ANSI_RESET);
            int number;
            number = num.nextInt();
            System.out.println();

            if (number == this.payedAmount) {
                keycardStatus = keycardStatus.LEAVE;
                System.out.println("Keycard Status : " + keycardStatus);
                System.out.println(ANSI_GREEN + "-----You successfully paid, Thank You-----\n" + ANSI_RESET);
                maxrooms = maxrooms + this.countRooms;
                this.countRooms = this.countRooms - total;
                System.out.println("NOW!! Total of room is AVAILABLE = " + (maxrooms));
                return;
            } else if (number < this.payedAmount || number > this.payedAmount) {
                System.out.println(ANSI_RED + "----You will have to pay the specified amount----" + ANSI_RESET);
                System.out.println(ANSI_RED + "-----Please try again-----" + ANSI_RESET);
            }
        } while (number < this.payedAmount || number > this.payedAmount);
    }

    public int getTotal() {
        return total;
    }

    public int getPayedAmount() {
        return payedAmount;
    }
    
    public int getDays(){
        return days;
    }
    
    public int getMaxrooms(){
        return maxrooms;
    }

    public LocalDate checkOutTime() {
        return checkOut;
    }
}
