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
    
    public void checkInSingleRoom(){
        int total;
        System.out.println("");
        System.out.print(" Total : ");
        total = input.nextInt();
        if(total <= 10 && total >= 1){
            System.out.println(Status.BOOKED);;
      }else if(total > 10 ){
            System.out.print("You can't booked");
      }else{
            System.out.println(Status.AVAILABLE);
      }
    }
    
    public void checkInDoubleRoom(){
        int total;
        System.out.println("");
        System.out.print(" Total : ");
        total = input.nextInt();
        int availableRoom = doubleRoom.emptyRoom();
        if(availableRoom <= 0){
            System.out.println("Sorry,single room is Unavailable");
        }else if (booked > 10){
            System.out.println("You can't booked");
        }else{
            doubleRoom.maxrooms--;
            doubleRoom.emptyRoom();
        }
    }
    
    public void checkInQuadRoom(){
        System.out.println("");
        System.out.print(" Total : " + booked);
        int availableRoom = quadRoom.emptyRoom();
        if(availableRoom <= 0){
            System.out.println("Sorry,single room is Unavailable");
        }else if (booked > 10){
            System.out.println("You can't booked");
        }else{
            quadRoom.maxrooms--;
            quadRoom.emptyRoom();
        }
    }

    public void checkInSuiteRoom(){
        System.out.println("");
        System.out.print(" Total : " + booked);
        int availableRoom = suiteRoom.emptyRoom();
        if(availableRoom <= 0){
            System.out.println("Sorry,single room is Unavailable");
        }else if (booked > 10){
            System.out.println("You can't booked");
        }else{
            suiteRoom.maxrooms--;
            suiteRoom.emptyRoom();
        }
    }
    
    @Override
    public String toString() {
        return "BookedRoom :" + "nameCustomer =" + nameCustomer + "rooms =" + rooms + "booked =" + booked + "singleRoom =" + singleRoom + "doubleRoom =" + doubleRoom + "quadRoom =" + quadRoom + "suiteRoom =" + suiteRoom ;
    }       

}
