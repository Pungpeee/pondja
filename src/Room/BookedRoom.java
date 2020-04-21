package Room;

import Hotel.PricePerRoom;
import Room.SingleRoom;
import java.util.NoSuchElementException;
import java.util.Objects;
import Room.Room;
import java.util.Scanner;
import Hotel.Status;


public class BookedRoom implements PricePerRoom{
    private String nameCustomer;
    private Hotel[] rooms;
    private int booked;
    private SingleRoom singleRoom;
    private DoubleRoom doubleRoom;
    private QuadRoom quadRoom;
    private SuiteRoom suiteRoom;
    Scanner input = new Scanner(System.in);

    public BookedRoom() {
       
    }
    

    
    @Override
    public String toString() {
        return "BookedRoom :" + "nameCustomer =" + nameCustomer + "rooms =" + rooms + "booked =" + booked + "singleRoom =" + singleRoom + "doubleRoom =" + doubleRoom + "quadRoom =" + quadRoom + "suiteRoom =" + suiteRoom ;
    }       

}
