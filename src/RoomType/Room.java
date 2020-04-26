package RoomType;

import DetailsOfBooked.KeycardStatus;
import Hotel.PricePerRoom;
import RoomType.TypeOfRoom;
import java.time.LocalDate;
import Hotel.BookedRoom;
        
public class Room extends BookedRoom{
    private SingleRoom singleRoom;
    private DoubleRoom doubleRoom;
    private QuadRoom quadRoom;
    private SuiteRoom suiteRoom;    
    

    public Room() {
    }

    public SingleRoom getSingleRoom() {
        return singleRoom;
    }

    public DoubleRoom getDoubleRoom() {
        return doubleRoom;
    }

    public QuadRoom getQuadRoom() {
        return quadRoom;
    }

    public SuiteRoom getSuiteRoom() {
        return suiteRoom;
    }

    public void setSingleRoom(SingleRoom singleRoom) {
        this.singleRoom = singleRoom;
    }

    public void setDoubleRoom(DoubleRoom doubleRoom) {
        this.doubleRoom = doubleRoom;
    }

    public void setQuadRoom(QuadRoom quadRoom) {
        this.quadRoom = quadRoom;
    }

    public void setSuiteRoom(SuiteRoom suiteRoom) {
        this.suiteRoom = suiteRoom;
    }

    public int getTotal() {
        return countRooms;
    }

    public void setTotal(int total) {
        this.total = total;
    }
  
    @Override
    public String toString() {
        return "Room{" + "singleRoom=" + singleRoom + ", doubleRoom=" + doubleRoom + ", quadRoom=" + quadRoom + ", suiteRoom=" + suiteRoom + '}';
    }
}
