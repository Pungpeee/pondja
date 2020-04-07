package DetailsOfBooked;

import DetailsOfBooked.KeycardStatus;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class RoomPrice extends BookedRoom{

    private static int runningId;
    private String keycardId;
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;
    private double payAmount;
    private KeycardStatus keycardStatus;

    public RoomPrice() {
    }

    public void checkInHotel() {
        this.keycardId = LocalDate.now() + "-" + runningId++;
        this.checkInTime = LocalDateTime.of(LocalDate.MIN, LocalTime.MIN);
        keycardStatus = keycardStatus.STAY;
    }

    public void checkOutHotel() {
        this.checkOutTime = LocalDateTime.now();
        this.payAmount = calculateRoomPrice();
        keycardStatus = keycardStatus.LEAVE;
        System.out.println(toString());
    }

    private long calculateRoomPrice() {
        long days = ChronoUnit.DAYS.between(checkInTime, checkOutTime);
        System.out.println("Days :" + days);
        return days*BookedRoom.ROOM_RATE;
    }

    @Override
    public String toString() {
        return "RoomPrice{" + "keycardId=" + keycardId + ", checkInTime=" + checkInTime + ", checkOutTime=" + checkOutTime + ", payAmount=" + payAmount + ", keycardStatus=" + keycardStatus + '}';
    }
}
