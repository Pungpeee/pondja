package RoomType;

import Keycard.KeycardStatus;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class BookedRoom implements PricePerRoom {               //วรัทยา 62130500083

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
